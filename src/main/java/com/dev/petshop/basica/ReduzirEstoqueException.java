package com.dev.petshop.basica;

public class ReduzirEstoqueException extends Exception {
	public ReduzirEstoqueException() {
		super("Valor para reduzir o estoque invalido");
	}
}
