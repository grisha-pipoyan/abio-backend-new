package com.brutus.abio.controller.admin;

import com.brutus.abio.csv.filter.VideoFilter;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.video.VideoAdminDTO;
import com.brutus.abio.service.VideoService;
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
@RequestMapping("/abio/management/video")
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @PostMapping("/add")
    public ResponseEntity<VideoAdminDTO> addVideo(@Valid @RequestBody VideoAdminDTO videoAdminDTO) {
        return ResponseEntity.ok(videoService.save(videoAdminDTO));
    }

    @PostMapping("/update")
    public ResponseEntity<VideoAdminDTO> updateVideo(@Valid @RequestBody VideoAdminDTO videoAdminDTO) {
        return ResponseEntity.ok(videoService.update(videoAdminDTO));
    }

    @DeleteMapping("/delete")
    public void deleteVideo(@RequestParam("id") Long id) {
        videoService.deleteById(id);
    }


    /**
     * CSV
     */
    @GetMapping("/get")
    public ResponseEntity<List<VideoAdminDTO>> getAllVideosCSV() {
        return ResponseEntity.ok(videoService.getAllVideos());
    }

    @PostMapping("/csv/update")
    public void updateVideos(@RequestBody byte[] csvFile) {
        try {
            InMemoryDocument dssDocument = new InMemoryDocument(csvFile);
            List<VideoAdminDTO> videos = JavaBeanToCSVConverter.convertToJavaBean(dssDocument, VideoAdminDTO.class, new VideoFilter());
            videoService.updateAll(videos);
        } catch (Exception e) {
            throw new BadRequestException(e.getMessage());
        }
    }
}
