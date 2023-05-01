package com.brutus.abio.persistance.product;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductCsvDTOMapper implements Function<Product, ProductCsvDTO> {
    @Override
    public ProductCsvDTO apply(Product product) {
        ProductCsvDTO productCsvDTO = new ProductCsvDTO();
        productCsvDTO.setProductCode(product.getProductCode());
        productCsvDTO.setName(product.getName());
        productCsvDTO.setQuantity(product.getQuantity());
        productCsvDTO.setPrice(product.getPrice());
        productCsvDTO.setDiscount(product.getDiscount());
        productCsvDTO.setDiscountPrice(product.getDiscountPrice());

        productCsvDTO.setName_en(product.getName_en());
        productCsvDTO.setName_ru(product.getName_ru());
        productCsvDTO.setName_am(product.getName_am());

        productCsvDTO.setTitle_en(product.getTitle_en());
        productCsvDTO.setTitle_ru(product.getTitle_ru());
        productCsvDTO.setTitle_am(product.getTitle_am());

        productCsvDTO.setDescription_en(product.getDescription_en());
        productCsvDTO.setDescription_ru(product.getDescription_ru());
        productCsvDTO.setDescription_am(product.getDescription_am());

        productCsvDTO.setCategory1(product.getCategory1());
        productCsvDTO.setCategory2(product.getCategory2());
        productCsvDTO.setCategory3(product.getCategory3());

        if (product.getColor() != null) {
            productCsvDTO.setColor(product.getColor().getName_en());
        }

        productCsvDTO.setDimensions_en(product.getDimensions_en());
        productCsvDTO.setDimensions_ru(product.getDimensions_ru());
        productCsvDTO.setDimensions_am(product.getDimensions_am());

        productCsvDTO.setBulky(product.getBulky());
        productCsvDTO.setEnabled(product.getEnabled());
        productCsvDTO.setHasPictures(product.getHasPictures());

        return productCsvDTO;
    }
}
