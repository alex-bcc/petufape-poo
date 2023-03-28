package br.edu.ufape.poo.banco2.repositorio;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Conta;
import br.edu.ufape.poo.banco2.basica.RegistroOperacao;

public interface RepositorioRegistroOperacao {

	void adicionarRegistroOperacao(RegistroOperacao r);

	List<RegistroOperacao> listarPorConta(Conta c);

}