package com.example.projet.service;

import java.util.List;

import com.example.projet.model.personne;

public interface PersonneService {

	List<personne>  findAll();
	
	personne find(Long id);
	
	void save(personne per);
	
	void delete(Long id);
}
