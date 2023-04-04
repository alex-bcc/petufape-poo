package com.dev.petshop.cadastro;

import java.util.List;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.Setor;

public interface InterfaceProduto {

	List<Produto> procurarProdutoDepartamento(Departamento departamento);
	
	List<Produto> procurarProdutoSetor(Setor setor);
	
	Produto procurarProdutoUnico(String nome);
	
	void deletarProduto(int id);
	
	Produto salvarProduto(Produto entity);
	
	List<Produto> listarProduto();
}
