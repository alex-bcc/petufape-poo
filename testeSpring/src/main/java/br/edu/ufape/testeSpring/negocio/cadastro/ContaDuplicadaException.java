package br.edu.ufape.testeSpring.negocio.cadastro;

public class ContaDuplicadaException extends Exception {
	public ContaDuplicadaException() {
		super("Número da conta em uso!");
	}
}
