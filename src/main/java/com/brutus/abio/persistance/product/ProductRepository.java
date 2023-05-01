package com.brutus.abio.persistance.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findProductByProductCodeEquals(String productCode);

    List<Product> findAllByHasPicturesEquals(Boolean has);

    @Query("SELECT e FROM Product e WHERE CAST(e.productCode as string) LIKE '8888%' ")
    List<Product> findAllGiftCardProducts();

    @Query("SELECT e FROM Product e WHERE CAST(e.productCode as string) LIKE '7777%' ")
    List<Product> findAllServiceProducts();

    @Query("SELECT p FROM Product p WHERE NOT (CAST(p.productCode as string) LIKE '7777%' " +
            "OR CAST(p.productCode as string) LIKE '8888%')")
    List<Product> findAllProductsNotStartingWith7777Or8888();

    // description
    @Query("SELECT p FROM Product p WHERE " +
            "p.description_en IS NOT NULL AND p.description_en != '' AND " +
            "p.description_ru IS NOT NULL AND p.description_ru != '' AND " +
            "p.description_am IS NOT NULL AND p.description_am != ''")
    List<Product> findAllProductsWithDescriptions();

    @Query("SELECT p FROM Product p WHERE " +
            "p.description_en IS NULL OR p.description_en = '' OR " +
            "p.description_ru IS NULL OR p.description_ru = '' OR " +
            "p.description_am IS NULL OR p.description_am = ''")
    List<Product> findAllProductsWithEmptyDescriptions();


    // name query
    @Query("SELECT p FROM Product p WHERE (LOWER(p.name_en) LIKE %:searchString% " +
            "OR LOWER(p.name_ru) LIKE %:searchString% " +
            "OR LOWER(p.name_am) LIKE %:searchString%)")
    List<Product> findProductsByNameContaining(@Param("searchString") String searchString);


    // product code
    @Query("SELECT p FROM Product p WHERE CAST(p.productCode as string) LIKE %:searchString% ")
    List<Product> findProductByProductCodeContaining(@Param("searchString") String searchString);


    // filter
    @Query("SELECT p from Product p where" +
            "(p.category1 = ?1 or ?1 is null)" +
            "and (p.category2 = ?2 or ?2 is null)" +
            "and (p.category3 = ?3 or ?3 is null)" +
            "and (p.color = ?4 or ?4 is null)" +
            "and (p.price>=?5 and p.price<=?6)")
    List<Product> findProductByFilter(Long category1Key,
                                      Long category2Key,
                                      Long category3Key,
                                      ColorEnum color,
                                      BigDecimal minPrice,
                                      BigDecimal maxPrice);

    @Query("SELECT COUNT(p) FROM Product p WHERE p.hasPictures = true")
    Long totalQuantity();
}
