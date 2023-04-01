package com.dev.petshop.basica;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adm extends Pessoa {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String login;
	
	
	public Adm(String nome, Instant dataNascimento, String email, String senha) {
		super(nome, dataNascimento, email, senha);
		// TODO Auto-generated constructor stub
	}
	
	public Adm() {}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}
		
}
