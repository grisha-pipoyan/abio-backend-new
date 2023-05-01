package com.brutus.abio.service;

import com.brutus.abio.exception.NotFoundException;
import com.brutus.abio.persistance.delivery.DeliveryRegion;
import com.brutus.abio.persistance.delivery.DeliveryRegionDTO;
import com.brutus.abio.persistance.delivery.DeliveryRegionDTOMapper;
import com.brutus.abio.persistance.delivery.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeliveryRegionService {

    private final DeliveryRepository deliveryRepository;
    private final DeliveryRegionDTOMapper deliveryRegionDTOMapper;

    public DeliveryRegion findById(Long deliveryRegionId) {
        return deliveryRepository.findById(deliveryRegionId).orElseThrow(() -> new NotFoundException(
                String.format("Delivery region with ID %s not found", deliveryRegionId)));
    }

    public DeliveryRegionDTO findDeliveryRegionById(Long deliveryRegionId) {
        return deliveryRegionDTOMapper.apply(findById(deliveryRegionId));
    }

    public void save(DeliveryRegion deliveryRegion) {
        deliveryRepository.save(deliveryRegion);
    }

    public void update(DeliveryRegion deliveryRegion) {
        findById(deliveryRegion.getId());
        deliveryRepository.save(deliveryRegion);
    }

    public void updateAll(List<DeliveryRegion> deliveryRegions) {
        for (DeliveryRegion region :
                deliveryRegions) {
            if (region.getId() != null) {
                findById(region.getId());
            }
        }

        deliveryRepository.saveAll(deliveryRegions);
    }

    public void deleteById(Long id) {
        deliveryRepository.findById(id).orElseThrow(() -> new NotFoundException("Region not found"));
        deliveryRepository.deleteById(id);
    }

    public List<DeliveryRegionDTO> getRegionDTO(Integer type) {
        return deliveryRepository.findAllByBulkyEquals(type).stream().map(deliveryRegionDTOMapper).collect(Collectors.toList());
    }

    public List<DeliveryRegion> getRegions(Integer type) {
        return deliveryRepository.findAllByBulkyEquals(type);
    }
}
