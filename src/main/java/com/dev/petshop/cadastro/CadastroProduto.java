package com.dev.petshop.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.Setor;
import com.dev.petshop.colecao.ColecaoProduto;

@Service
public class CadastroProduto implements InterfaceProduto{
	@Autowired
	private ColecaoProduto colecaoProduto;
	
	@Override
	public List<Produto> procurarProdutoDepartamento(Departamento departamento){
		return colecaoProduto.findByNomeContaining(departamento);
	}
	
	@Override
	public List<Produto> procurarProdutoSetor(Setor setor){
		return colecaoProduto.findByNomeContaining(setor);
	}
	
	@Override
	public void deletarProduto(int id) {
		colecaoProduto.deleteById(id);
	}

	@Override
	public Produto salvarProduto(Produto entity) {
		return colecaoProduto.save(entity);
	}

	@Override
	public List<Produto> listarProduto() {
		return colecaoProduto.findAll();
	}

	@Override
	public Produto procurarProdutoUnico(String nome) {
		return colecaoProduto.findByNomeUnicoContaining(nome);
	}
}
