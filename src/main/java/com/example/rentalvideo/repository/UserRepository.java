package com.example.rentalvideo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.rentalvideo.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
