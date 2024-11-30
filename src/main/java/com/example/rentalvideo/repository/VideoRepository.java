package com.example.rentalvideo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.rentalvideo.models.Video;

@Repository
public interface VideoRepository extends MongoRepository<Video, String> {
}

