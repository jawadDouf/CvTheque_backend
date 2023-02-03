package com.example.cvthequebackend.controllers;


import com.example.cvthequebackend.dto.CvDto;
import com.example.cvthequebackend.entities.Cv;
import com.example.cvthequebackend.services.CvService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class CvController {

    private final CvService cvService;

    public CvController(CvService cvService) {

        this.cvService = cvService;
    }

    @PostMapping("/add")
    public ResponseEntity<CvDto> createCv(@RequestBody CvDto cv){
        return new ResponseEntity<>(cvService.createCv(cv), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CvDto>> getAllCv(){

        return ResponseEntity.ok(cvService.getAllCv());
    }
}
