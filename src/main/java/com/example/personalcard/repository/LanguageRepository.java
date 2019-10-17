package com.example.personalcard.repository;


import com.example.personalcard.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
    Set<Language> findByPersonId(Integer personId);
}