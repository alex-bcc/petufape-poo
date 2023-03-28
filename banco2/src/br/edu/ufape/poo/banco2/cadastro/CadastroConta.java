package br.edu.ufape.poo.banco2.cadastro;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Conta;
import br.edu.ufape.poo.banco2.repositorio.RepositorioContas;

public class CadastroConta {
	private RepositorioContas repositorioContas;

	public void adicionarConta(Conta c) {
		if(repositorioContas.procurarContaNumero(c.getNumero()) == null)
			repositorioContas.adicionarConta(c);
	}

	public Conta procurarContaNumero(String numero) {
		return repositorioContas.procurarContaNumero(numero);
	}

	public List<Conta> listarContas() {
		return repositorioContas.listarContas();
	}

	public List<Conta> listarPoupancas() {
		return repositorioContas.listarPoupancas();
	}

	public CadastroConta(RepositorioContas repositorioContas) {
		this.repositorioContas = repositorioContas;
	}

}
