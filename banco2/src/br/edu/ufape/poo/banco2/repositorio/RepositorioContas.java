package br.edu.ufape.poo.banco2.repositorio;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Conta;

public interface RepositorioContas {
	public void adicionarConta(Conta c);
	public Conta procurarContaNumero(String numero);
	public List<Conta> listarContas();
	public List<Conta> listarPoupancas();

}
