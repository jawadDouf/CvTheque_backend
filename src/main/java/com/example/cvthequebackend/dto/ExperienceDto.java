package com.example.cvthequebackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienceDto {
    private Long id;
    private String titre;
    private String description;
    private String dateDebut;
    private String dateFin;
    private String entreprise;
    private String lieu;
}
