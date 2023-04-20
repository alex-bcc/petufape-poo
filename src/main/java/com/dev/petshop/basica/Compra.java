package com.dev.petshop.basica;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
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
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> item;
	
	private Date dataCompra;
	
	private BigDecimal precoTotalDaCompra;
	
	public Compra() {
		dataCompra= new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public BigDecimal getPrecoTotalDaCompra() {
		return precoTotalDaCompra;
	}

	public void setPrecoTotalDaCompra(BigDecimal precoTotalDaCompra) {
		this.precoTotalDaCompra = precoTotalDaCompra;
	}
	public void calcularTotal() {
		precoTotalDaCompra = BigDecimal.ZERO;
		for(Item it: item) {
			precoTotalDaCompra = precoTotalDaCompra.add(it.calcularSubProduto());
		}
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
}