package com.example.cvthequebackend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
public class ApprenantDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String image;
    private String speciality;



}
