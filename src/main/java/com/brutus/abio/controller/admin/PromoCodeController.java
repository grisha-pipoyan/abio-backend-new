package com.brutus.abio.controller.admin;

import com.brutus.abio.persistance.promocode.PromoCode;
import com.brutus.abio.service.PromoCodeService;
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
@RequestMapping("/abio/management/promocode")
@RequiredArgsConstructor
public class PromoCodeController {

    private final PromoCodeService promoCodeService;

    @PostMapping("/add")
    public void addPromoCode(@Valid @RequestBody PromoCode promoCode) {
        promoCodeService.save(promoCode);
    }

    @PostMapping("/update")
    public void updatePromoCode(@Valid @RequestBody PromoCode promoCode) {
        promoCodeService.update(promoCode);
    }

    @DeleteMapping("/delete")
    public void deletePromoCode(@RequestParam("id") Long id) {
        promoCodeService.deleteById(id);
    }

    /**
     * CSV
     */
    @GetMapping("/get")
    public ResponseEntity<List<PromoCode>> getPromoCodesCSV() {
        return ResponseEntity.ok(promoCodeService.getAllPromoCodes());
    }

}
