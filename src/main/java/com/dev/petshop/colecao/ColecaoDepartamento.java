package com.dev.petshop.colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.petshop.basica.Departamento;

@Repository
public interface ColecaoDepartamento 
	extends JpaRepository<Departamento, Integer>{
	
	public List<Departamento> findByNomeContaining(String nome);
	public Departamento findByNome(String nome);
	public Departamento findById(int id);
	public List<Departamento> findAll();
	
}
