package com.dev.petshop.fachada;

public class produtoInvalidoException extends Exception {
	public produtoInvalidoException(){
		super("Produto invalido!");
	}
}
