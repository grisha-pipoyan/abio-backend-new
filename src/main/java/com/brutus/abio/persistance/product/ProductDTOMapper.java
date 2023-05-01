package com.brutus.abio.persistance.product;

import com.brutus.abio.utils.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

@Service
@RequiredArgsConstructor
public class ProductDTOMapper implements BiFunction<Product, Language, ProductDTO> {

    private final Map<String, String> propertiesMap;

    @Override
    public ProductDTO apply(Product pr, Language language) {

        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductCode(pr.getProductCode());

        switch (language) {
            case RU: {
                productDTO.setName(pr.getName_ru());
                productDTO.setTitle(pr.getTitle_ru());
                productDTO.setDescription(pr.getDescription_ru());

                // category
                productDTO.setCategory1(propertiesMap.get(pr.getCategory1() + "2"));
                productDTO.setCategory2(propertiesMap.get(pr.getCategory2() + "2"));
                productDTO.setCategory3(propertiesMap.get(pr.getCategory3() + "2"));

                if (pr.getColor() != null) {
                    productDTO.setColor(pr.getColor().getName_ru());
                }

                productDTO.setDimensions(pr.getDimensions_ru());
                break;
            }
            case AM: {
                productDTO.setName(pr.getName_am());
                productDTO.setTitle(pr.getTitle_am());
                productDTO.setDescription(pr.getDescription_am());

                // category
                productDTO.setCategory1(propertiesMap.get(pr.getCategory1() + "3"));
                productDTO.setCategory2(propertiesMap.get(pr.getCategory2() + "3"));
                productDTO.setCategory3(propertiesMap.get(pr.getCategory3() + "3"));

                if (pr.getColor() != null) {
                    productDTO.setColor(pr.getColor().getName_am());
                }

                productDTO.setDimensions(pr.getDimensions_am());
                break;
            }
            default: {
                productDTO.setName(pr.getName_en());
                productDTO.setTitle(pr.getTitle_en());
                productDTO.setDescription(pr.getDescription_en());

                // category
                productDTO.setCategory1(propertiesMap.get(pr.getCategory1() + "1"));
                productDTO.setCategory2(propertiesMap.get(pr.getCategory2() + "1"));
                productDTO.setCategory3(propertiesMap.get(pr.getCategory3() + "1"));

                if (pr.getColor() != null) {
                    productDTO.setColor(pr.getColor().getName_en());
                }

                productDTO.setDimensions(pr.getDimensions_en());
            }
        }


        productDTO.setQuantity(pr.getQuantity());
        productDTO.setInStock(pr.getQuantity() != 0);
        productDTO.setPrice(pr.getPrice());
        productDTO.setDiscount(pr.getDiscount());
        productDTO.setDiscountPrice(pr.getDiscountPrice());
        productDTO.setPictureIds(pr.getPicturePaths());

        return productDTO;

    }

    public String findKeyByValue(String value) {

        Set<String> keys = propertiesMap.keySet();
        for (String key : keys) {
            if (propertiesMap.get(key).equals(value)) {
                return key;
            }
        }
        return null;
    }
}
