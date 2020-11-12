package com.example.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projet.model.personne;

@Repository
public interface PersonnRepository extends JpaRepository< personne , Long > {

	
}	
