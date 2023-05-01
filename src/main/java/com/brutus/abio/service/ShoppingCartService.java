package com.brutus.abio.service;

import com.brutus.abio.controller.customer.dto.AuthorizationDTO;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.exception.NotFoundException;
import com.brutus.abio.persistance.delivery.DeliveryRegion;
import com.brutus.abio.persistance.order.*;
import com.brutus.abio.persistance.product.Product;
import com.brutus.abio.persistance.promocode.PromoCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ShoppingCartService {

    private final CartRepository cartRepository;
    private final ProductService productService;
    private final DeliveryRegionService deliveryRegionService;
    private final OrderService orderService;
    private final BlacklistCustomerService blacklistCustomerService;
    private final PromoCodeService promoCodeService;

    /**
     * Creates new shopping cart
     *
     * @return shopping cart
     */
    public Cart createCart() {
        Cart cart = new Cart();
        cartRepository.save(cart);

        return cart;
    }

    /**
     * Finds shopping cart by id
     *
     * @param cartId cart id
     * @return shopping cart
     */
    public Cart findById(UUID cartId) {
        return cartRepository.findById(cartId).orElseThrow(
                () -> new NotFoundException(String.format("Cart with id %s not found", cartId)));
    }

    /**
     * Adds product to cart
     *
     * @param cart        shopping cart
     * @param productCode product code
     * @param quantity    quantity
     */
    public void addProductToCart(Cart cart, String productCode, Integer quantity) {

        List<CartItem> cartItems = cart.getCartItems();

        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }

        Product product = productService.findByProductCode(productCode);

        CartItem cartItem = findQuantityByProductCode(cartItems, productCode);

        if (cartItem != null) {
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
        } else {
            cartItem = new CartItem();
            cartItem.setProduct(product);
            cartItem.setQuantity(quantity);
            cartItems.add(cartItem);
        }

        if (cartItem.getQuantity() > product.getQuantity()) {
            throw new BadRequestException("Provided quantity is more than product quantity");
        }

        cart.setCartItems(cartItems);

        cartRepository.save(cart);
    }

    public CartItem findQuantityByProductCode(List<CartItem> cartItems, String productCode) {
        Optional<CartItem> first = cartItems.stream()
                .filter(cartItem -> cartItem.getProduct().getProductCode().equals(productCode))
                .findFirst();
        return first.orElse(null);
    }


    /**
     * Updates product in cart
     *
     * @param cart        shopping cart
     * @param productCode product code
     * @param quantity    quantity
     */
    public void updateProduct(Cart cart, String productCode, Integer quantity) {

        Product product = productService.findByProductCode(productCode);

        List<CartItem> cartItems = cart.getCartItems();
        cartItems.stream()
                .filter(cartItem -> cartItem.getProduct().getProductCode().equals(productCode)
                        && quantity <= product.getQuantity())
                .forEach(cartItem -> cartItem.setQuantity(quantity));

        cart.setCartItems(cartItems);

        cartRepository.save(cart);
    }

    /**
     * Delete product from shopping cart
     *
     * @param cart        shopping cart
     * @param productCode product code
     */
    public void deleteProduct(Cart cart, String productCode) {

        List<CartItem> cartItems = cart.getCartItems();

        List<CartItem> newList = cartItems.stream()
                .filter(element -> !Objects.equals(element.getProduct().getProductCode(), productCode))
                        .collect(Collectors.toList());


        cart.setCartItems(new ArrayList<>(newList));

        cartRepository.save(cart);
    }

    /**
     * Add delivery region to shopping cart
     *
     * @param cart             shopping cart
     * @param deliveryRegionId delivery region id
     */
    public void addDeliveryRegionToCart(Cart cart, Long deliveryRegionId) {

        DeliveryRegion deliveryRegion = deliveryRegionService.findById(deliveryRegionId);
        cart.setDeliveryRegion(deliveryRegion);

        cartRepository.save(cart);
    }

    /**
     * Get all possible delivery regions for shopping cart
     *
     * @param cart shopping cart
     * @return List of delivery regions
     */
    public List<DeliveryRegion> getDeliveryRegions(Cart cart) {

        int bulky = 0;

        for (CartItem cartItem :
                cart.getCartItems()) {
            if (cartItem.getProduct().getBulky() == null) {
                bulky += 0;
            } else {
                bulky += cartItem.getProduct().getBulky();
            }
        }

        if (bulky == 0) {
            return deliveryRegionService.getRegions(0);
        } else {
            return deliveryRegionService.getRegions(1);
        }
    }

    /**
     * Apply promo code to shopping cart
     *
     * @param cart            shopping cart
     * @param promoCodeString promo code
     */
    public void applyPromoCode(Cart cart, String promoCodeString) {

        PromoCode promoCode = promoCodeService.findByPromoCodeString(promoCodeString);

        // validate promocode
        if (promoCode.isExhausted()) {
            throw new BadRequestException("Invalid promocode");
        }

        if (!promoCode.isValidNow()) {
            throw new BadRequestException("Invalid promocode");
        }

        cart.setPromoCode(promoCode);

        cartRepository.save(cart);
    }

    /**
     * Remove promo code from shopping cart
     *
     * @param cart            shopping cart
     * @param promoCodeString promo code
     */
    public void removePromoCode(Cart cart, String promoCodeString) {

        promoCodeService.findByPromoCodeString(promoCodeString);

        cart.setPromoCode(null);

        cartRepository.save(cart);
    }

    /**
     * Create customer and apply cart
     *
     * @param cart  shopping cart
     * @param model authorization model
     * @return customer
     */
    public OrderDetails createOrder(Cart cart, AuthorizationDTO model) {

        if (blacklistCustomerService.isCustomerEmailInBlacklist(model.getEmail()) ||
                blacklistCustomerService.isCustomerNumberInBlackList(model.getPhone_number())) {
            throw new BadRequestException(String.format("User with email %s is in black list", model.getEmail()));
        }

        Customer customer = new Customer();
        customer.setFirst_name(model.getFirst_name());
        customer.setLast_name(model.getLast_name());
        customer.setEmail(model.getEmail());
        customer.setMobileNo(model.getPhone_number());

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrderDateTime(LocalDateTime.now());
        orderDetails.setAddress(model.getAddress());
        orderDetails.setDate(model.getDate());
        orderDetails.setTime(model.getTime());
        orderDetails.setComment(model.getComment());
        orderDetails.setPaymentStatus(PaymentStatus.NOT_PAYED);
        orderDetails.setIsConfirmed(false);

        orderDetails.setCustomer(customer);
        orderDetails.setCart(cart);

        orderService.save(orderDetails);

        return orderDetails;
    }

    public OrderDetails findOrderById(String orderId) {
        return orderService.findById(orderId);
    }

    public void updateOrderDetails(OrderDetails orderDetails) {
        orderService.save(orderDetails);
    }


}
