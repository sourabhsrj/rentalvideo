package com.example.rentalvideo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rentalvideo.models.Rental;

@Repository
public interface RentalRepository extends JpaRepository<RentalRepository, Long> {
    List<Rental> findByUserIdAndReturnDateIsNull(Long userId);
}
