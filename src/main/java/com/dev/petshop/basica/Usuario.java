package com.dev.petshop.basica;

import java.time.Instant;
import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario extends Pessoa{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Date nascimento;
	private Date cadastroData;

	public Usuario(String nome, Instant dataNascimento, String email, String senha) {
		super(nome, dataNascimento, email, senha);
		// TODO Auto-generated constructor stub
	}
	public Usuario() {}
	
	
	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Date getCadastroData() {
		return cadastroData;
	}

	public void setCadastroData(Date cadastroData) {
		this.cadastroData = cadastroData;
	}

}
