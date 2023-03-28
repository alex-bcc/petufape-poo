package com.dev.petshop.basica;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Produto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Setor setor;
	private String nome;
	private String marca;
	private BigDecimal peso;
	private Date dataCompra;
	private int estoque;
	private BigDecimal precoDeCustoUnit;
	private BigDecimal precoDeCustoTotal;
	private BigDecimal precoAVista;
	
	public Produto() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public BigDecimal getPrecoDeCustoUnit() {
		return precoDeCustoUnit;
	}

	public void setPrecoDeCustoUnit(BigDecimal precoDeCustoUnit) {
		this.precoDeCustoUnit = precoDeCustoUnit;
	}

	public BigDecimal getPrecoDeCustoTotal() {
		return precoDeCustoTotal;
	}

	public void setPrecoDeCustoTotal(BigDecimal precoDeCustoTotal) {
		this.precoDeCustoTotal = precoDeCustoTotal;
	}

	public BigDecimal getPrecoAVista() {
		return precoAVista;
	}

	public void setPrecoAVista(BigDecimal precoAVista) {
		this.precoAVista = precoAVista;
	}

}
