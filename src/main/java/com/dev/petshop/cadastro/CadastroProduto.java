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
		return colecaoProduto.findByNomeContaining(departamento.getNome());
	}
	
	@Override
	public List<Produto> procurarProdutoSetor(Setor setor){
		return colecaoProduto.findByNomeContaining(setor.getNome());
	}
	
	@Override
	public void deletarProduto(int id) {
		colecaoProduto.deleteById(id);
	}

	@Override
	public Produto salvarProduto(Produto entity) throws ProdutoDuplicadoException {
		if(colecaoProduto.findByNome(entity.getNome())!= null) {
			throw new ProdutoDuplicadoException();
		}else {
			return colecaoProduto.save(entity);
		}
		
	}

	@Override
	public List<Produto> listarProduto() {
		return colecaoProduto.findAll();
	}

	@Override
	public Produto procurarProdutoId(int id) {
		return colecaoProduto.findById(id);
	}

	@Override
	public Produto procurarProdutoUnico(String nome) {
		return colecaoProduto.findByNome(nome);
	}

	@Override
	public List<Produto> listarProdutoDepartamentoSetor(Departamento departamento, Setor setor) {
		return colecaoProduto.findByDepartamentoAndSetor(departamento, setor);
	}

	@Override
	public Produto atualizarProduto(Produto produto) {
		return colecaoProduto.save(produto);
	}
}
