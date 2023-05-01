package com.brutus.abio.persistance.order;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {

    @Id
    @GenericGenerator(name = "sequence_cart_id", strategy = "com.brutus.abio.persistance.order.ShortIdGenerator")
    @GeneratedValue(generator = "sequence_cart_id")
    private String Id;
    private LocalDateTime orderDateTime;

    @Column(columnDefinition = "TEXT")
    private String address;
    private String date;
    private String time;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Embedded
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    private Boolean isConfirmed;

    private String transactionId;

}
