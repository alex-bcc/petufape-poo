package br.edu.ufape.poo.banco2.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufape.poo.banco2.basica.Agencia;

public class RepositorioAgenciaArrayList implements RepositorioAgencia {
	private List<Agencia> agencias;
	
	public RepositorioAgenciaArrayList() {
		this.agencias = new ArrayList<Agencia>();
	}
	
	@Override
	public void cadastrarAgencia(Agencia a) {
		this.agencias.add(a);
	}

	@Override
	public Agencia procurarAgenciaCodigo(String codigo) {
		return this.agencias.stream()
			.filter(agencia -> agencia.getCodigo().equals(codigo))
			.findAny()
			.orElse(null);
	}

	@Override
	public Agencia procurarAgenciaMunicipio(String municipio) {
		return this.agencias.stream()
			.filter(agencia -> agencia.getEndereco().getMunicipio().equals(municipio))
			.findAny()
			.orElse(null);
	}
	
	@Override
	public void removerAgencia(Agencia a) {
		this.agencias.remove(a);
	}

	@Override
	public void atualizarAgencia(Agencia a) {
		this.agencias.remove(a);
		this.agencias.add(a);
	}
	
	@Override
	public List<Agencia> listarAgencias() {
		return this.agencias;
	}

}
