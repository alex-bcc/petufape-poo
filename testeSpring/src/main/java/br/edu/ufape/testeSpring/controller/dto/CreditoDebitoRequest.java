package br.edu.ufape.testeSpring.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/*
 * https://jakarta.ee/specifications/bean-validation/3.0/apidocs/jakarta/validation/constraints/package-summary.html
 * 
 */


public class CreditoDebitoRequest {
	@NotBlank
	public String numero;
	@Min(0)
	public float valor;
	public String getNumero() {
		return numero;
	}
	public float getValor() {
		return valor;
	}
	public CreditoDebitoRequest() {
	}
}
