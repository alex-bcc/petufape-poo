package br.edu.ufape.poo.banco2.cadastro;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Conta;
import br.edu.ufape.poo.banco2.basica.RegistroOperacao;
import br.edu.ufape.poo.banco2.repositorio.RepositorioRegistroOperacao;

public class CadastroRegistroOperacao {
	private RepositorioRegistroOperacao repositorioRegistroOperacao;

	public CadastroRegistroOperacao(RepositorioRegistroOperacao repositorioRegistroOperacao) {
		this.repositorioRegistroOperacao = repositorioRegistroOperacao;
	}

	public void adicionarRegistroOperacao(RegistroOperacao r) {
		repositorioRegistroOperacao.adicionarRegistroOperacao(r);
	}

	public List<RegistroOperacao> listarPorConta(Conta c) {
		return repositorioRegistroOperacao.listarPorConta(c);
	}
	
	
	
}
