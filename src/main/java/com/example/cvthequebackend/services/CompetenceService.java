package com.example.cvthequebackend.services;

import com.example.cvthequebackend.dto.CompetenceDto;
import com.example.cvthequebackend.entities.Competence;
import com.example.cvthequebackend.repositories.CompetenceRepository;
import org.springframework.stereotype.Service;

@Service
public class CompetenceService {

    final private CompetenceRepository competenceRepository;

    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    public CompetenceDto getCompetence(Long id) {
        return competenceRepository.findById(id)
                .map(this::mapToDto)
                .orElseThrow(() -> new IllegalStateException("Competence with id " + id + " does not exist"));
    }

    public CompetenceDto mapToDto(Competence competence) {
        CompetenceDto competenceDto = new CompetenceDto();
        competenceDto.setId(competence.getId());
        competenceDto.setName(competence.getName());
        competenceDto.setDescription(competence.getDescription());
        return competenceDto;
    }

    public Competence mapToEntity(CompetenceDto competenceDto) {
        Competence competence = new Competence();
        competence.setId(competenceDto.getId());
        competence.setName(competenceDto.getName());
        competence.setDescription(competenceDto.getDescription());
        return competence;
    }
}
