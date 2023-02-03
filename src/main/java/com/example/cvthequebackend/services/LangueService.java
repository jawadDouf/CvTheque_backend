package com.example.cvthequebackend.services;


import com.example.cvthequebackend.dto.LangueDto;
import com.example.cvthequebackend.entities.Langue;
import com.example.cvthequebackend.repositories.LangueRepository;
import org.springframework.stereotype.Service;

@Service
public class LangueService {

        final private LangueRepository langueRepository;

        public LangueService(LangueRepository langueRepository) {
            this.langueRepository = langueRepository;
        }

    public LangueDto mapToDto(Langue langue) {
        LangueDto langueDto = new LangueDto();
        langueDto.setId(langue.getId());
        langueDto.setName(langue.getName());
        langueDto.setNiveau(langue.getNiveau());
        return langueDto;
    }

    public Langue mapToEntity(LangueDto langueDto) {
        Langue langue = new Langue();
        langue.setId(langueDto.getId());
        langue.setName(langueDto.getName());
        langue.setNiveau(langueDto.getNiveau());
        return langue;
    }
}
