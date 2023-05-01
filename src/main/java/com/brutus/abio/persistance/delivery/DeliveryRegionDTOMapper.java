package com.brutus.abio.persistance.delivery;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DeliveryRegionDTOMapper implements Function<DeliveryRegion, DeliveryRegionDTO> {
    @Override
    public DeliveryRegionDTO apply(DeliveryRegion deliveryRegion) {
        return new DeliveryRegionDTO(
                deliveryRegion.getId(),
                deliveryRegion.getName_en(),
                deliveryRegion.getName_ru(),
                deliveryRegion.getName_am(),
                deliveryRegion.getPrice(),
                deliveryRegion.getCurrencyType(),
                deliveryRegion.getBulky()
        );
    }
}
