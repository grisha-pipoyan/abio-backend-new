package com.brutus.abio.service;

import com.brutus.abio.exception.NotFoundException;
import com.brutus.abio.persistance.video.*;
import com.brutus.abio.utils.Language;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;
    private final VideoDTOMapper videoDTOMapper;
    private final VideoAdminDTOMapper videoAdminDTOMapper;

    private Video findById(Long id) {
        return videoRepository.findById(id).orElseThrow(() -> new NotFoundException(
                String.format("Video with id %s not found", id)
        ));
    }

    public VideoDTO getVideoDTOById(Long videoId, Language language) {
        return videoDTOMapper.apply(findById(videoId), language);
    }

    public VideoAdminDTO save(VideoAdminDTO videoAdminDTO) {
        Video video = new Video();
        return getVideoAdminDTO(video, videoAdminDTO);
    }

    public void deleteById(Long id) {
        videoRepository.deleteById(id);
    }

    public List<VideoAdminDTO> getAllVideos() {
        return videoRepository.findAll().stream().map(videoAdminDTOMapper).collect(Collectors.toList());
    }

    public List<VideoDTO> getAllVideosByLanguage(Language language) {
        List<Video> all = videoRepository.findAll();
        return all.stream().map(video -> videoDTOMapper.apply(video, language)).collect(Collectors.toList());
    }

    public VideoAdminDTO update(VideoAdminDTO videoAdminDTO) {
        Video video = findById(videoAdminDTO.getId());
        return getVideoAdminDTO(video, videoAdminDTO);
    }

    private VideoAdminDTO getVideoAdminDTO(Video video, VideoAdminDTO videoAdminDTO) {

        video.setTitle_en(videoAdminDTO.getTitle_en());
        video.setTitle_ru(videoAdminDTO.getTitle_ru());
        video.setTitle_am(videoAdminDTO.getTitle_am());
        video.setDescription_en(videoAdminDTO.getDescription_en());
        video.setDescription_ru(videoAdminDTO.getDescription_ru());
        video.setDescription_am(videoAdminDTO.getDescription_am());

        video.setDate(videoAdminDTO.getDate());
        video.setUrl(videoAdminDTO.getUrl());

        videoRepository.save(video);

        return videoAdminDTOMapper.apply(video);
    }

    public List<VideoAdminDTO> updateAll(List<VideoAdminDTO> videos) {

        List<VideoAdminDTO> videoAdminDTOS = new ArrayList<>();

        for (VideoAdminDTO videoAdminDTO :
                videos) {
            if (videoAdminDTO.getId() != null) {
                Video byId = findById(videoAdminDTO.getId());
                videoAdminDTOS.add(getVideoAdminDTO(byId, videoAdminDTO));
            }
        }

        return videoAdminDTOS;
    }
}
