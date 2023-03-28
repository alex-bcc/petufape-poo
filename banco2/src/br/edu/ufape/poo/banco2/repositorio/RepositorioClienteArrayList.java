package br.edu.ufape.poo.banco2.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufape.poo.banco2.basica.Cliente;

public class RepositorioClienteArrayList implements RepositorioCliente {
	private List<Cliente> clientes;

	public RepositorioClienteArrayList() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	@Override
	public void adicionarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	@Override
	public Cliente procurarClienteNome(String nome) {
		for(Cliente c: this.clientes) 
			if(c.getNome().equals(nome))
				return c;
		return null;
	}
	
	@Override
	public Cliente procurarClienteCpf(String cpf) {
		for(Cliente c: this.clientes) 
			if(c.getCpf().equals(cpf))
				return c;
		return null;
	}
	
	@Override
	public List<Cliente> listarClientes(){
		return this.clientes;
	}
	
	@Override
	public void atualizarCliente(Cliente c) {
		this.clientes.remove(c);
		this.clientes.add(c);
	}
	
	
}
