package com.example.cvthequebackend.services;


import com.example.cvthequebackend.dto.*;
import com.example.cvthequebackend.repositories.*;
import com.example.cvthequebackend.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvService {

    private final CvRepository cvRepository;
    private CompetenceRepository competenceRepository;
    private FormationRepository formationRepository;
    private ExperienceRepository experienceRepository;
    private LangueRepository langueRepository;



    @Autowired
    ApprenantMapper apprenantMapper;
    ApprenantService apprenantService;
    CompetenceService competenceService;
    FormationService formationService;
    ExperienceService experienceService;
    LangueService langueService;
    CommentService commentService;

    public CvService(CvRepository cvRepository, CompetenceRepository competenceRepository, FormationRepository formationRepository, ExperienceRepository experienceRepository, LangueRepository langueRepository, ApprenantService apprenantService, CompetenceService competenceService, FormationService formationService, ExperienceService experienceService, LangueService langueService, CommentService commentService) {
        this.cvRepository = cvRepository;
        this.competenceRepository = competenceRepository;
        this.formationRepository = formationRepository;
        this.experienceRepository = experienceRepository;
        this.langueRepository = langueRepository;
        this.apprenantService = apprenantService;
        this.competenceService = competenceService;
        this.formationService = formationService;
        this.experienceService = experienceService;
        this.langueService = langueService;
        this.commentService = commentService;
    }


    public List<CvDto> getAllCv() {

        return cvRepository.findAll().stream().map(this::convertToDto).toList();
    }

    private CvDto convertToDto(Cv cv) {
        CvDto cvDto = new CvDto();
        cvDto.setId(cv.getId());
        cvDto.setApprenant_id(cv.getApprenant_id());
        cvDto.setApprenant(apprenantService.getApprenant(cv.getApprenant_id()));
        System.out.println(cvDto.getApprenant().getFirstName());
        cvDto.setCompetences(cv.getCompetences().stream().map(competenceService::mapToDto).toList());
        cvDto.setFormations(cv.getFormations().stream().map(formationService::mapToDto).toList());
        cvDto.setExperiences(cv.getExperiences().stream().map(experienceService::mapToDto).toList());
        cvDto.setLanguages(cv.getLanguages().stream().map(langueService::mapToDto).toList());
        if (cv.getComments() != null) {
            cvDto.setComments(cv.getComments().stream().map(commentService::mapToDto).toList());
        }
        return cvDto;
    }

    public CvDto createCv(CvDto cvDto) {
        Cv cv1 = new Cv();
        cv1.setApprenant_id(cvDto.getApprenant_id());
        Cv newCv = cvRepository.save(cv1);
        cvDto.getCompetences().forEach(competenceDto -> {
            Competence competence = competenceService.mapToEntity(competenceDto);
            competence.setCv(newCv);
            cv1.setCompetences(List.of(competence));
            competenceRepository.save(competence);
        });
        cvDto.getFormations().forEach(formationDto -> {
            Formation formation = formationService.mapToEntity(formationDto);
            formation.setCv(newCv);
            cv1.setFormations(List.of(formation));
            formationRepository.save(formation);
        });
        cvDto.getExperiences().forEach(experienceDto -> {
            Experience experience = experienceService.mapToEntity(experienceDto);
            experience.setCv(newCv);
            cv1.setExperiences(List.of(experience));
            experienceRepository.save(experience);
        });
        cvDto.getLanguages().forEach(langueDto -> {
            Langue langue = langueService.mapToEntity(langueDto);
            langue.setCv(newCv);
            cv1.setLanguages(List.of(langue));
            langueRepository.save(langue);
        });
        return convertToDto(cv1);
    }


}
