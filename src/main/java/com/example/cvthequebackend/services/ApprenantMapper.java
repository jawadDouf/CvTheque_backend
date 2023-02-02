package com.example.cvthequebackend.services;

import com.example.cvthequebackend.dto.ApprenantDto;
import com.example.cvthequebackend.entities.Apprenant;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ApprenantMapper implements Function<Apprenant, ApprenantDto> {
        @Override
        public ApprenantDto apply(Apprenant apprenant) {
            return new ApprenantDto(
                    apprenant.getId(),
                    apprenant.getFirstName(),
                    apprenant.getLastName(),
                    apprenant.getEmail(),
                    apprenant.getPhone(),
                    apprenant.getImage(),
                    apprenant.getSpeciality()
            );
        }
}
