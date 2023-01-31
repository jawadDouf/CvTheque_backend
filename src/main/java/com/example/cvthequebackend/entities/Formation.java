package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Formation {

    @Id @GeneratedValue private Long id;
    private String name;
    private String dateOfStart;
    private String dateOfEnd;
    private String school;
    private String description;

    @ManyToOne
    private Cv cv;

    public Formation() {
    }

    public Formation(String name, String dateOfStart, String dateOfEnd, String school, String description) {
        this.name = name;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.school = school;
        this.description = description;
    }

}
