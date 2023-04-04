package br.edu.ufape.testeSpring.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class TransferirRequest {
	@NotBlank
	private String contaOrigem;
	@NotBlank
	private String contaDestino;
	@Positive
	private float valor;
	public TransferirRequest() {
	}
	public String getContaOrigem() {
		return contaOrigem;
	}
	public String getContaDestino() {
		return contaDestino;
	}
	public float getValor() {
		return valor;
	}
	
	
}
