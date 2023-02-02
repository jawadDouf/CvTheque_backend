package com.example.cvthequebackend.repositories;

import com.example.cvthequebackend.entities.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Long> {
}
