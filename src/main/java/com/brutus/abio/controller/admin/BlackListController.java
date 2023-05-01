package com.brutus.abio.controller.admin;

import com.brutus.abio.csv.filter.BlacklistFilter;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.order.BlacklistedCustomer;
import com.brutus.abio.service.BlacklistCustomerService;
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
@RequestMapping("/abio/management/blacklist")
@RequiredArgsConstructor
public class BlackListController {

    private final BlacklistCustomerService blacklistCustomerService;

    @PostMapping("/add")
    public void addCustomerBlackList(@Valid @RequestBody BlacklistedCustomer blacklistedCustomer) {
        blacklistCustomerService.save(blacklistedCustomer);
    }

    @DeleteMapping("/delete")
    public void deleteCustomerBlackList(@RequestParam("id") Long id) {
        blacklistCustomerService.deleteCustomerFromBlacklist(id);
    }

    @PostMapping("/update")
    public void updateCustomer(@Valid @RequestBody BlacklistedCustomer blacklistedCustomer) {
        blacklistCustomerService.update(blacklistedCustomer);
    }


    /**
     * CSV
     */
    @GetMapping("/get")
    public ResponseEntity<List<BlacklistedCustomer>> getBlackListCSV() {
        return ResponseEntity.ok(blacklistCustomerService.getAllCustomers());
    }

    @PostMapping("/csv/update")
    public void updateBlacklist(@RequestBody byte[] csvFile) {

        try {
            InMemoryDocument dssDocument = new InMemoryDocument(csvFile);
            List<BlacklistedCustomer> globalList = JavaBeanToCSVConverter.convertToJavaBean(dssDocument,
                    BlacklistedCustomer.class, new BlacklistFilter());

            blacklistCustomerService.updateAll(globalList);
        } catch (Exception e) {
            throw new BadRequestException(e.getMessage());
        }
    }

}




