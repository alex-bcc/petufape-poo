package br.edu.ufape.poo.banco2.fachada;

import java.util.Date;
import java.util.List;

import br.edu.ufape.poo.banco2.basica.Agencia;
import br.edu.ufape.poo.banco2.basica.Cliente;
import br.edu.ufape.poo.banco2.basica.Conta;
import br.edu.ufape.poo.banco2.basica.IContaRentavel;
import br.edu.ufape.poo.banco2.basica.RegistroOperacao;
import br.edu.ufape.poo.banco2.cadastro.CadastroAgencia;
import br.edu.ufape.poo.banco2.cadastro.CadastroCliente;
import br.edu.ufape.poo.banco2.cadastro.CadastroConta;
import br.edu.ufape.poo.banco2.cadastro.CadastroRegistroOperacao;
import br.edu.ufape.poo.banco2.repositorio.RepositorioAgenciaArrayList;
import br.edu.ufape.poo.banco2.repositorio.RepositorioCliente;
import br.edu.ufape.poo.banco2.repositorio.RepositorioClienteArrayList;
import br.edu.ufape.poo.banco2.repositorio.RepositorioContaArrayList;
import br.edu.ufape.poo.banco2.repositorio.RepositorioRegistroOperacaoArrayList;

public class Banco {
	private CadastroAgencia cadastroAgencia;
	private CadastroCliente cadastroCliente;
	private CadastroConta cadastroConta;
	private CadastroRegistroOperacao cadastroRegistroOperacao;
	
	private static Banco instancia;
	
	public static Banco getInstancia() {
		if(instancia == null)
			Banco.instancia = new Banco();
		return instancia;
	}
	
	private  Banco() {
		this.cadastroAgencia = new CadastroAgencia(new RepositorioAgenciaArrayList());
		this.cadastroCliente = new CadastroCliente(new RepositorioClienteArrayList());
		this.cadastroConta = new CadastroConta(new RepositorioContaArrayList());
		this.cadastroRegistroOperacao = new CadastroRegistroOperacao(new RepositorioRegistroOperacaoArrayList());
	}

	public void cadastrarAgencia(Agencia a) {
		cadastroAgencia.cadastrarAgencia(a);
	}

	public Agencia procurarAgenciaCodigo(String codigo) {
		return cadastroAgencia.procurarAgenciaCodigo(codigo);
	}

	public Agencia procurarAgenciaMunicipio(String municipio) {
		return cadastroAgencia.procurarAgenciaMunicipio(municipio);
	}

	public void removerAgencia(Agencia a) {
		cadastroAgencia.removerAgencia(a);
	}

	public void atualizarAgencia(Agencia a) {
		cadastroAgencia.atualizarAgencia(a);
	}

	public List<Agencia> listarAgencias() {
		return cadastroAgencia.listarAgencias();
	}

	public RepositorioCliente getRepositorioCliente() {
		return cadastroCliente.getRepositorioCliente();
	}

	public void adicionarCliente(Cliente c) {
		cadastroCliente.adicionarCliente(c);
	}

	public Cliente procurarClienteNome(String nome) {
		return cadastroCliente.procurarClienteNome(nome);
	}

	public Cliente procurarClienteCpf(String cpf) {
		return cadastroCliente.procurarClienteCpf(cpf);
	}

	public List<Cliente> listarClientes() {
		return cadastroCliente.listarClientes();
	}

	public void atualizarCliente(Cliente c) {
		cadastroCliente.atualizarCliente(c);
	}

	public void adicionarConta(Conta c) {
		cadastroConta.adicionarConta(c);
	}

	public Conta procurarContaNumero(String numero) {
		return cadastroConta.procurarContaNumero(numero);
	}

	public List<Conta> listarContas() {
		return cadastroConta.listarContas();
	}

	public List<Conta> listarPoupancas() {
		return cadastroConta.listarPoupancas();
	}

	public void adicionarRegistroOperacao(RegistroOperacao r) {
		cadastroRegistroOperacao.adicionarRegistroOperacao(r);
	}

	public List<RegistroOperacao> listarPorConta(Conta c) {
		return cadastroRegistroOperacao.listarPorConta(c);
	}
	
	
	public void depositar(String numero, float valor) {
		Conta c = cadastroConta.procurarContaNumero(numero);
		if(c != null) {
			c.creditar(valor);
			cadastroRegistroOperacao.adicionarRegistroOperacao(
					new RegistroOperacao(
							new Date(),
							"creditar",
							valor,
							c
					)
			);
		}
	}
	
	public void renderJuros(float taxa) {
		for(Conta c : cadastroConta.listarContas()) {
			if(c instanceof IContaRentavel) {
				float valor = ((IContaRentavel)c).renderJuros(taxa);
				//cadastroConta.atualizarConta(c);
				cadastroRegistroOperacao.adicionarRegistroOperacao(
						new RegistroOperacao(
								new Date(),
								"juros mensais",
								valor,
								c
						)
				);
			}
		}
	}
	
}
