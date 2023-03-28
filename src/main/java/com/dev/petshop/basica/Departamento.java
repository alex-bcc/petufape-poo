package com.dev.petshop.basica;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Departamento {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String setorId;
	
	public Departamento() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSetorId() {
		return setorId;
	}

	public void setSetorId(String setorId) {
		this.setorId = setorId;
	}

}