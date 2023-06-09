package com.dev.petshop.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Setor;
import com.dev.petshop.colecao.ColecaoSetor;


@Service
public class CadastroSetor implements InterfaceSetor{
	@Autowired
	private ColecaoSetor colecaoSetor;
	
	
	@Override
	public void deletarSetor(int id) {
		colecaoSetor.deleteById(id);
	}

	@Override
	public Setor salvarSetor(Setor entity) {
		return colecaoSetor.save(entity);
	}

	@Override
	public List<Setor> listarSetor() {
		return colecaoSetor.findAll();
	}

	@Override
	public Setor procurarSetorUnico(String nome) {
		return colecaoSetor.findByNome(nome);
	}

	@Override
	public Setor procurarSetorId(int id) {
		return colecaoSetor.findById(id);
	}
}
