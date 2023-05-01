package com.brutus.abio.persistance.order;

import com.brutus.abio.persistance.product.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Integer quantity;

    @JsonIgnoreProperties(value = "quantity")
    @OneToOne
    private Product product;

}
