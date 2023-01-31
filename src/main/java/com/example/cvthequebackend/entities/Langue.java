package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Langue {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String niveau;

    @ManyToOne
    private Cv cv;

    public Langue() {
    }

    public Langue(String name, String niveau) {
        this.name = name;
        this.niveau = niveau;
    }
}
