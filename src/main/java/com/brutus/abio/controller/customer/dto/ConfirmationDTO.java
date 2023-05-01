package com.brutus.abio.controller.customer.dto;

import com.brutus.abio.controller.admin.dto.OrderDetailsDTO;
import com.brutus.abio.controller.bank.dto.IdramDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmationDTO {
    private OrderDetailsDTO orderDetailsDTO;
    private IdramDTO idramDTO;
    private CartDTO cartDTO;
}