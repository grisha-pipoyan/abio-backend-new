package com.brutus.abio.controller.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorizationDTO {

    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String address;
    private String date;
    private String time;
    private String comment;
}
