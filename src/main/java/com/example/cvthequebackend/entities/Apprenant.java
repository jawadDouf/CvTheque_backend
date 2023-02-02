package com.example.cvthequebackend.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Apprenant{

    @Id @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private String phone;
    private String password;
    private String image;
    private String speciality;


    @OneToOne(mappedBy = "apprenant")
    private Cv cv;

    @OneToMany(mappedBy = "apprenant")
    private List<Comment> comments;

    public Apprenant() {
    }

    public Apprenant(String firstName, String lastName, String email, String phone, String password, String image, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.image = image;
        this.speciality = speciality;
    }

}
