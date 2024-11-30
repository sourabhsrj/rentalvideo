package com.example.rentalvideo.models;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String firstName;
    private String lastName;

 

    private Role role;
    
   

    public String getRole() {
        return role.toString();
    }

    public void setRole(Role role) {
        this.role = role;
    }


}

enum Role {
    CUSTOMER, ADMIN
}
