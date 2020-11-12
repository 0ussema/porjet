package com.example.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projet.model.personne;
import com.example.projet.repository.PersonnRepository;

@Service
public class PersonneServiceImpl implements PersonneService {
	
	@Autowired
	private PersonnRepository  personneRepository;
	
	
	@Override
	public List<personne> findAll() {
		return personneRepository.findAll();
	}


	@Override
	public personne find(Long id) {
		return personneRepository.findById(id).get();
	}


	@Override
	public void save(personne per) {
		personneRepository.save(per);
		
	}


	@Override
	public void delete(Long id) {
		personneRepository.deleteById(id);
	}

}
