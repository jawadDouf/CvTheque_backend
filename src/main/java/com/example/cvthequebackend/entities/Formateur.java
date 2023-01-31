package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Formateur extends User{


    public Formateur() {
    }

    public Formateur(String firstName, String lastName, String email, String password, String image) {
        super(firstName, lastName, email, password, image);
    }




}
