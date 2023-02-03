package com.example.cvthequebackend.services;


import com.example.cvthequebackend.dto.ExperienceDto;
import com.example.cvthequebackend.entities.Experience;
import org.springframework.stereotype.Service;
import com.example.cvthequebackend.repositories.ExperienceRepository;

@Service
public class ExperienceService {

    final private ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Experience getExperience(Long id) {
        return experienceRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Experience with id " + id + " does not exist"));
    }


    public ExperienceDto mapToDto(Experience experience) {
        ExperienceDto experienceDto = new ExperienceDto();
        experienceDto.setId(experience.getId());
        experienceDto.setTitre(experience.getTitre());
        experienceDto.setDateDebut(experience.getDateDebut());
        experienceDto.setDateFin(experience.getDateFin());
        experienceDto.setEntreprise(experience.getEntreprise());
        experienceDto.setLieu(experience.getLieu());
        experienceDto.setDescription(experience.getDescription());
        return experienceDto;
    }

    public Experience mapToEntity(ExperienceDto experienceDto) {
        Experience experience = new Experience();
        experience.setTitre(experienceDto.getTitre());
        experience.setDateDebut(experienceDto.getDateDebut());
        experience.setDateFin(experienceDto.getDateFin());
        experience.setLieu(experienceDto.getLieu());
        experience.setEntreprise(experienceDto.getEntreprise());
        experience.setDescription(experienceDto.getDescription());
        return experience;
    }
}
