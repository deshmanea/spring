package com.honeycomb.springWebApp.controllers;

import com.honeycomb.springWebApp.repositories.BookRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBook(Model model){
        model.addAttribute("books",bookRepository.findAll());
        return "books/list";
    }
}
