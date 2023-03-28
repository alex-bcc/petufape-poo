package br.edu.ufape.poo.banco2.repositorio;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Cliente;

public interface RepositorioCliente {

	void adicionarCliente(Cliente c);

	Cliente procurarClienteNome(String nome);

	Cliente procurarClienteCpf(String cpf);

	List<Cliente> listarClientes();

	void atualizarCliente(Cliente c);

}