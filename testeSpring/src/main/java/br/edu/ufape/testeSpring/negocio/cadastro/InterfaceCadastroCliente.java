package br.edu.ufape.testeSpring.negocio.cadastro;

import java.util.List;

import br.edu.ufape.testeSpring.negocio.basica.Cliente;

public interface InterfaceCadastroCliente {

	List<Cliente> procurarClienteNome(String nome);

	Cliente procurarClienteId(long id);

	List<Cliente> listarClientes();

	void deletarClienteId(Long id);

	Cliente salvarCliente(Cliente entity);

	void deletarCliente(Cliente cliente);

}