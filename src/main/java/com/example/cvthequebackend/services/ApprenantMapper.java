package com.example.cvthequebackend.services;

import com.example.cvthequebackend.dto.ApprenantDto;
import com.example.cvthequebackend.entities.Apprenant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public List<ApprenantDto> apply(List<Apprenant> apprenants) {
        List<ApprenantDto> apprenantDtos = new ArrayList<>();
        for (Apprenant apprenant : apprenants) {
            apprenantDtos.add(new ApprenantDto(
                    apprenant.getId(),
                    apprenant.getFirstName(),
                    apprenant.getLastName(),
                    apprenant.getEmail(),
                    apprenant.getPhone(),
                    apprenant.getImage(),
                    apprenant.getSpeciality()
            ));
        }
        return apprenantDtos;
    }
}
