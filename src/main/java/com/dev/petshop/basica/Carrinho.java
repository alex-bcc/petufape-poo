package com.dev.petshop.basica;

import java.math.BigDecimal;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Carrinho {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int produtoId;
	private int vendaId;
	private int quantidade;
	private BigDecimal precoUnit;
	
	public Carrinho() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}

	public int getVendaId() {
		return vendaId;
	}

	public void setVendaId(int vendaId) {
		this.vendaId = vendaId;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(BigDecimal precoUnit) {
		this.precoUnit = precoUnit;
	}

}
