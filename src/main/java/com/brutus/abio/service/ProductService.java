package com.brutus.abio.service;

import com.brutus.abio.controller.admin.dto.PictureDTO;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.exception.ConflictException;
import com.brutus.abio.exception.NotFoundException;
import com.brutus.abio.persistance.product.*;
import com.brutus.abio.utils.HCUtils;
import com.brutus.abio.utils.Language;
import eu.europa.esig.dss.utils.Utils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final FileService fileService;
    private final ProductRepository productRepository;
    private final ProductHcDTOMapper productHcDTOMapper;
    private final ProductDTOMapper productDTOMapper;
    private final ProductCsvDTOMapper productCsvDTOMapper;

    public Product findByProductCode(String productCode) {
        return productRepository.findProductByProductCodeEquals(productCode).orElseThrow(
                () -> new NotFoundException(String.format("Product with code [%s] not found", productCode)));
    }

    public ProductHcDTO save(ProductHcDTO productHcDTO) {

        if (productRepository.findProductByProductCodeEquals(productHcDTO.getProductCode()).isPresent()) {
            throw new ConflictException(String.format("Product with code [%s] already exists",
                    productHcDTO.getProductCode()));
        }

        Product product = HCUtils.createHCModel(productHcDTO);
        productRepository.save(product);

        return productHcDTOMapper.apply(product);
    }

    public ProductHcDTO update(ProductHcDTO productHcDTO) {
        Product product = findByProductCode(productHcDTO.getProductCode());
        HCUtils.updateHCModel(product, productHcDTO);
        productRepository.save(product);

        return productHcDTOMapper.apply(product);
    }


    /**
     * Adds pictures to all products
     *
     * @param pictureDTO model
     */
    public void addPictures(List<PictureDTO> pictureDTO) {

        for (PictureDTO pModel :
                pictureDTO) {

            String[] parts = pModel.getName().split("_");
            String picName = parts[1];
            String productCodeString = parts[0];

            Product product = findByProductCode(parts[0]);
            List<String> picturePaths = product.getPicturePaths();

            byte[] bytes = Utils.fromBase64(pModel.getBase64Picture());

            fileService.saveFile(productCodeString, picName, bytes);

            if (!picturePaths.contains(picName)) {
                picturePaths.add(picName);
            }

            product.setPicturePaths(picturePaths);

            product.setHasPictures(true);
            productRepository.save(product);

        }
    }

    public ProductDTO getProductByCode(String productCode, Language language) {
        return productDTOMapper.apply(findByProductCode(productCode), language);
    }

    public Long getTotalQuantity() {
        return productRepository.totalQuantity();
    }

    public ByteArrayResource getPicture(String productCode, String fileName) {
        return new ByteArrayResource(fileService.getPicture(productCode, fileName));
    }

    public List<ProductDTO> filter(String category1, String category2, String category3,
                                   String color, BigDecimal minPrice, BigDecimal maxPrice, Language language) {


        ColorEnum colorEnum = null;
        switch (language) {
            case EN:
                colorEnum = ColorEnum.forEnglish(color);
                break;
            case RU:
                colorEnum = ColorEnum.forRussian(color);
                break;
            case AM:
                colorEnum = ColorEnum.forArmenian(color);
                break;
        }

        if (minPrice == null) {
            minPrice = BigDecimal.ZERO;
        }

        if (maxPrice == null) {
            maxPrice = BigDecimal.valueOf(100000L);
        }

        Long category1Key = null;
        Long category2Key = null;
        Long category3Key = null;

        if (category1 != null) {
            String keyByValue = productDTOMapper.findKeyByValue(category1);
            if (keyByValue == null) {
                throw new BadRequestException(String.format("Can not load property with name %s: ", category1));
            }
            category1Key = Long.valueOf(deleteLastCharacter(keyByValue));
        }

        if (category2 != null) {
            String keyByValue = productDTOMapper.findKeyByValue(category2);
            if (keyByValue == null) {
                throw new BadRequestException(String.format("Can not load property with name %s: ", category2));
            }
            category2Key = Long.valueOf(deleteLastCharacter(keyByValue));
        }

        if (category3 != null) {
            String keyByValue = productDTOMapper.findKeyByValue(category3);
            if (keyByValue == null) {
                throw new BadRequestException(String.format("Can not load property with name %s: ", category3));
            }
            category3Key = Long.valueOf(deleteLastCharacter(keyByValue));
        }

        List<Product> productByFilter = productRepository
                .findProductByFilter(category1Key, category2Key, category3Key, colorEnum, minPrice, maxPrice);

        return productByFilter.stream().map(product -> productDTOMapper.apply(product, language)).collect(Collectors.toList());
    }

    private String deleteLastCharacter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, input.length() - 1);
    }


    /**
     * Update products
     *
     * @param globalList global list models
     */
    public void update(List<ProductCsvDTO> globalList) {

        for (ProductCsvDTO global :
                globalList) {
            update(new ProductAdminDTO(global.getProductCode(), global.getName_en(), global.getName_ru(), global.getName_am(),
                    global.getTitle_en(), global.getTitle_ru(), global.getTitle_am(),
                    global.getDescription_en(), global.getDescription_ru(), global.getDescription_am(),
                    global.getCategory1(), global.getCategory2(), global.getCategory3(),
                    global.getColor(), global.getDimensions_en(), global.getDimensions_ru(), global.getDimensions_am(),
                    global.getBulky(), global.getEnabled(), global.getHasPictures()));
        }
    }


    /**
     * Update product
     *
     * @param productAdminDTO productAdminDTO
     */
    public void update(ProductAdminDTO productAdminDTO) {

        String productCode = productAdminDTO.getProductCode();
        boolean isService = productCode.startsWith("7777");
        boolean isGiftCard = productCode.startsWith("8888");

        Product product = findByProductCode(productCode);

        product.setTitle_en(productAdminDTO.getTitle_en());
        product.setTitle_ru(productAdminDTO.getTitle_ru());
        product.setTitle_am(productAdminDTO.getTitle_am());

        product.setDescription_en(productAdminDTO.getDescription_en());
        product.setDescription_ru(productAdminDTO.getDescription_ru());
        product.setDescription_am(productAdminDTO.getDescription_am());

        if (product.getPicturePaths() != null) {
            product.setHasPictures(product.getPicturePaths().size() > 0);
        }

        if (productAdminDTO.getEnabled() == null) {
            product.setEnabled(false);
        } else {
            product.setEnabled(productAdminDTO.getEnabled());
        }

        if (isService || isGiftCard) {
            productRepository.save(product);
        } else {
            product.setName_en(productAdminDTO.getName_en());
            product.setName_ru(productAdminDTO.getName_ru());
            product.setName_am(productAdminDTO.getName_am());

            product.setCategory1(productAdminDTO.getCategory1());
            product.setCategory2(productAdminDTO.getCategory2());
            product.setCategory3(productAdminDTO.getCategory3());

            product.setColor(ColorEnum.forEnglish(productAdminDTO.getColor()));

            product.setDimensions_en(productAdminDTO.getDimensions_en());
            product.setDimensions_ru(productAdminDTO.getDimensions_ru());
            product.setDimensions_am(productAdminDTO.getDimensions_am());

            if (productAdminDTO.getBulky() == null) {
                product.setBulky(0);
            } else {
                product.setBulky(productAdminDTO.getBulky());
            }

            productRepository.save(product);
        }

    }


    /**
     * Get all products
     *
     * @param language Language
     * @return List of products
     */
    public List<ProductDTO> getAllProducts(Language language, boolean isService, boolean isGiftCard) {

        List<Product> all;

        if (isService) {
            all = productRepository.findAllServiceProducts();
        } else if (isGiftCard) {
            all = productRepository.findAllGiftCardProducts();
        } else {
            all = productRepository.findAllProductsNotStartingWith7777Or8888();
        }

        all.sort(Comparator.comparing(Product::getId).reversed());

        List<Product> collect = all.stream().filter(product -> product.getHasPictures() && product.getEnabled()).collect(Collectors.toList());

        return collect.stream().map(product -> productDTOMapper.apply(product, language)).collect(Collectors.toList());
    }

    public List<ProductDTO> getRecommendedProducts(Language language, boolean isService, boolean isGiftCard) {
        List<Product> all;

        if (isService) {
            all = productRepository.findAllServiceProducts();
        } else if (isGiftCard) {
            all = productRepository.findAllGiftCardProducts();
        } else {
            all = productRepository.findAllProductsNotStartingWith7777Or8888();
        }

        List<Product> collect = all.stream().filter(Product::hasDiscount).sorted(Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());

        List<Product> newCollection = collect.stream().filter(product -> product.getHasPictures() && product.getEnabled()).collect(Collectors.toList());

        return newCollection.stream().map(product -> productDTOMapper.apply(product, language)).collect(Collectors.toList());

    }


    /**
     * CSV
     */

    /**
     * Get all products
     *
     * @return List of products
     */
    public List<ProductCsvDTO> getAllProducts() {

        List<Product> all = productRepository.findAll();

        all.sort(Comparator.comparing(Product::getId).reversed());

        return all.stream().map(productCsvDTOMapper).collect(Collectors.toList());
    }


    private enum Action {
        less, more, equal, equal_less, equal_more, between
    }

    public List<ProductCsvDTO> getProductsByQuantityEquals(String query) {

        // validate query
        // ">x, <x, =x, >=x, <=x, x-y"
        int x;
        int y = 0;

        Action action = null;
        Pattern pattern = Pattern.compile("^(=|<|>|<=|>=)?(\\d+)?(-)?(\\d+)?$");
        Matcher matcher = pattern.matcher(query);
        if (matcher.matches()) {
            String symbol = matcher.group(1);
            String firstNumber = matcher.group(2);
            String rangeSeparator = matcher.group(3);
            String secondNumber = matcher.group(4);
            if (symbol != null && !symbol.isEmpty()) {
                switch (symbol) {
                    case "<":
                        action = Action.less;
                        break;
                    case "<=":
                        action = Action.equal_less;
                        break;
                    case ">":
                        action = Action.more;
                        break;
                    case ">=":
                        action = Action.equal_more;
                        break;
                    case "=":
                        action = Action.equal;
                        break;
                }
            }
            if (firstNumber != null && !firstNumber.isEmpty()) {
                x = Integer.parseInt(firstNumber);
            } else {
                x = 0;
            }
            if (secondNumber != null && !secondNumber.isEmpty()) {
                y = Integer.parseInt(secondNumber);
                action = Action.between;
            }
        } else {
            x = 0;
        }

        if (action == null) {
            throw new BadRequestException("Bad action" + query + " >x, <x, =x, >=x, <=x, x-y");
        }

        List<Product> all = productRepository.findAll();
        List<Product> products = new ArrayList<>();

        switch (action) {
            case less: {
                products = all.stream().filter(
                        product -> product.getQuantity() < x).sorted(
                        Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
                break;
            }
            case more: {
                products = all.stream().filter(
                        product -> product.getQuantity() > x).sorted(
                        Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
                break;
            }
            case equal_less: {
                products = all.stream().filter(
                        product -> product.getQuantity() <= x).sorted(
                        Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
                break;
            }
            case equal_more: {
                products = all.stream().filter(
                        product -> product.getQuantity() >= x).sorted(
                        Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
                break;
            }
            case equal: {
                products = all.stream().filter(
                        product -> product.getQuantity() == x).sorted(
                        Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
                break;
            }
            case between: {
                int finalY = y;
                products = all.stream().filter(
                        product -> product.getQuantity() > x && product.getQuantity() < finalY).sorted(
                        Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
                break;
            }
        }


        return products.stream().map(productCsvDTOMapper).collect(Collectors.toList());

    }

    public List<ProductCsvDTO> getProductsByDescription(Boolean has) {

        List<Product> all;

        if(has){
            all = productRepository.findAllProductsWithDescriptions();
        }else{
            all = productRepository.findAllProductsWithEmptyDescriptions();
        }

        all.sort(Comparator.comparing(Product::getId).reversed());

        return all.stream().map(productCsvDTOMapper).collect(Collectors.toList());
    }

    public List<ProductCsvDTO> getProductsByHavingPictures(Boolean has) {

        List<Product> all = productRepository.findAllByHasPicturesEquals(has);

        return all.stream().map(productCsvDTOMapper).collect(Collectors.toList());
    }

    public List<ProductCsvDTO> getByNameContaining(String searchString) {

        List<Product> all = productRepository.findProductsByNameContaining(searchString.toLowerCase());

        all.sort(Comparator.comparing(Product::getId).reversed());

        return all.stream().map(productCsvDTOMapper).collect(Collectors.toList());

    }

    public List<ProductCsvDTO> getProductByProductCode(String productCode) {
        List<Product> all = productRepository.findProductByProductCodeContaining(productCode);
//        if (type == 1) {
//            all = productRepository.findProductsStartingWith7777AndHavingProductCodeContaining(productCode);
//        } else if (type == 2) {
//            all = productRepository.findProductsStartingWith8888AndHavingProductCodeContaining(productCode);
//        } else {
//            all = productRepository.findAllProductsNotStartingWith7777Or8888AndProductCodeContaining(productCode);
//        }

        all.sort(Comparator.comparing(Product::getId).reversed());

        return all.stream().map(productCsvDTOMapper).collect(Collectors.toList());
    }

}
