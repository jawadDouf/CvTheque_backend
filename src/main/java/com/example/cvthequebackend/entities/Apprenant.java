package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Apprenant extends User{


    public Apprenant() {
    }

    public Apprenant(String firstName, String lastName, String email, String password, String image) {
        super(firstName, lastName, email, password, image);
    }

}
