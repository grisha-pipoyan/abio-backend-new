package com.brutus.abio.persistance.order;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Embeddable
@Data
public class Customer {
    @NotNull(message = "name is mandatory!")
    //@Pattern(regexp = "[a-zA-Z]{2,25}", message = "Name length must be min 2 and max 25 characters only!")
    private String first_name;

    @NotNull(message = "name is mandatory!")
    //@Pattern(regexp = "[a-zA-Z]{2,25}", message = "Name length must be min 2 and max 25 characters only!")
    private String last_name;

    @NotNull(message = "email is mandatory!")
    @Email(message = "email must be in proper format!")
    private String email;

    @NotNull(message = "phone number is mandatory!")
    //@Pattern(regexp="[6-9]{1}[0-9]{9}", message = "Mobile must be 10 digits a valid number!")
    private String mobileNo;
}
