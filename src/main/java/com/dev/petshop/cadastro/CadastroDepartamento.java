package com.dev.petshop.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.colecao.ColecaoDepartamento;

@Service
public class CadastroDepartamento implements InterfaceDepartamento {
	@Autowired
	private ColecaoDepartamento colecaoDepartamento;
	
	@Override
	public List<Departamento> procurarDepartamento(String nome) {
		return colecaoDepartamento.findByNomeContaining(nome);
	}
	
	@Override
	public void deletarDepartamento(int id) {
		colecaoDepartamento.deleteById(id);
	}
	
	@Override
	public Departamento salvarDepartamento(Departamento entity) throws DepartamentoDuplicadoException   {
		if(colecaoDepartamento.findByNome(entity.getNome())!= null){
			throw new DepartamentoDuplicadoException();
		}else {
			return colecaoDepartamento.save(entity);
		}	
	}

	@Override
	public List<Departamento> listarDepartamento() {
		return colecaoDepartamento.findAll();
	}

	@Override
	public Departamento procurarDepartamentoUnico(String nome) {
		return colecaoDepartamento.findByNome(nome);
	}

	@Override
	public Departamento procurarDepartamentoId(int id) {
		return colecaoDepartamento.findById(id);
	}
}
