package com.dev.petshop.basica;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Compra {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany
	private Usuario usuario;
	
	@OneToMany
	private List<Item> item;
	
	private BigDecimal precoTotalDaCompra;
	
	public Compra() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getPrecoTotalDaCompra() {
		return precoTotalDaCompra;
	}

	public void setPrecoTotalDaCompra(BigDecimal precoTotalDaCompra) {
		this.precoTotalDaCompra = precoTotalDaCompra;
	}
}