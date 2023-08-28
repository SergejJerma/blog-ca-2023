package com.serjer.blogca2023.repo;

import com.serjer.blogca2023.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    @Query("SELECT t FROM Topic t WHERE t.title LIKE %?1%"
            + " OR CONCAT(t.header, '') LIKE %?1%")
    List<Topic> findTopicsByKeyword(String keyword);
}