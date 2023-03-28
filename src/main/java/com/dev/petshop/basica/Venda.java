package com.dev.petshop.basica;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Venda {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int usuarioid;
	private Date datavenda;
	private BigDecimal precoTotalDaVenda;
	
	public Venda() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUsuarioid() {
		return usuarioid;
	}

	public void setUsuarioid(int usuarioid) {
		this.usuarioid = usuarioid;
	}

	public Date getDatavenda() {
		return datavenda;
	}

	public void setDatavenda(Date datavenda) {
		this.datavenda = datavenda;
	}

	public BigDecimal getPrecoTotalDaVenda() {
		return precoTotalDaVenda;
	}

	public void setPrecoTotalDaVenda(BigDecimal precoTotalDaVenda) {
		this.precoTotalDaVenda = precoTotalDaVenda;
	}
}