package com.dev.petshop.basica;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Setor setor;
	
	@ManyToOne
	private Departamento departamento;
	
	private String nome;
	private String descricao;
	private int estoque;
	private BigDecimal preco;
	
	public Produto() {}
	
	public Produto(String nome, int estoque,BigDecimal preco) {
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
	}
	public Produto(String nome, int estoque) {
		this.nome = nome;
		this.estoque = estoque;
	}

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

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void reporProduto(int quantidade)throws ReporEstoqueException {
		if(quantidade < 0) {
			throw new ReporEstoqueException();
		}else {
			this.estoque += quantidade;
		}		
	}
	public void reduzirProduto(int quantidade)throws ReduzirEstoqueException {
		if(quantidade < 0) {
			throw new ReduzirEstoqueException();
		}else {
			this.estoque -= quantidade;
		}		
	}

}
