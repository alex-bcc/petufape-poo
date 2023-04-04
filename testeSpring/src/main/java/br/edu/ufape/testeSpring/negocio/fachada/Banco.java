package br.edu.ufape.testeSpring.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.testeSpring.negocio.basica.Cliente;
import br.edu.ufape.testeSpring.negocio.basica.Conta;
import br.edu.ufape.testeSpring.negocio.cadastro.InterfaceCadastroCliente;
import br.edu.ufape.testeSpring.negocio.cadastro.InterfaceCadastroConta;

@Service
public class Banco {
	@Autowired
	private InterfaceCadastroCliente cadastroCliente;
	@Autowired
	private InterfaceCadastroConta cadastroConta;
	public List<Cliente> procurarClienteNome(String nome) {
		return cadastroCliente.procurarClienteNome(nome);
	}
	public Cliente procurarClienteId(long id) {
		return cadastroCliente.procurarClienteId(id);
	}
	public List<Cliente> listarClientes() {
		return cadastroCliente.listarClientes();
	}
	public void deletarClienteId(Long id) {
		cadastroCliente.deletarClienteId(id);
	}
	public Cliente salvarCliente(Cliente entity) {
		return cadastroCliente.salvarCliente(entity);
	}
	public void deletarCliente(Cliente cliente) {
		cadastroCliente.deletarCliente(cliente);
	}
	public Conta procurarContaId(long id) {
		return cadastroConta.procurarContaId(id);
	}
	public Conta procurarContaNumero(String numero) {
		return cadastroConta.procurarContaNumero(numero);
	}
	public Conta salvarConta(Conta c) {
		return cadastroConta.salvarConta(c);
	}
	public void deletarConta(Conta c) {
		cadastroConta.deletarConta(c);
	}
	
	public void creditar(String numero, float valor) {
		Conta c = cadastroConta.procurarContaNumero(numero);
		if(c != null) {
			c.creditar(valor);
			cadastroConta.salvarConta(c);
		}
	}
	
	

}
