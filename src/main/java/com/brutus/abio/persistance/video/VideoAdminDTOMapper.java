package com.brutus.abio.persistance.video;

import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class VideoAdminDTOMapper implements Function<Video, VideoAdminDTO> {
    @Override
    public VideoAdminDTO apply(Video video) {
        return new VideoAdminDTO(
                video.getId(),
                video.getTitle_en(),
                video.getTitle_ru(),
                video.getTitle_am(),
                video.getDescription_en(),
                video.getDescription_ru(),
                video.getDescription_am(),
                video.getDate(),
                video.getUrl()
        );
    }
}
