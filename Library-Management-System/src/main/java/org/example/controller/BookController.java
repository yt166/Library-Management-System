package org.example.controller;

import org.example.dto.Book;
import org.example.service.BookServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookServive bookServive;
    @PostMapping
    public void addBook(Book book){
        bookServive.addBook(book);

    }
}
