package com.honeycomb.springWebApp.controllers;

import com.honeycomb.springWebApp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/author")
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "authors/author";
    }
}
