package com.example.cvthequebackend.controllers;

import com.example.cvthequebackend.dto.ApprenantCreationDTO;
import com.example.cvthequebackend.dto.ApprenantDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.cvthequebackend.services.ApprenantService;

import java.util.List;

@RestController
@RequestMapping("/api/apprenant")
@CrossOrigin(origins="http://localhost:4200")
public class ApprenantController {

    final private ApprenantService apprenantService;

    public ApprenantController(ApprenantService apprenantService) {
        this.apprenantService = apprenantService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ApprenantDto>> getAllApprenant() {
        return new ResponseEntity<>(apprenantService.getAllApprenant(), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<ApprenantDto> addApprenant(@RequestBody ApprenantCreationDTO apprenantCreationDTO) {
        return new ResponseEntity<>(apprenantService.addApprenant(apprenantCreationDTO), HttpStatus.CREATED);
    }

}
