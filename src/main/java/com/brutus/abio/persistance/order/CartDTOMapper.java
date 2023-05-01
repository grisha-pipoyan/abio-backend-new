package com.brutus.abio.persistance.order;

import com.brutus.abio.controller.customer.dto.CartDTO;
import com.brutus.abio.controller.customer.dto.CartProductDTO;
import com.brutus.abio.persistance.product.Product;
import com.brutus.abio.persistance.promocode.PromoCode;
import com.brutus.abio.persistance.promocode.PromoCodeType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

        if (promoCode == null) {
            return cartDTO;
        } else {
            return getCartInfoIfPromoCodeExists(promoCode, cartDTO);
        }
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
                model.setTotalNormalPrice(productTotalNormalPrice);

                // Get product discount price if exists
                if (product.hasDiscount()) {
                    BigDecimal productTotalDiscountPrice = product.getDiscountPrice().multiply(new BigDecimal(cartItem.getQuantity()));
                    model.setTotalDiscountPrice(productTotalDiscountPrice);
                } else {
                    model.setTotalDiscountPrice(productTotalNormalPrice);
                }

                globalNormalPrice = globalNormalPrice.add(model.getTotalNormalPrice());
                globalDiscountPrice = globalDiscountPrice.add(model.getTotalDiscountPrice());

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

    private CartDTO getCartInfoIfPromoCodeExists(PromoCode promoCode, CartDTO cartDTO) {

        

        if (promoCode.getPromoCodeType().compareTo(PromoCodeType.VALIDITY_PERIOD) == 0
                && promoCode.isValidNow() && !promoCode.isExhausted()) {

            // Starting new calculation

            List<CartProductDTO> cartProductDTOList = cartDTO.getCartProductDTOList();

            for (CartProductDTO product :
                    cartProductDTOList) {

                product.setPromocode(promoCode.getCode());

                // calculating promocode discount

                BigDecimal promoCodeDiscount = promoCode.getDiscount();

                BigDecimal totalNormalPrice = product.getTotalNormalPrice();

                if (promoCodeDiscount.compareTo(BigDecimal.ONE) > 0) {
                    // Promo code discount is a value
                    BigDecimal totalDiscountPrice = totalNormalPrice.subtract(
                            promoCodeDiscount.multiply(new BigDecimal(product.getQuantity())));

                    product.setTotalDiscountPrice(totalDiscountPrice);

                } else {
                    // Promo code discount is a percentage
                    BigDecimal discount = totalNormalPrice.multiply(promoCodeDiscount);
                    BigDecimal totalDiscountPrice = totalNormalPrice.subtract(discount);

                    product.setTotalDiscountPrice(totalDiscountPrice);
                }
            }

            // Calculating global price
            BigDecimal globalNormalPrice = BigDecimal.ZERO;
            BigDecimal globalDiscountPrice = BigDecimal.ZERO;

            for (CartProductDTO model :
                    cartProductDTOList) {
                globalNormalPrice = globalNormalPrice.add(model.getTotalNormalPrice());
                if (model.hasDiscount()) {
                    globalDiscountPrice = globalDiscountPrice.add(model.getTotalDiscountPrice());
                } else {
                    globalDiscountPrice = globalDiscountPrice.add(model.getTotalNormalPrice());
                }
            }

            cartDTO.setGlobalNormalPrice(globalNormalPrice);
            cartDTO.setGlobalDiscountPrice(globalDiscountPrice);

            cartDTO.setGlobalPrice(globalDiscountPrice.add(cartDTO.getDeliveryPrice()));

//            if (globalDiscountPrice.compareTo(BigDecimal.ZERO) > 0 &&
//                    globalDiscountPrice.compareTo(globalNormalPrice) < 0) {
//                cartInfoModel.setGlobalPrice(globalDiscountPrice.add(cartInfoModel.getDeliveryPrice()));
//            } else {
//                cartInfoModel.setGlobalPrice(globalNormalPrice.add(cartInfoModel.getDeliveryPrice()));
//            }

        }
        else if (promoCode.getPromoCodeType().compareTo(PromoCodeType.CERTAIN_PRODUCT) == 0
                && promoCode.isValidNow() && !promoCode.isExhausted()) {

            // Starting new calculation

            List<CartProductDTO> cartProductDTOList = cartDTO.getCartProductDTOList();

            for (CartProductDTO product :
                    cartProductDTOList) {

                if (!promoCode.getProductCodes().contains(product.getProductCode())) {
                    continue;
                }

                product.setPromocode(promoCode.getCode());

                // calculating promocode discount

                BigDecimal promoCodeDiscount = promoCode.getDiscount();

                BigDecimal totalNormalPrice = product.getTotalNormalPrice();

                if (promoCodeDiscount.compareTo(BigDecimal.ONE) > 0) {
                    // Promo code discount is a value
                    BigDecimal totalDiscountPrice = totalNormalPrice.subtract(
                            promoCodeDiscount.multiply(new BigDecimal(product.getQuantity())));

                    product.setTotalDiscountPrice(totalDiscountPrice);

                } else {
                    // Promo code discount is a percentage
                    BigDecimal discount = totalNormalPrice.multiply(promoCodeDiscount);
                    BigDecimal totalDiscountPrice = totalNormalPrice.subtract(discount);

                    product.setTotalDiscountPrice(totalDiscountPrice);
                }
            }

            // Calculating global price
            BigDecimal globalNormalPrice = BigDecimal.ZERO;
            BigDecimal globalDiscountPrice = BigDecimal.ZERO;

            for (CartProductDTO model :
                    cartProductDTOList) {
                globalNormalPrice = globalNormalPrice.add(model.getTotalNormalPrice());
                if (model.hasDiscount()) {
                    globalDiscountPrice = globalDiscountPrice.add(model.getTotalDiscountPrice());
                } else {
                    globalDiscountPrice = globalDiscountPrice.add(model.getTotalNormalPrice());
                }
            }

            cartDTO.setGlobalNormalPrice(globalNormalPrice);
            cartDTO.setGlobalDiscountPrice(globalDiscountPrice);

            cartDTO.setGlobalPrice(globalDiscountPrice.add(cartDTO.getDeliveryPrice()));

//            if (globalDiscountPrice.compareTo(BigDecimal.ZERO) > 0 &&
//                    globalDiscountPrice.compareTo(globalNormalPrice) < 0) {
//                cartInfoModel.setGlobalPrice(globalDiscountPrice.add(cartInfoModel.getDeliveryPrice()));
//            } else {
//                cartInfoModel.setGlobalPrice(globalNormalPrice.add(cartInfoModel.getDeliveryPrice()));
//            }

        }

        return cartDTO;
    }


}
