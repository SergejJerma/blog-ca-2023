package com.serjer.blogca2023.repo;

import com.serjer.blogca2023.entity.Comment;
import com.serjer.blogca2023.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}