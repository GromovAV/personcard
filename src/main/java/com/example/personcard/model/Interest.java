package com.example.personalcard.model;

import javax.persistence.*;
@Entity
public class Interest {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    @ManyToOne()
    @JoinColumn(name="person_id")
    private Person person;

}
