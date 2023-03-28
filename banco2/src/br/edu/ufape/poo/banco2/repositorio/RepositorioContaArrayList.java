package br.edu.ufape.poo.banco2.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufape.poo.banco2.basica.Conta;

public class RepositorioContaArrayList implements RepositorioContas {
	private List<Conta> contas;
	
	public RepositorioContaArrayList() {
		this.contas = new ArrayList<Conta>();
	}
	

	@Override
	public void adicionarConta(Conta c) {
		this.contas.add(c);	
	}

	@Override
	public Conta procurarContaNumero(String numero) {
		for(Conta c: this.contas) {
			if(c.getNumero().equals(numero))
				return c;
		}
		return null;
	}

	@Override
	public List<Conta> listarContas() {
		
		return this.contas;
	}

	@Override
	public List<Conta> listarPoupancas() {
	/*	List<Conta> result = new ArrayList<Conta>();	
		for(Conta c: this.contas) {
			if(c instanceof ContaPoupanca)
				result.add(c);
		}
		return result;
		
		return this.contas.stream().filter( c -> c instanceof ContaPoupanca).toList();*/
		return null;
	}

}
