package com.dev.petshop.cadastro;

import java.util.List;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.Setor;

public interface InterfaceProduto {

	List<Produto> procurarProdutoDepartamento(Departamento departamento);
	
	List<Produto> procurarProdutoSetor(Setor setor);
	
	Produto atualizarProduto(Produto produto);
	
	Produto procurarProdutoUnico(String nome);
	
	Produto procurarProdutoId(int id);
	
	void deletarProduto(int id);
	
	Produto salvarProduto(Produto entity) throws ProdutoDuplicadoException;
	
	List<Produto> listarProduto();
	
	List<Produto> listarProdutoDepartamentoSetor(Departamento departamento, Setor setor);
}
