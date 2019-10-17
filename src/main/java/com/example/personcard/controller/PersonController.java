package com.example.personalcard.controller;

import com.example.personalcard.model.Person;
import com.example.personalcard.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
    @CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
    @RestController
    public class PersonController {
        @Autowired
        private PersonRepository personRepository;
        @GetMapping(value = "/persons")
        public List<Person> GetAllPersons() {
            return personRepository.findAll();
    }
}

