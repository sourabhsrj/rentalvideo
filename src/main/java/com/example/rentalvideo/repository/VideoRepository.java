package com.example.rentalvideo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.*;
import java.util.*;
import java.lang.Long;

import com.example.rentalvideo.models.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findByAvailabilityStatus(Boolean status);
}

