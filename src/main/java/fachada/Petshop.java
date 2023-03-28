package fachada;

import java.util.List;

import com.dev.petshop.basica.Adm;
import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.Setor;
import com.dev.petshop.basica.Usuario;
import com.dev.petshop.basica.Venda;

import cadastro.CadastroAdm;
import cadastro.CadastroDepartamento;
import cadastro.CadastroProduto;
import cadastro.CadastroSetor;
import cadastro.CadastroUsuario;
import cadastro.CadastroVenda;
import repositorio.RepositorioAdmArrayList;
import repositorio.RepositorioDepartamentoArrayList;
import repositorio.RepositorioProdutoArrayList;
import repositorio.RepositorioSetorArrayList;
import repositorio.RepositorioUsuario;
import repositorio.RepositorioUsuarioArrayList;
import repositorio.RepositorioVendaArrayList;

public class Petshop {
	private CadastroAdm cadastroAdm;
	private CadastroUsuario cadastroUsuario;
	private CadastroDepartamento cadastroDepartamento;
	private CadastroSetor cadastroSetor;
	private CadastroProduto cadastroProduto;
	private CadastroVenda cadastroVenda;
	
	private static Petshop instancia;
	
	public static Petshop getInstancia() {
		if(instancia == null)
			Petshop.instancia = new Petshop();
		return instancia;
	}
	
	private  Petshop() {
		this.cadastroAdm = new CadastroAdm(new RepositorioAdmArrayList());
		this.cadastroUsuario = new CadastroUsuario(new RepositorioUsuarioArrayList());
		this.cadastroDepartamento = new CadastroDepartamento(new RepositorioDepartamentoArrayList());
		this.cadastroSetor = new CadastroSetor(new RepositorioSetorArrayList());
		this.cadastroProduto = new CadastroProduto(new RepositorioProdutoArrayList());
		this.cadastroVenda = new CadastroVenda(new RepositorioVendaArrayList());
	}
	
	public void cadastrarAdm(Adm a){
		cadastroAdm.cadastrarAdm(a);
	}
	
	public Adm procurarAdm(String login){
		return cadastroAdm.procurarAdm(login);
	}
	
	public void removerAdm(Adm a) {
		cadastroAdm.removerAdm(a);
	}
	
	public void atualizarAdm(Adm a) {
		cadastroAdm.atualizarAdm(a);
	}
	
	public List<Adm> listarAdm(){
		return cadastroAdm.listarAdm();
	}
	
	public RepositorioUsuario getRepositorioUsuario() {
		return cadastroUsuario.getRepositorioUsuario();
	}
	
	public Usuario procurarCliente(String email) {
		return cadastroUsuario.procurarUsuario(email);
	}

	public List<Usuario> listarUsuario() {
		return cadastroUsuario.listarUsuario();
	}

	public void atualizarUsuario(Usuario c) {
		cadastroUsuario.atualizarUsuario(c);
	}
	
	public void cadastrarDepartamento(Departamento a){
		cadastroDepartamento.cadastrarDepartamento(a);
	}
	
	public Departamento procurarDepartamentoId(int id){
		return cadastroDepartamento.procurarDepartamentoId(id);
	}
	
	public void removerDepartamento(Departamento a) {
		cadastroDepartamento.removerDepartamento(a);
	}
	
	public void atualizarDepartamento(Departamento a) {
		cadastroDepartamento.atualizarDepartamento(a);
	}
	
	public List<Departamento> listarDepartamento(){
		return cadastroDepartamento.listarDepartamento();
	}
	
	public void cadastrarProduto(Produto a){
		cadastroProduto.cadastrarProduto(a);
	}
	
	public Produto procurarProdutoId(int id){
		return cadastroProduto.procurarProdutoId(id);
	}
	
	public void removerProduto(Produto a) {
		cadastroProduto.removerProduto(a);
	}
	
	public void atualizarProduto(Produto a) {
		cadastroProduto.atualizarProduto(a);
	}
	
	public List<Produto> listarProduto(){
		return cadastroProduto.listarProduto();
	}
	
	public void cadastrarSetor(Setor a){
		cadastroSetor.cadastrarSetor(a);
	}
	
	public Setor procurarSetorId(int id){
		return cadastroSetor.procurarSetorId(id);
	}
	
	public void removerSetor(Setor a) {
		cadastroSetor.removerSetor(a);
	}
	
	public void atualizarSetor(Setor a) {
		cadastroSetor.atualizarSetor(a);
	}
	
	public List<Setor> listarSetor(){
		return cadastroSetor.listarSetor();
	}

	public void adicionarVenda(Venda r) {
		cadastroVenda.adicionarVenda(r);
	}

	public List<Venda> listarPorVenda(int id) {
		return cadastroVenda.listarPorVenda(id);
	}
	
	
}	
