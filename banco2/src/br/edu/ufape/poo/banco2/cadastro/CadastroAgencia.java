package br.edu.ufape.poo.banco2.cadastro;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Agencia;
import br.edu.ufape.poo.banco2.repositorio.RepositorioAgencia;

public class CadastroAgencia {
	private RepositorioAgencia repositorioAgencia;

	public CadastroAgencia(RepositorioAgencia repositorioAgencia) {
		this.repositorioAgencia = repositorioAgencia;
	}

	public void cadastrarAgencia(Agencia a) {
		repositorioAgencia.cadastrarAgencia(a);
	}

	public Agencia procurarAgenciaCodigo(String codigo) {
		return repositorioAgencia.procurarAgenciaCodigo(codigo);
	}

	public Agencia procurarAgenciaMunicipio(String municipio) {
		return repositorioAgencia.procurarAgenciaMunicipio(municipio);
	}

	public void removerAgencia(Agencia a) {
		repositorioAgencia.removerAgencia(a);
	}

	public void atualizarAgencia(Agencia a) {
		repositorioAgencia.atualizarAgencia(a);
	}

	public List<Agencia> listarAgencias() {
		return repositorioAgencia.listarAgencias();
	}
	
}
