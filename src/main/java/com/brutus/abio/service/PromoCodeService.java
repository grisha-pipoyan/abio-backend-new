package com.brutus.abio.service;

import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.exception.NotFoundException;
import com.brutus.abio.persistance.product.Product;
import com.brutus.abio.persistance.promocode.PromoCode;
import com.brutus.abio.persistance.promocode.PromoCodeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PromoCodeService {
    private final PromoCodeRepository promoCodeRepository;
    private final ProductService productService;
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public PromoCode findById(Long promoCodeId) {
        return promoCodeRepository.findById(promoCodeId).orElseThrow(
                () -> new NotFoundException(String.format("PromCode with id %s not found", promoCodeId)));
    }

    public PromoCode findByPromoCodeString(String promoCodeString) {
        return promoCodeRepository.findPromoCodeByCodeEquals(promoCodeString).orElseThrow(
                () -> new NotFoundException(String.format("PromCode with code %s not found", promoCodeString)));
    }

    public List<PromoCode> getAllPromoCodes() {
        return promoCodeRepository.findAll();
    }

    public void save(PromoCode promoCode) {

        if (promoCode.getProductCodes() != null && promoCode.getProductCodes().size() > 0) {
            for (String productCode :
                    promoCode.getProductCodes()) {
                Product byProductCode = productService.findByProductCode(productCode);
                if (byProductCode.getDiscountPrice() != null &&
                        byProductCode.getDiscountPrice().compareTo(BigDecimal.ZERO) > 0) {
                    throw new BadRequestException(String.format("Product with code %s already" +
                            "has discount", productCode));
                }
            }
        }

        if (!promoCode.isValidNow() && promoCode.isExhausted()) {
            throw new BadRequestException("Invalid promocode");
        }

        promoCodeRepository.save(promoCode);
    }

    public void update(PromoCode promoCode) {
        findById(promoCode.getId());
        save(promoCode);
    }

    public void deleteById(Long promoCodeId) {
        PromoCode promoCode = findById(promoCodeId);
        promoCodeRepository.delete(promoCode);
    }

}
