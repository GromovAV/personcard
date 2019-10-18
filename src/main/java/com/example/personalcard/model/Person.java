package com.example.personalcard.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany (mappedBy = "person")
    private List<Language> persons = new ArrayList<>();
    @OneToMany (mappedBy = "person")
    private List<Interest> Interests = new ArrayList<>();
 }
