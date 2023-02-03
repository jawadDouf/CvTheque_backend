package com.example.cvthequebackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormationDto {
    private Long id;
    private String name;
    private String dateOfStart;
    private String dateOfEnd;
    private String school;
    private String description;
}
