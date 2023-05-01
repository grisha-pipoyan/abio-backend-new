package com.brutus.abio.persistance.product;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long Id;

    // հծ
    @Column(unique = true)
    private String productCode;
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;

    private String name_en;
    private String name_ru;
    private String name_am;

    private String title_en;
    private String title_ru;
    private String title_am;

    @Column(columnDefinition = "TEXT")
    private String description_en;
    @Column(columnDefinition = "TEXT")
    private String description_ru;
    @Column(columnDefinition = "TEXT")
    private String description_am;

    private Long category1;
    private Long category2;
    private Long category3;

    private ColorEnum color;

    private String dimensions_en;
    private String dimensions_ru;
    private String dimensions_am;

    private Integer bulky;

    private Boolean enabled;
    private Boolean hasPictures;

    @ElementCollection
    private List<String> picturePaths = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return Id != null && Objects.equals(Id, product.Id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


    public boolean hasDiscount() {
        return discountPrice.compareTo(BigDecimal.ZERO) != 0;
    }

}
