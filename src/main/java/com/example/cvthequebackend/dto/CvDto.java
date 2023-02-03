package com.example.cvthequebackend.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class CvDto {
    private Long id;
    private Long apprenant_id;
    private ApprenantDto apprenant;
    private List<ExperienceDto> experiences;
    private List<FormationDto> formations;
    private List<CompetenceDto> competences;
    private List<LangueDto> languages;
    private List<CommentDto> comments;

}
