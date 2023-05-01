package com.brutus.abio.persistance.video;

import com.brutus.abio.utils.Language;
import org.springframework.stereotype.Service;

import java.util.function.BiFunction;

@Service
public class VideoDTOMapper implements BiFunction<Video, Language, VideoDTO> {
    @Override
    public VideoDTO apply(Video video, Language language) {
        switch (language) {
            case RU: {
                return new VideoDTO(
                        video.getId(),
                        video.getTitle_ru(),
                        video.getDescription_ru(),
                        video.getDate(),
                        video.getUrl()
                );

            }
            case AM: {
                return new VideoDTO(
                        video.getId(),
                        video.getTitle_am(),
                        video.getDescription_am(),
                        video.getDate(),
                        video.getUrl()
                );
            }
            default: {
                return new VideoDTO(
                        video.getId(),
                        video.getTitle_en(),
                        video.getDescription_en(),
                        video.getDate(),
                        video.getUrl()
                );
            }
        }

    }
}
