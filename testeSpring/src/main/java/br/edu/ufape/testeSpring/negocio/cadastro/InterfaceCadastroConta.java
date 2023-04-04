package br.edu.ufape.testeSpring.negocio.cadastro;

import br.edu.ufape.testeSpring.negocio.basica.Conta;

public interface InterfaceCadastroConta {

	Conta procurarContaId(long id);

	Conta procurarContaNumero(String numero);

	Conta salvarConta(Conta c);

	void deletarConta(Conta c);

}