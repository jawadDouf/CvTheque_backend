package com.example.cvthequebackend.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Cv {

    @Id @GeneratedValue private Long id;

    private Long apprenant_id;
    @OneToOne
    @JoinColumn(name = "apprenant_id", insertable = false, updatable = false)
    private Apprenant apprenant;
    @OneToMany(mappedBy = "cv")
    @ToString.Exclude
    private List<Experience> experiences;
    @OneToMany(mappedBy = "cv")
    @ToString.Exclude
    private List<Formation> formations;
    @OneToMany(mappedBy = "cv")
    @ToString.Exclude
    private List<Competence> competences;
    @OneToMany(mappedBy = "cv")
    @ToString.Exclude
    private List<Langue> languages;
    @OneToMany(mappedBy = "cv")
    @ToString.Exclude
    private List<Comment> comments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cv cv = (Cv) o;
        return id != null && Objects.equals(id, cv.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
