package com.example.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projet.model.personne;
import com.example.projet.service.PersonneService;

@RestController
@RequestMapping("/")
public class PersonneController {
	
	@Autowired
	PersonneService personneService;
    
	
	
	@GetMapping(value =  "/personne")
	public ResponseEntity<List<personne>> get(){
		List<personne> personnes = personneService.findAll();
		return new ResponseEntity<List<personne>>(personnes, HttpStatus.OK); 
	}
}
