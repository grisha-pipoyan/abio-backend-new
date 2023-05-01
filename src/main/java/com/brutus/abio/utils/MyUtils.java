package com.brutus.abio.utils;

import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyUtils {

    private static final Logger log = LoggerFactory.getLogger(MyUtils.class);

    public static ResponseEntity<byte[]> sendResponse(byte[] csvFileBytes) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<>(csvFileBytes, httpHeaders, HttpStatus.OK);
    }

    public static DSSDocument toDSSDocument(MultipartFile multipartFile) {
        try {
            if ((multipartFile != null) && !multipartFile.isEmpty()) {
                return new InMemoryDocument(multipartFile.getBytes(), multipartFile.getOriginalFilename());
            }
        } catch (IOException e) {
            log.error("Cannot read file : " + e.getMessage(), e);
        }
        return null;
    }

    public static List<DSSDocument> toDSSDocuments(List<MultipartFile> documentsToSign) {
        List<DSSDocument> dssDocuments = new ArrayList<>();
        if (Utils.isCollectionNotEmpty(documentsToSign)) {
            for (MultipartFile multipartFile : documentsToSign) {
                DSSDocument dssDocument = toDSSDocument(multipartFile);
                if (dssDocument != null) {
                    dssDocuments.add(dssDocument);
                }
            }
        }
        return dssDocuments;
    }
}
