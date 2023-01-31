package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String image;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.image = image;
    }


}
