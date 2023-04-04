package com.dev.petshop.basica;

import jakarta.persistence.Entity;

@Entity
public class Usuario extends Pessoa{

	public Usuario(String nome, String email, String senha) {
		super(nome, email, senha);
		// TODO Auto-generated constructor stub
	}
	public Usuario() {}
	

}
