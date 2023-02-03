package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cmi{

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private String phone;
    private String password;
    private String image;

    @OneToMany(mappedBy = "cmi")
    private List<Comment> comments;

    public Cmi() {
    }

    public Cmi(String firstName, String lastName, String email, String phone, String password, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.image = image;
    }




}
