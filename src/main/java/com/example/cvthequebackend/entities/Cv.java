package com.example.cvthequebackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cv {

    @Id @GeneratedValue private Long id;
    @OneToMany(mappedBy = "cv")
    private List<Experience> experiences;
    @OneToMany(mappedBy = "cv")
    private List<Formation> formations;
    @OneToMany(mappedBy = "cv")
    private List<Competence> competences;

    @OneToMany(mappedBy = "cv")
    private List<Langue> languages;


}
