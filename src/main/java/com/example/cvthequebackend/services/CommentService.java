package com.example.cvthequebackend.services;

import com.example.cvthequebackend.dto.CommentDto;
import com.example.cvthequebackend.entities.Comment;
import com.example.cvthequebackend.repositories.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    final private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentDto mapToDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setContent(comment.getContent());
        commentDto.setDate(comment.getDate());
        commentDto.setTime(comment.getTime());
        return commentDto;
    }
}
