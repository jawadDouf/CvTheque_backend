package com.example.cvthequebackend.services;

import com.example.cvthequebackend.dto.ApprenantCreationDTO;
import com.example.cvthequebackend.dto.ApprenantDto;
import com.example.cvthequebackend.entities.Apprenant;
import com.example.cvthequebackend.repositories.ApprenantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantService {

    final private ApprenantRepository apprenantRepository;
    final ApprenantMapper apprenantMapper;

    public ApprenantService(ApprenantRepository apprenantRepository, ApprenantMapper apprenantMapper) {
        this.apprenantRepository = apprenantRepository;
        this.apprenantMapper = apprenantMapper;
    }

    public ApprenantDto getApprenant(Long id) {
        return apprenantRepository.findById(id)
                .map(apprenantMapper)
                .orElseThrow(() -> new IllegalStateException("Apprenant with id " + id + " does not exist"));
    }


    public List<ApprenantDto> getAllApprenant() {
        return apprenantRepository.findAll()
                .stream()
                .map(apprenantMapper)
                .toList();
    }

    public ApprenantDto addApprenant(ApprenantCreationDTO apprenantCreationDTO) {
        Apprenant apprenant = new Apprenant();
        System.out.println(apprenantCreationDTO.getFirstName());
        apprenant.setFirstName(apprenantCreationDTO.getFirstName());
        apprenant.setLastName(apprenantCreationDTO.getLastName());
        apprenant.setEmail(apprenantCreationDTO.getEmail());
        apprenant.setPhone(apprenantCreationDTO.getPhone());
        apprenant.setImage(apprenantCreationDTO.getImage());
        apprenant.setSpeciality(apprenantCreationDTO.getSpeciality());
        apprenant.setPassword(apprenantCreationDTO.getPassword());
        apprenantRepository.save(apprenant);
        return apprenantMapper.apply(apprenant);
    }
}
