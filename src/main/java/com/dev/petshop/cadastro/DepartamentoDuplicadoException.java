package com.dev.petshop.cadastro;

public class DepartamentoDuplicadoException extends Exception{
	public DepartamentoDuplicadoException() {
		super("Departamento já existe!");
	}
}
