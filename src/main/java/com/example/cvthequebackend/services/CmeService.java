package com.example.cvthequebackend.services;


import com.example.cvthequebackend.repositories.cmeRepository;
import org.springframework.stereotype.Service;
import com.example.cvthequebackend.responses.CmeResponse;

@Service
public class CmeService {

    private cmeRepository cmeRepostory;

    private CmeResponse cmeResponse;


    public CmeService(cmeRepository cmeRepostory, CmeResponse cmeResponse) {
        this.cmeRepostory = cmeRepostory;
        this.cmeResponse = cmeResponse;
    }


    public CmeResponse getOneCme(Long id){
        return cmeResponse.to_response(cmeRepostory.findById(id).get());
    }
}
