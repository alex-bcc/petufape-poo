package com.dev.petshop.colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.petshop.basica.Adm;

@Repository
public interface ColecaoAdm 
	extends JpaRepository<Adm, Integer>{
	
	public List<Adm> findByLoginContaining(String login);
	public Adm findByLogin(String login);
}
