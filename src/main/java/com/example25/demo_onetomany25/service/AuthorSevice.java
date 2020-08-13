package com.example25.demo_onetomany25.service;

import java.util.Optional;

import com.example25.demo_onetomany25.model.Author;
import com.example25.demo_onetomany25.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorSevice {
    
    @Autowired
    private AuthorRepository authorRepository;

    public Optional<Author> findAuthorByID(long id){
        return authorRepository.findById(id);
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }
}