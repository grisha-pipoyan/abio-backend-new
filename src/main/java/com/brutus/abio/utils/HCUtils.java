package com.brutus.abio.utils;

import com.brutus.abio.persistance.product.Product;
import com.brutus.abio.persistance.product.ProductHcDTO;

public class HCUtils {


    /**
     * Create HC Model
     *
     * @param productHCDto HC model
     */
    public static Product createHCModel(ProductHcDTO productHCDto) {

        String productCode = productHCDto.getProductCode();

        Product product = new Product();
        product.setProductCode(productCode);
        product.setName(productHCDto.getName());
        product.setQuantity(productHCDto.getQuantity());
        product.setPrice(productHCDto.getPrice());
        product.setDiscount(productHCDto.getDiscount());
        product.setDiscountPrice(productHCDto.getDiscountPrice());

        return product;
    }

    /**
     * Update Product
     *
     * @param productHCDto hc model
     */
    public static void updateHCModel(Product product, ProductHcDTO productHCDto) {
        product.setQuantity(productHCDto.getQuantity());
        product.setPrice(productHCDto.getPrice());
        product.setDiscount(productHCDto.getDiscount());
        product.setDiscountPrice(productHCDto.getDiscountPrice());
    }


}
