package com.example.personalcard.controller;

import com.example.personalcard.model.Interest;
import com.example.personalcard.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class InterestController {
    @Autowired
    private InterestRepository interestRepository;

    @GetMapping("/interests/{personId}")
    public Set<Interest> GetAllInterests(@PathVariable Integer personId) {
        return interestRepository.findByPersonId(personId);
    }
}

