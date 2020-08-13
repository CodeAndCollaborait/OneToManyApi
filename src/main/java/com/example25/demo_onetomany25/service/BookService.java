package com.example25.demo_onetomany25.service;

import com.example25.demo_onetomany25.exception.BookException;
import com.example25.demo_onetomany25.model.Book;
import com.example25.demo_onetomany25.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Page<Book> getListOfBooks(Pageable pageable){
        return bookRepository.findAll(pageable);
    }

    public Book bookByID(long id) throws BookException{
        return bookRepository.findById(id).orElseThrow(() -> new BookException("Book not found by the given id: " + id));
    }
    
}