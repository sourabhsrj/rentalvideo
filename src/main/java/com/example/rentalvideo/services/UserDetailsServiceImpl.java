package com.example.rentalvideo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.rentalvideo.models.User;
import com.example.rentalvideo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserDetailsServiceImpl {

    @Autowired
    private UserRepository userRepository;

   
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                user.getRole().getAuthorities()
        );
    }
}

