package com.example.cvthequebackend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApprenantCreationDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String image;
    private String speciality;
    private String password;

}
