package br.edu.ufape.testeSpring.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.testeSpring.dado.ColecaoConta;
import br.edu.ufape.testeSpring.negocio.basica.Conta;

@Service
public class CadastroConta implements InterfaceCadastroConta {
	@Autowired
	private ColecaoConta colecaoConta;
	
	@Override
	public Conta procurarContaId(long id) {
		return colecaoConta.findById(id).orElse(null);
	}
	
	@Override
	public Conta procurarContaNumero(String numero) {
		return colecaoConta.findByNumero(numero);
	}
	
	@Override
	public Conta salvarConta(Conta c) {
		//Tratamento da regra que não pode permitir duas contas com mesmo número
		return colecaoConta.save(c);
	}
	
	@Override
	public void deletarConta(Conta c) {
		colecaoConta.delete(c);
	}

}
