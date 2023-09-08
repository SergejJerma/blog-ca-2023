package com.serjer.blogca2023.repo;


import com.serjer.blogca2023.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
