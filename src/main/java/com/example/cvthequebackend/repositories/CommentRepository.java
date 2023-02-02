package com.example.cvthequebackend.repositories;

import com.example.cvthequebackend.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
