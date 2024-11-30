package com.example.rentalvideo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rentalvideo.models.Video;
import com.example.rentalvideo.repository.VideoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideoService {
	
	@Autowired
    private VideoRepository videoRepository;

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Video createVideo(Video video) {
        return videoRepository.save(video);
    }

    public Video updateVideo(String id, Video updatedVideo) {
        return videoRepository.findById(id)
                .map(video -> {
                    video.setTitle(updatedVideo.getTitle());
                    video.setDirector(updatedVideo.getDirector());
                    video.setGenre(updatedVideo.getGenre());
                    video.setAvailable(updatedVideo.isAvailable());
                    return videoRepository.save(video);
                }).orElseThrow(() -> new RuntimeException("Video not found"));
    }

    public void deleteVideo(String id) {
        videoRepository.deleteById(id);
    }
}
