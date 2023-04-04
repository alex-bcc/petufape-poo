package com.dev.petshop.cadastro;

import java.util.List;

import com.dev.petshop.basica.Adm;

public interface InterfaceAdm {
	
	Adm procurarAdm(String login);
	
	void deletarAdm(String login);
	
	Adm salvarAdm(Adm entity);
	
	List<Adm> listarAdm();
}
