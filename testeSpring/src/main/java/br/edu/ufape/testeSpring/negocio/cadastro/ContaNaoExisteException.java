package br.edu.ufape.testeSpring.negocio.cadastro;

public class ContaNaoExisteException extends Exception{
	public ContaNaoExisteException() {
		super("Conta não cadastrada!");
	}
}
