package com.brutus.abio.service;

import com.brutus.abio.exception.NotFoundException;
import eu.europa.esig.dss.spi.DSSUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
@Service
@RequiredArgsConstructor
public class FileService {

    @Value("${picture.directory}")
    private String BASE_DIRECTORY;

    public void saveFile(String productCodeString, String picName, byte[] bytes) {

        String picPath = BASE_DIRECTORY + productCodeString + "/" + picName;

        DSSUtils.saveToFile(bytes, new File(picPath));
    }

    public byte[] getPicture(String productCodeString, String picName) {

        String picPath = BASE_DIRECTORY + productCodeString + "/" + picName;
        Path filePath = Paths.get(picPath);

        // Check if the file exists
        if (!Files.exists(filePath)) {
            throw new NotFoundException("Picture not found");
        }

        return DSSUtils.toByteArray(filePath.toFile());

    }

}
