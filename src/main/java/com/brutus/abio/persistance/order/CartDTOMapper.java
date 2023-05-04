package com.brutus.abio.persistance.order;

import com.brutus.abio.controller.customer.dto.CartDTO;
import com.brutus.abio.controller.customer.dto.CartProductDTO;
import com.brutus.abio.persistance.product.Product;
import com.brutus.abio.persistance.promocode.PromoCode;
import com.brutus.abio.persistance.promocode.PromoCodeType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CartDTOMapper implements Function<Cart, CartDTO> {
    @Override
    public CartDTO apply(Cart cart) {
        PromoCode promoCode = cart.getPromoCode();
        CartDTO cartDTO = getNormalCartInfo(cart);
        if (promoCode != null) {
            applyValidityPeriodPromoCode(cartDTO, promoCode);
        }

        return cartDTO;
    }

    private void applyValidityPeriodPromoCode(CartDTO cartDTO, PromoCode promoCode) {

        BigDecimal cartDTOGlobalDiscountPrice = cartDTO.getGlobalDiscountPrice();

        // Check if cart total is greater than or equal to the promo code minimum purchase
        if (cartDTOGlobalDiscountPrice.compareTo(promoCode.getMinimumPurchase()) < 0) {
            return;
        }

        // Iterate over cart products to find products eligible for the promo code
        for (CartProductDTO cartProductDTO :
                cartDTO.getCartProductDTOList()) {

            // Check if the product's total discount price equals its total normal price
            if (cartProductDTO.getDiscountPrice().compareTo(cartProductDTO.getPrice()) == 0) {

                // Apply the promo code discount
                BigDecimal promoCodeDiscount = promoCode.getDiscount();

                if (promoCodeDiscount.compareTo(BigDecimal.ONE) < 0) {
                    // Promo code discount is a percentage
                    promoCodeDiscount = cartProductDTO.getPrice()
                            .multiply(promoCode.getDiscount())
                            .divide(new BigDecimal(100), RoundingMode.HALF_UP);
                }

                if (promoCode.isValidNow() && !promoCode.isExhausted()) {
                    if (promoCode.getPromoCodeType().compareTo(PromoCodeType.VALIDITY_PERIOD) == 0) {
                        cartProductDTO.setPromocode(promoCode.getCode());
                        BigDecimal newTotalDiscountPrice = cartProductDTO.getPrice().subtract(promoCodeDiscount);

                        cartProductDTO.setDiscountPrice(newTotalDiscountPrice);

                        cartDTOGlobalDiscountPrice = cartDTOGlobalDiscountPrice
                                .subtract(cartProductDTO.getPrice()).add(newTotalDiscountPrice);
                    } else if (promoCode.getPromoCodeType().compareTo(PromoCodeType.CERTAIN_PRODUCT) == 0) {

                        if (promoCode.getProductCodes().contains(cartProductDTO.getProductCode())) {
                            cartProductDTO.setPromocode(promoCode.getCode());
                            BigDecimal newTotalDiscountPrice = cartProductDTO.getPrice().subtract(promoCodeDiscount);

                            cartProductDTO.setDiscountPrice(newTotalDiscountPrice);

                            cartDTOGlobalDiscountPrice = cartDTOGlobalDiscountPrice
                                    .subtract(cartProductDTO.getPrice()).add(newTotalDiscountPrice);
                        }
                    }
                }
            }
        }

        cartDTO.setGlobalDiscountPrice(cartDTOGlobalDiscountPrice);
        cartDTO.setGlobalPrice(cartDTO.getGlobalDiscountPrice().add(cartDTO.getDeliveryPrice()));
    }

    private CartDTO getNormalCartInfo(Cart cart) {

        CartDTO cartDTO = new CartDTO();
        List<CartProductDTO> cartProductDTOS = new ArrayList<>();

        BigDecimal globalNormalPrice = BigDecimal.ZERO;
        BigDecimal globalDiscountPrice = BigDecimal.ZERO;
        BigDecimal deliverPrice = BigDecimal.ZERO;

        // Setting delivery price
        if (cart.getDeliveryRegion() != null) {
            deliverPrice = cart.getDeliveryRegion().getPrice();
        }

        if (cart.getCartItems() != null) {

            List<CartItem> cartItems = cart.getCartItems().stream().sorted(Comparator.comparing(
                    cartItem -> cartItem.getProduct().getId())).collect(Collectors.toList());

            for (CartItem cartItem :
                    cartItems) {

                // Setting products in cart info model
                CartProductDTO model = new CartProductDTO();

                Product product = cartItem.getProduct();
                Integer quantity = cartItem.getQuantity();

                model.setProductCode(product.getProductCode());
                model.setQuantity(quantity);

                // Get product normal price
                BigDecimal productTotalNormalPrice = product.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
                model.setPrice(productTotalNormalPrice);

                // Get product discount price if exists
                if (product.hasDiscount()) {
                    BigDecimal productTotalDiscountPrice = product.getDiscountPrice().multiply(new BigDecimal(cartItem.getQuantity()));
                    model.setDiscountPrice(productTotalDiscountPrice);
                } else {
                    model.setDiscountPrice(productTotalNormalPrice);
                }

                globalNormalPrice = globalNormalPrice.add(model.getPrice());
                globalDiscountPrice = globalDiscountPrice.add(model.getDiscountPrice());

                cartProductDTOS.add(model);
            }
        }

        cartDTO.setGlobalNormalPrice(globalNormalPrice);
        cartDTO.setGlobalDiscountPrice(globalDiscountPrice);
        cartDTO.setDeliveryPrice(deliverPrice);
        cartDTO.setCartProductDTOList(cartProductDTOS);

        cartDTO.setGlobalPrice(globalDiscountPrice.add(deliverPrice));

        return cartDTO;
    }

}
