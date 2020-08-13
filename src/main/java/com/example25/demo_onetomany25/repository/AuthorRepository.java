package com.example25.demo_onetomany25.repository;

import com.example25.demo_onetomany25.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}