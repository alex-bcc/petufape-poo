package br.edu.ufape.testeSpring.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ufape.testeSpring.dado.ColecaoCliente;
import br.edu.ufape.testeSpring.negocio.basica.Cliente;

public class CadastroCliente implements InterfaceCadastroCliente {
	@Autowired
	private ColecaoCliente colecaoCliente;

	@Override
	public List<Cliente> procurarClienteNome(String nome) {
		return colecaoCliente.findByNomeContaining(nome);
	}
	
	@Override
	public Cliente procurarClienteId(long id) {
		return colecaoCliente.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> listarClientes() {
		return colecaoCliente.findAll();
	}

	@Override
	public void deletarClienteId(Long id) {
		colecaoCliente.deleteById(id);
	}

	@Override
	public Cliente salvarCliente(Cliente entity) {
		return colecaoCliente.save(entity);
	}
	
	@Override
	public void deletarCliente(Cliente cliente) {
		colecaoCliente.delete(cliente);
	}
}
