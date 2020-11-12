package com.example.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personne")
@Getter
@Setter
public class personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "prname")
	private String prename;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "tel")
	private String tel;
}
