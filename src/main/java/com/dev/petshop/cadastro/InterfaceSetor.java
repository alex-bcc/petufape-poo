package com.dev.petshop.cadastro;

import java.util.List;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Setor;

public interface InterfaceSetor {
	
	void deletarSetor(int id);
	
	Setor salvarSetor(Setor entity);
	
	List<Setor> listarSetor();
	
	Setor procurarSetorUnico(String nome);
	
	Setor procurarSetorId(int id);
}
