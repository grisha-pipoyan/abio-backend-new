package com.brutus.abio.controller.main;

import com.brutus.abio.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/abio/public")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "https://xn--z9afn3dyad4d.xn--y9a3aq/", "https://xn--z9afn3dyad4d.xn--y9a3aq"})
public class FileDownloadController {

    private final ProductService productService;

    @Operation(summary = "Download picture")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200"),
            @ApiResponse(responseCode = "404")
    })
    @GetMapping("/files")
    public ResponseEntity<Resource> serveFile(@RequestParam("productCode") String productCode,
                                              @RequestParam("fileName") String fileName) {


        ByteArrayResource picture = productService.getPicture(productCode, fileName);

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + fileName + "\"").body(picture);

    }


}
