package com.dev.petshop.colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.Setor;

@Repository
public interface ColecaoProduto 
	extends JpaRepository<Produto, Integer>{
	
	public List<Produto> findByNomeContaining(Departamento departamento);
	
	public List<Produto> findByNomeContaining(Setor setor);
	
	public Produto findByNomeUnicoContaining(String nome);
}
