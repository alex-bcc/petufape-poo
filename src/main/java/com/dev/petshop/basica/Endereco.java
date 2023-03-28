package com.dev.petshop.basica;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Endereco {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cep;
	private String endereco;
	private int enderecId;
	
	public Endereco () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getEnderecId() {
		return enderecId;
	}

	public void setEnderecId(int enderecId) {
		this.enderecId = enderecId;
	}

}
