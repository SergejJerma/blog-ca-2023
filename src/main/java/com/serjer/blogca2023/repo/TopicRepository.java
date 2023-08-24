package com.serjer.blogca2023.repo;

import com.serjer.blogca2023.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}