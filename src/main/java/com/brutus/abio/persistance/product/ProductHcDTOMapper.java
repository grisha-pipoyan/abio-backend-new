package com.brutus.abio.persistance.product;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductHcDTOMapper implements Function<Product, ProductHcDTO> {
    @Override
    public ProductHcDTO apply(Product product) {
        return new ProductHcDTO(
                product.getProductCode(),
                product.getName(),
                product.getQuantity(),
                product.getPrice(),
                product.getDiscount(),
                product.getDiscountPrice()
        );
    }
}
