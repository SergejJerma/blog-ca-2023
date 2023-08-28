package com.serjer.blogca2023.service;

import com.serjer.blogca2023.entity.Comment;
import com.serjer.blogca2023.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void addCommentToTopic(Comment comment) {
        commentRepository.save(comment);
    }
}
