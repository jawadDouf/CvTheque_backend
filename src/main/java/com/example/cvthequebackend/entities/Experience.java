package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Experience {

    @Id @GeneratedValue
    private Long id;
    private String titre;
    private String description;
    private String dateDebut;
    private String dateFin;
    private String entreprise;
    private String lieu;

    @ManyToOne
    private Cv cv;

    public Experience() {
    }




}
