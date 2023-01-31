package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Competence {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    private Cv cv;

    public Competence() {
    }

    public Competence(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
