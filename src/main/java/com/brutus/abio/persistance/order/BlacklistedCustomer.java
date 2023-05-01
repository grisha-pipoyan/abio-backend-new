package com.brutus.abio.persistance.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.Email;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class BlacklistedCustomer {

    @javax.persistence.Id
    @GeneratedValue
    private Long Id;

    @Column(name = "customer_email", nullable = false, unique = true)
    @Email(message = "email must be in proper format!")
    private String email;

    @Column(name = "customer_phone_number", unique = true)
    private String phoneNumber;

    @Column(name = "reason", nullable = false)
    private String reason;

    @Column(name = "blacklisted_at", nullable = false)
    private String blacklistedAt;

}
