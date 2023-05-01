package com.brutus.abio.persistance.order;

import com.brutus.abio.persistance.delivery.DeliveryRegion;
import com.brutus.abio.persistance.promocode.PromoCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

    @ManyToOne(cascade = CascadeType.ALL)
    private DeliveryRegion deliveryRegion;

    @ManyToOne(cascade = CascadeType.ALL)
    private PromoCode promoCode;

}
