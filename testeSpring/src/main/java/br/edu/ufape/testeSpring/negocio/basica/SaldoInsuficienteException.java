package br.edu.ufape.testeSpring.negocio.basica;

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException() {
		super("Saldo Insuficiente");
	}
	
}
