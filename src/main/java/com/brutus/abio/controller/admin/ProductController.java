package com.brutus.abio.controller.admin;

import com.brutus.abio.controller.admin.dto.PictureDTO;
import com.brutus.abio.csv.filter.ProductFilter;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.product.ProductAdminDTO;
import com.brutus.abio.persistance.product.ProductCsvDTO;
import com.brutus.abio.persistance.product.ProductHcDTO;
import com.brutus.abio.service.ProductService;
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
@RequestMapping("/abio/management/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/add/pictures")
    public void addPictures(@Valid @RequestBody List<PictureDTO> pictureDTO) {
        productService.addPictures(pictureDTO);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/update")
    public void updateProduct(@Valid @RequestBody ProductAdminDTO productAdminDTO) {
        productService.update(productAdminDTO);
    }

    @PreAuthorize("hasAuthority('HC')")
    @PostMapping("/hc/add")
    public ResponseEntity<ProductHcDTO> addProductHC(@Valid @RequestBody ProductHcDTO productHcDTO) {
        return ResponseEntity.ok(productService.save(productHcDTO));
    }

    @PreAuthorize("hasAuthority('HC')")
    @PostMapping("/hc/update")
    public ResponseEntity<ProductHcDTO> updateProductHC(@Valid @RequestBody ProductHcDTO productHcDTO) {
        return ResponseEntity.ok(productService.update(productHcDTO));
    }


    /**
     * CSV
     */
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/get")
    public ResponseEntity<List<ProductCsvDTO>> getAllProductsCSV() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/getByQuantityEquals")
    public ResponseEntity<List<ProductCsvDTO>> getProductsByQuantityEquals(@RequestParam("query") String query) {
        return ResponseEntity.ok(productService.getProductsByQuantityEquals(query));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/getByNameContaining")
    public ResponseEntity<List<ProductCsvDTO>> getByNameContaining(@RequestParam String searchString) {
        return ResponseEntity.ok(productService.getByNameContaining(searchString));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/getProductsByDescription")
    public ResponseEntity<List<ProductCsvDTO>> getProductsByDescription(@RequestParam Boolean has) {
        return ResponseEntity.ok(productService.getProductsByDescription(has));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/getProductsByHavingPictures")
    public ResponseEntity<List<ProductCsvDTO>> getProductsByHavingPictures(@RequestParam Boolean has) {
        return ResponseEntity.ok(productService.getProductsByHavingPictures(has));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/getProductByProductCode")
    public ResponseEntity<List<ProductCsvDTO>> getProductByProductCode(@RequestParam String productCode){
        return ResponseEntity.ok(productService.getProductByProductCode(productCode));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/csv/update")
    public void updateProducts(@RequestBody byte[] csvFile) {
        try {
            InMemoryDocument dssDocument = new InMemoryDocument(csvFile);
            List<ProductCsvDTO> globalList = JavaBeanToCSVConverter.convertToJavaBean(dssDocument,
                    ProductCsvDTO.class, new ProductFilter());

            productService.update(globalList);

        } catch (Exception e) {
            log.error(e.getMessage());
            throw new BadRequestException(e.getMessage());
        }
    }


}
