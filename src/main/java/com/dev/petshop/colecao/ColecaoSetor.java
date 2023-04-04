package com.dev.petshop.colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.petshop.basica.Setor;

@Repository
public interface ColecaoSetor 
	extends JpaRepository<Setor, Integer>{
	
	public List<Setor> findByNomeContaining(String nome);
}
