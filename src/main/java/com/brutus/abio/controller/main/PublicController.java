package com.brutus.abio.controller.main;

import com.brutus.abio.persistance.delivery.DeliveryRegionDTO;
import com.brutus.abio.persistance.product.ProductDTO;
import com.brutus.abio.persistance.video.VideoDTO;
import com.brutus.abio.service.BlacklistCustomerService;
import com.brutus.abio.service.DeliveryRegionService;
import com.brutus.abio.service.ProductService;
import com.brutus.abio.service.VideoService;
import com.brutus.abio.utils.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/abio/public")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "https://xn--z9afn3dyad4d.xn--y9a3aq/", "https://xn--z9afn3dyad4d.xn--y9a3aq"})
public class PublicController {

    private final ProductService productService;
    private final VideoService videoService;
    private final DeliveryRegionService deliveryRegionService;
    private final BlacklistCustomerService blacklistCustomerService;

    @GetMapping("/get/product/{productCode}")
    public ResponseEntity<ProductDTO> getProductByCode(@PathVariable String productCode,
                                                       @RequestParam("language") Language language) {
        return ResponseEntity.ok(productService.getProductByCode(productCode, language));
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<ProductDTO>> getAllProducts(@RequestParam("language") Language language,
                                                           @RequestParam("page") int page,
                                                           @RequestParam(value = "size", defaultValue = "50") int size) {

        List<ProductDTO> allProducts = productService.getAllProducts(language, false, false);
        int fromIndex = page * size;
        int toIndex = Math.min(fromIndex + size, allProducts.size());

        return ResponseEntity.ok(allProducts.subList(fromIndex, toIndex));
    }

    @GetMapping("/getServiceProducts")
    public ResponseEntity<List<ProductDTO>> getAllServiceProducts(@RequestParam("language") Language language,
                                                                  @RequestParam("page") int page,
                                                                  @RequestParam(value = "size", defaultValue = "50") int size) {

        List<ProductDTO> allProducts = productService.getAllProducts(language, true, false);
        int fromIndex = page * size;
        int toIndex = Math.min(fromIndex + size, allProducts.size());

        return ResponseEntity.ok(allProducts.subList(fromIndex, toIndex));
    }

    @GetMapping("/getGiftCardProducts")
    public ResponseEntity<List<ProductDTO>> getAllGiftCardProducts(@RequestParam("language") Language language,
                                                                   @RequestParam("page") int page,
                                                                   @RequestParam(value = "size", defaultValue = "50") int size) {

        List<ProductDTO> allProducts = productService.getAllProducts(language, false, true);
        int fromIndex = page * size;
        int toIndex = Math.min(fromIndex + size, allProducts.size());

        return ResponseEntity.ok(allProducts.subList(fromIndex, toIndex));
    }

    @GetMapping("/getRecommendedProducts")
    public ResponseEntity<List<ProductDTO>> getRecommendedProducts(@RequestParam("language") Language language) {
        List<ProductDTO> allProducts = productService.getRecommendedProducts(language, false, false);
        int fromIndex = 0;
        int toIndex = Math.min(fromIndex + 50, allProducts.size());

        return ResponseEntity.ok(allProducts.subList(fromIndex, toIndex));
    }

    //@GetMapping("/products/filter")
    @GetMapping("/filter")
    public ResponseEntity<List<ProductDTO>> filterProducts(@RequestParam(value = "category1", required = false) String category1,
                                                           @RequestParam(value = "category2", required = false) String category2,
                                                           @RequestParam(value = "category3", required = false) String category3,
                                                           @RequestParam(value = "color", required = false) String color,
                                                           @RequestParam(value = "minPrice", required = false) BigDecimal minPrice,
                                                           @RequestParam(value = "maxPrice", required = false) BigDecimal maxPrice,
                                                           @RequestParam("page") int page,
                                                           @RequestParam(value = "size", defaultValue = "50") int size,
                                                           @RequestParam(value = "language") Language language) {

        List<ProductDTO> allProducts = productService.filter(category1, category2, category3, color,
                minPrice, maxPrice, language);

        int fromIndex = page * size;
        int toIndex = Math.min(fromIndex + size, allProducts.size());

        return ResponseEntity.ok(allProducts.subList(fromIndex, toIndex));
    }

    @GetMapping("/get/products/quantity")
    public ResponseEntity<Long> getProductsQuantity() {
        return ResponseEntity.ok(productService.getTotalQuantity());
    }

    //@GetMapping("/getAllVideos")
    @GetMapping("/get/video/byLang")
    public ResponseEntity<List<VideoDTO>> getAllVideos(@RequestParam("language") Language language) {
        return ResponseEntity.ok(videoService.getAllVideosByLanguage(language));
    }

    @GetMapping("/get/video/{id}")
    public ResponseEntity<VideoDTO> getById(@PathVariable("id") Long id,
                                            @RequestParam Language language) {
        return ResponseEntity.ok(videoService.getVideoDTOById(id, language));
    }

    @GetMapping("/get/region/{deliveryRegionId}")
    public ResponseEntity<DeliveryRegionDTO> getRegionById(@PathVariable("deliveryRegionId") Long deliveryRegionId) {
        return ResponseEntity.ok(deliveryRegionService.findDeliveryRegionById(deliveryRegionId));
    }

    @GetMapping("/check/customer/{email}")
    public ResponseEntity<Boolean> checkIfCustomerInBlacklist(@PathVariable("email") String email) {
        return ResponseEntity.ok(blacklistCustomerService.isCustomerEmailInBlacklist(email));
    }

}
