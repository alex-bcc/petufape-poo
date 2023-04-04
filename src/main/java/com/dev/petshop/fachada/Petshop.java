
package com.dev.petshop.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Adm;
import com.dev.petshop.basica.Compra;
import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.ReporEstoqueException;
import com.dev.petshop.basica.Setor;
import com.dev.petshop.basica.Usuario;
import com.dev.petshop.cadastro.DepartamentoDuplicadoException;
import com.dev.petshop.cadastro.InterfaceAdm;
import com.dev.petshop.cadastro.InterfaceCompra;
import com.dev.petshop.cadastro.InterfaceDepartamento;
import com.dev.petshop.cadastro.InterfaceProduto;
import com.dev.petshop.cadastro.InterfaceSetor;
import com.dev.petshop.cadastro.InterfaceUsuario;

@Service
public class Petshop {
	@Autowired
	private InterfaceAdm cadastroAdm;
	@Autowired
	private InterfaceCompra cadastroCompra;
	@Autowired
	private InterfaceDepartamento cadastroDepartamento;
	@Autowired
	private InterfaceProduto cadastroProduto;
	@Autowired
	private InterfaceSetor cadastroSetor;
	@Autowired
	private InterfaceUsuario cadastroUsuario;
	
	public Adm procurarAdm(String login) {
		return cadastroAdm.procurarAdm(login);
	}
	public void deletarAdm(String login) {
		cadastroAdm.deletarAdm(login);
	}
	public Adm salvarAdm(Adm entity) {
		return cadastroAdm.salvarAdm(entity);
	}
	public List<Adm> listarAdm() {
		return cadastroAdm.listarAdm();
	}
	
	public Compra procurarCompra(int id) {
		return cadastroCompra.procurarCompra(id);
	}
	public Compra salvarCompra(Compra entity) {
		return cadastroCompra.salvarCompra(entity);
	}
	public List<Compra> listarCompra() {
		return cadastroCompra.listarCompra();
	}
	
	public List<Departamento> procurarDepartamento(String nome) {
		return cadastroDepartamento.procurarDepartamento(nome);
	}
	public void deletarDepartamento(int id) {
		cadastroDepartamento.deletarDepartamento(id);
	}
	public Departamento salvarDepartamento(Departamento entity) throws DepartamentoDuplicadoException{
		try {
			return cadastroDepartamento.salvarDepartamento(entity);
		}catch(DepartamentoDuplicadoException e) {
			System.out.print(e.getMessage());
		}
		return cadastroDepartamento.salvarDepartamento(entity);
	}
	public List<Departamento> listarDepartamento() {
		return cadastroDepartamento.listarDepartamento();
	}
	
	public List<Produto> procurarProdutoDepartamento(Departamento departamento){
		return cadastroProduto.procurarProdutoDepartamento(departamento);
	}
	public List<Produto> procurarProdutoSetor(Setor setor){
		return cadastroProduto.procurarProdutoSetor(setor);
	}
	
	public Produto procurarProdutoUnico(String nome){
		return cadastroProduto.procurarProdutoUnico(nome);
	}
	
	public void deletarProduto(int id) {
		cadastroProduto.deletarProduto(id);
	}
	public Produto salvarProduto(Produto entity) {
		return cadastroProduto.salvarProduto(entity);
	}
	public List<Produto> listarProduto() {
		return cadastroProduto.listarProduto();
	}
	public void reporEstoque (int quantidade,Produto produto) throws ReporEstoqueException {
		try {
			produto.reporProduto(quantidade);
		}catch(ReporEstoqueException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public List<Setor> procurarSetor(String nome){
		return cadastroSetor.procurarSetor(nome);
	}
	public void deletarSetor(int id) {
		cadastroSetor.deletarSetor(id);
	}
	public Setor salvarSetor(Setor entity) {
		return cadastroSetor.salvarSetor(entity);
	}
	public List<Setor> listarSetor() {
		return cadastroSetor.listarSetor();
	}
	
	public Usuario procurarUsuario(String email) {
		return cadastroUsuario.procurarUsuario(email);
	}
	public void deletarUsuario(String email) {
		cadastroUsuario.deletarUsuario(email);
	}
	public Usuario salvarUsuario(Usuario entity) {
		return cadastroUsuario.salvarUsuario(entity);
	}
	public List<Usuario> listarUsuario() {
		return cadastroUsuario.listarUsuario();
	}
}
	
