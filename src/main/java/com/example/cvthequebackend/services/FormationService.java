package com.example.cvthequebackend.services;

import com.example.cvthequebackend.dto.FormationDto;
import com.example.cvthequebackend.entities.Formation;
import com.example.cvthequebackend.repositories.FormationRepository;
import org.springframework.stereotype.Service;

@Service
public class FormationService {

    final private FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public Formation getFormation(Long id) {
        return formationRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Formation with id " + id + " does not exist"));
    }

    public FormationDto mapToDto(Formation formation) {
        FormationDto formationDto = new FormationDto();
        formationDto.setId(formation.getId());
        formationDto.setName(formation.getName());
        formationDto.setSchool(formation.getSchool());
        formationDto.setDateOfStart(formation.getDateOfStart());
        formationDto.setDateOfEnd(formation.getDateOfEnd());
        formationDto.setDescription(formation.getDescription());
        return formationDto;
    }

    public Formation mapToEntity(FormationDto formationDto) {
        Formation formation = new Formation();
        formation.setId(formationDto.getId());
        formation.setName(formationDto.getName());
        formation.setSchool(formationDto.getSchool());
        formation.setDateOfStart(formationDto.getDateOfStart());
        formation.setDateOfEnd(formationDto.getDateOfEnd());
        formation.setDescription(formationDto.getDescription());
        return formation;
    }
}
