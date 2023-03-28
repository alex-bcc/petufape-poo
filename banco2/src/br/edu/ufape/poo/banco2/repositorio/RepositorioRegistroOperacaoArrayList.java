package br.edu.ufape.poo.banco2.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufape.poo.banco2.basica.Conta;
import br.edu.ufape.poo.banco2.basica.RegistroOperacao;

public class RepositorioRegistroOperacaoArrayList implements RepositorioRegistroOperacao {
	private List<RegistroOperacao> registros;
	
	public RepositorioRegistroOperacaoArrayList() {
		this.registros = new ArrayList<RegistroOperacao>();
	}
	
	@Override
	public void adicionarRegistroOperacao(RegistroOperacao r) {
		this.registros.add(r);
	}
	
	@Override
	public List<RegistroOperacao> listarPorConta(Conta c) {
		return this.registros.stream()
				.filter(registro -> registro.getConta().equals(c))
				.toList();
	}
}
