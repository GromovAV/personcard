package com.example.personalcard.repository;

import com.example.personalcard.model.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface InterestRepository extends JpaRepository<Interest, Integer> {
    Set<Interest> findByPersonId(Integer personId);
}