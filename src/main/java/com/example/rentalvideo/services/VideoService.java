package com.example.rentalvideo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rentalvideo.models.Video;
import com.example.rentalvideo.repository.VideoRepository;

import lombok.RequiredArgsConstructor;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getAvailableVideos() {
        return videoRepository.findByAvailabilityStatus(true);
    }

    public Video save(Video video) {
        return videoRepository.save(video);
    }

    public void delete(Long id) {
        videoRepository.deleteById(id);
    }
}

