package br.edu.ufape.poo.banco2.repositorio;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Agencia;

public interface RepositorioAgencia {

	void cadastrarAgencia(Agencia a);

	Agencia procurarAgenciaCodigo(String codigo);

	Agencia procurarAgenciaMunicipio(String municipio);

	void removerAgencia(Agencia a);

	void atualizarAgencia(Agencia a);

	List<Agencia> listarAgencias();

}