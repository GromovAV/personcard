package com.example.personalcard.controller;

import com.example.personalcard.model.Language;
import com.example.personalcard.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class LanguageController {
    @Autowired
    private LanguageRepository languageRepository;
    @GetMapping("/languages/{personId}")
    public Set<Language> GetAllLanguages(@PathVariable Integer personId) {
        return languageRepository.findByPersonId(personId);
    }
}
