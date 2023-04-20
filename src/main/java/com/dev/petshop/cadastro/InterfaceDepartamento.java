package com.dev.petshop.cadastro;

import java.util.List;

import com.dev.petshop.basica.Departamento;

public interface InterfaceDepartamento {

	List<Departamento> procurarDepartamento(String nome);
	
	void deletarDepartamento(int id);
	
	Departamento salvarDepartamento (Departamento entity) throws DepartamentoDuplicadoException ;
	
	List<Departamento> listarDepartamento();
	
	Departamento procurarDepartamentoUnico(String nome);
	
	Departamento procurarDepartamentoId(int id);
}
