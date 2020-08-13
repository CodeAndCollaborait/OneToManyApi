package com.example25.demo_onetomany25.controller;

import java.util.Optional;

import com.example25.demo_onetomany25.exception.BookException;
import com.example25.demo_onetomany25.model.Author;
import com.example25.demo_onetomany25.model.Book;
import com.example25.demo_onetomany25.service.AuthorSevice;
import com.example25.demo_onetomany25.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorSevice authorService;

    @GetMapping(value = "/")
    public String testApi(){
        return "Hello Author/Book api using Swagger";
    }

    @GetMapping(value = "books")
    public Page<Book> getListOfBooks(Pageable pageable){
        return bookService.getListOfBooks(pageable);
    }

    @GetMapping(value = "/books/{book_id}")
    public Book findBookById(@PathVariable(value = "book_id") long book_id) throws BookException{
        return bookService.bookByID(book_id);

    }
    @GetMapping(value = "/books/{book_id}/author")
    public Optional<Author> findAuthorOfBook(@PathVariable(value = "book_id") long book_id) throws BookException{
        return authorService.findAuthorByID(book_id);
    }

    @PostMapping(value = "book/author")
    public Author insertAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);

    }
    
}