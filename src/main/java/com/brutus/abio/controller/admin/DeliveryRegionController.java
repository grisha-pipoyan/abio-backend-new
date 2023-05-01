package com.brutus.abio.controller.admin;

import com.brutus.abio.csv.filter.DeliveryFilter;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.delivery.DeliveryRegion;
import com.brutus.abio.service.DeliveryRegionService;
import com.brutus.abio.utils.JavaBeanToCSVConverter;
import eu.europa.esig.dss.model.InMemoryDocument;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@PreAuthorize("hasAuthority('ADMIN')")
@RequestMapping("/abio/management/delivery")
@RequiredArgsConstructor
public class DeliveryRegionController {


    private final DeliveryRegionService deliveryRegionService;

    @PostMapping("/add")
    public void addRegion(@Valid @RequestBody DeliveryRegion deliveryRegion) {

        if (deliveryRegion.getBulky() != 0 && deliveryRegion.getBulky() != 1) {
            throw new BadRequestException("Bad bulky id");
        }

        deliveryRegion.setId(null);

        deliveryRegionService.save(deliveryRegion);
    }

    @PostMapping("/update")
    public void updateRegion(@Valid @RequestBody DeliveryRegion deliveryRegion) {
        deliveryRegionService.update(deliveryRegion);
    }

    @DeleteMapping("/delete")
    public void deleteRegionById(@RequestParam("id") Long id) {
        deliveryRegionService.deleteById(id);
    }


    /**
     * CSV
     */
    @GetMapping("/get")
    public ResponseEntity<List<DeliveryRegion>> getDeliveryRegionsCSV(@RequestParam("type") Integer type) {
        return ResponseEntity.ok(deliveryRegionService.getRegions(type));
    }

    @PostMapping("/csv/update")
    public void updateDeliveryRegion(@RequestBody byte[] csvFile) {
        try {
            InMemoryDocument dssDocument = new InMemoryDocument(csvFile);
            List<DeliveryRegion> regionList = JavaBeanToCSVConverter.convertToJavaBean(
                    dssDocument,
                    DeliveryRegion.class,
                    new DeliveryFilter()
            );
            deliveryRegionService.updateAll(regionList);
        } catch (Exception e) {
            throw new BadRequestException(e.getMessage());
        }
    }

}
