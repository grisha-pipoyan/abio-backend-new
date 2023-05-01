package com.brutus.abio.service;

import com.brutus.abio.controller.bank.dto.IdramDTO;
import com.brutus.abio.controller.customer.dto.CartDTO;
import com.brutus.abio.persistance.order.OrderDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class IdramService {

    @Value("${idram.secret.key}")
    private String SECRET_KEY;

    @Value("${idram.edp.rec.account}")
    private String EDP_REC_ACCOUNT;

    public String getSECRET_KEY() {
        return SECRET_KEY;
    }

    public String getEDP_REC_ACCOUNT() {
        return EDP_REC_ACCOUNT;
    }

    public IdramDTO getIdramModel(OrderDetails orderDetails, CartDTO cartDTO) {

        IdramDTO idramDTO = new IdramDTO();
        idramDTO.setEDP_REC_ACCOUNT(EDP_REC_ACCOUNT);
        idramDTO.setEDP_DESCRIPTION("");
        idramDTO.setEDP_BILL_NO(orderDetails.getId());
        idramDTO.setEDP_EMAIL(orderDetails.getCustomer().getEmail());
        idramDTO.setEDP_AMOUNT(cartDTO.getGlobalPrice());

        return idramDTO;
    }
}
