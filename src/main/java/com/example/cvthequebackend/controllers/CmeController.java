package com.example.cvthequebackend.controllers;


import com.example.cvthequebackend.responses.CmeResponse;
import com.example.cvthequebackend.services.CmeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cmes")
public class CmeController {


    private CmeService cmeService;

    public CmeController(CmeService cmeService) {
        this.cmeService = cmeService;
    }



    //Get one cme by id
    @GetMapping("/{id}")
    public ResponseEntity<CmeResponse> getOneCme(@PathVariable long id){
        return new ResponseEntity<>(cmeService.getOneCme(id),HttpStatus.OK) ;
    }

}
