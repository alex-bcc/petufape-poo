package com.dev.petshop.basica;

import jakarta.persistence.Entity;

@Entity
public class Adm extends Pessoa {
	private String login;
	
	
	public Adm(String nome, String email, String senha) {
		super(nome, email, senha);
	}
	
	public Adm() {}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}
		
}
