package com.brutus.abio.controller.customer;

import com.brutus.abio.auth.AuthenticationService;
import com.brutus.abio.controller.customer.dto.AuthorizationDTO;
import com.brutus.abio.controller.customer.dto.CartDTO;
import com.brutus.abio.controller.customer.dto.ConfirmationDTO;
import com.brutus.abio.persistance.delivery.DeliveryRegion;
import com.brutus.abio.persistance.order.*;
import com.brutus.abio.service.EmailService;
import com.brutus.abio.service.IdramService;
import com.brutus.abio.service.ShoppingCartService;
import com.brutus.abio.utils.ShoppingCartUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

import static com.brutus.abio.utils.HeaderUtils.*;

@RestController
@RequestMapping("/abio/public/cart")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "https://xn--z9afn3dyad4d.xn--y9a3aq/", "https://xn--z9afn3dyad4d.xn--y9a3aq"},
        exposedHeaders = {CART_ID, ORDER_ID, JWT_TOKEN}
)
public class ShoppingCartController {

    private final ShoppingCartService cartService;
    private final IdramService idramService;
    private final AuthenticationService authenticationService;
    private final CartDTOMapper cartDTOMapper;
    private final OrderDetailsDTOMapper orderDetailsDTOMapper;
    private final EmailService emailService;

    @PostMapping("/create")
    public ResponseEntity<CartDTO> createCart(@RequestHeader(value = CART_ID, required = false) String cartIdHeader,
                                              HttpServletResponse response) {

        UUID cartId;
        if (cartIdHeader == null) {
            cartId = cartService.createCart().getId();
        } else {
            cartId = UUID.fromString(cartIdHeader);
        }

        Cart cart = cartService.findById(cartId);
        CartDTO cartDTO = cartDTOMapper.apply(cart);

        // Update the cart ID in header
        response.addHeader(CART_ID, cartId.toString());

        return ResponseEntity.ok(cartDTO);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<CartDTO> addProductToCart(@RequestHeader(value = CART_ID) String cartIdHeader,
                                                    @RequestParam String productCode,
                                                    @RequestParam Integer quantity) {

        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);

        cartService.addProductToCart(cart, productCode, quantity);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        return ResponseEntity.ok(cartDTO);
    }

    @PostMapping("/updateProduct")
    public ResponseEntity<CartDTO> updateProductFromCart(@RequestHeader(CART_ID) String cartIdHeader,
                                                         @RequestParam String productCode,
                                                         @RequestParam Integer quantity) {

        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);
        cartService.updateProduct(cart, productCode, quantity);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        return ResponseEntity.ok(cartDTO);
    }

    @PostMapping("/deleteProduct")
    public ResponseEntity<CartDTO> deleteProductFromCart(@RequestHeader(CART_ID) String cartIdHeader,
                                                         @RequestParam String productCode) {

        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);
        cartService.deleteProduct(cart, productCode);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        return ResponseEntity.ok(cartDTO);
    }

    @GetMapping("/getDeliveryRegions")
    public ResponseEntity<List<DeliveryRegion>> getDeliveryRegionByCart(@RequestHeader(CART_ID) String cartIdHeader) {
        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);

        List<DeliveryRegion> deliveryRegions = cartService.getDeliveryRegions(cart);

        return ResponseEntity.ok(deliveryRegions);
    }

    @PostMapping("/addDeliveryRegion")
    public ResponseEntity<CartDTO> addDeliveryRegionToCart(@RequestHeader(CART_ID) String cartIdHeader,
                                                           @RequestParam Long deliveryRegionId) {

        UUID cartId = UUID.fromString(cartIdHeader);
        Cart cart = cartService.findById(cartId);
        cartService.addDeliveryRegionToCart(cart, deliveryRegionId);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        return ResponseEntity.ok(cartDTO);
    }

    @PostMapping("/applyPromocode")
    public ResponseEntity<CartDTO> applyPromoCode(@RequestHeader(CART_ID) String cartIdHeader,
                                                  @RequestParam String promoCode) {

        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);
        cartService.applyPromoCode(cart, promoCode);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        return ResponseEntity.ok(cartDTO);
    }

    @PostMapping("/removePromocode")
    public ResponseEntity<CartDTO> removePromCode(@RequestHeader(CART_ID) String cartIdHeader,
                                                  @RequestParam String promoCode) {

        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);
        cartService.removePromoCode(cart, promoCode);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        return ResponseEntity.ok(cartDTO);
    }

    @PostMapping("/user/initiate")
    public ResponseEntity<CartDTO> initiate(@RequestHeader(CART_ID) String cartIdHeader,
                                            @Valid @RequestBody AuthorizationDTO model,
                                            HttpServletResponse response) {

        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);
        OrderDetails orderDetails = cartService.createOrder(cart, model);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        // Set the order ID in a header
        response.addHeader(ORDER_ID, orderDetails.getId());

        // Set jwtToken in a header
        String jwtToken = authenticationService.createJwtToken(orderDetails);
        response.addHeader(JWT_TOKEN, jwtToken);

        return ResponseEntity.ok(cartDTO);
    }

    @PostMapping("/confirm")
    public ResponseEntity<ConfirmationDTO> confirmOrder(@RequestHeader(CART_ID) String cartIdHeader,
                                                        @RequestHeader(ORDER_ID) String orderIdHeader,
                                                        @RequestHeader(JWT_TOKEN) String jwtToken,
                                                        @RequestParam PaymentType paymentType) {

        UUID cartId = UUID.fromString(cartIdHeader);
        Cart cart = cartService.findById(cartId);
        OrderDetails orderDetails = cartService.findOrderById(orderIdHeader);

        Jwt jwt = authenticationService.decodeJwtToken(jwtToken);

        ShoppingCartUtils.validate(orderDetails, cart, jwt);

        orderDetails.setPaymentType(paymentType);
        cartService.updateOrderDetails(orderDetails);

        // Getting ready to send response
        ConfirmationDTO confirmationDTO = new ConfirmationDTO();

        CartDTO cartDTO = cartDTOMapper.apply(cart);
        confirmationDTO.setCartDTO(cartDTO);

        Customer customer = orderDetails.getCustomer();

        switch (paymentType) {
            case CASH: {
                orderDetails.setIsConfirmed(true);
                cartService.updateOrderDetails(orderDetails);
                confirmationDTO.setOrderDetailsDTO(orderDetailsDTOMapper.apply(orderDetails));

                // Send confirmation to email
                String to = customer.getEmail();
                String username = customer.getFirst_name() + " " + customer.getLast_name();

                // TODO: 3/25/2023
                //emailService.sendOrderConfirmationEmail(to, username, cartInfoModel);
                break;
            }
            case IDRAM:
                confirmationDTO.setIdramDTO(idramService.getIdramModel(orderDetails, cartDTO));
                break;
            case BANK: {
                // TODO: 3/6/2023
                break;
            }
        }

        return ResponseEntity.ok(confirmationDTO);
    }

    @GetMapping("/getCart")
    public ResponseEntity<CartDTO> getProductsInCartByCookies(@RequestHeader(value = CART_ID, required = false) String cartIdHeader) {

        if (cartIdHeader == null) {
            return ResponseEntity.ok().build();
        }

        UUID cartId = UUID.fromString(cartIdHeader);

        Cart cart = cartService.findById(cartId);

        CartDTO cartDTO = cartDTOMapper.apply(cart);

        return ResponseEntity.ok(cartDTO);
    }


}
