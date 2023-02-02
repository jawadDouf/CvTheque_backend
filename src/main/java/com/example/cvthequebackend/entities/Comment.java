package com.example.cvthequebackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Comment {

    @Id @GeneratedValue private Long id;
    private String content;
    private String date;
    private String time;

    @ManyToOne
    private Apprenant apprenant;

    @ManyToOne
    private Cmi cmi;

    @ManyToOne
    private Cv cv;


}
