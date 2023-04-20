package com.dev.petshop.cadastro;

public class ProdutoDuplicadoException extends Exception{
	public ProdutoDuplicadoException() {
		super("Produto já existe!");
	}

}
