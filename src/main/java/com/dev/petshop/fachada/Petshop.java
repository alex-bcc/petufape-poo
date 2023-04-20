
package com.dev.petshop.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Adm;
import com.dev.petshop.basica.Compra;
import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Item;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.ReduzirEstoqueException;
import com.dev.petshop.basica.ReporEstoqueException;
import com.dev.petshop.basica.Setor;
import com.dev.petshop.cadastro.DepartamentoDuplicadoException;
import com.dev.petshop.cadastro.InterfaceAdm;
import com.dev.petshop.cadastro.InterfaceCompra;
import com.dev.petshop.cadastro.InterfaceDepartamento;
import com.dev.petshop.cadastro.InterfaceProduto;
import com.dev.petshop.cadastro.InterfaceSetor;
import com.dev.petshop.cadastro.InterfaceUsuario;
import com.dev.petshop.cadastro.ProdutoDuplicadoException;

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
	public Compra salvarCompra(Compra entity) throws ReduzirEstoqueException {
		for(Item i : entity.getItem()) {
			i.setProduto(cadastroProduto.procurarProdutoId(i.getProduto().getId()));
			i.getProduto().reduzirProduto(i.getQuantidade());
		}	
		entity.calcularTotal();
		return cadastroCompra.salvarCompra(entity);
	}
	public List<Compra> listarCompra() {
		return cadastroCompra.listarCompra();
	}
	
	public List<Departamento> procurarDepartamento(String nome) {
		return cadastroDepartamento.procurarDepartamento(nome);
	}
	
	public Departamento procurarDepartamentoId(int id) {
		return cadastroDepartamento.procurarDepartamentoId(id);
	}
	public void deletarDepartamento(int id) {
		cadastroDepartamento.deletarDepartamento(id);
	}
	public Departamento salvarDepartamento(Departamento entity) throws DepartamentoDuplicadoException{
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
	public Produto procurarProdutoId(int id){
		return cadastroProduto.procurarProdutoId(id);
	}
	
	public List<Produto> procurarProdutoDepartamentoSetor(Integer departamento, Integer setor) throws parametrosInvalidosException{
		if(departamento < 0 && setor < 0) {
			throw new parametrosInvalidosException();
		}else {
			return cadastroProduto.listarProdutoDepartamentoSetor(procurarDepartamentoId(departamento),procurarSetorId(setor));
		}
	}
	
	public void deletarProduto(int id) {
		cadastroProduto.deletarProduto(id);
	}
	public Produto salvarProduto(Produto entity) throws ProdutoDuplicadoException {
		return cadastroProduto.salvarProduto(entity);
	}
	public List<Produto> listarProduto() {
		return cadastroProduto.listarProduto();
	}
	public Produto reporEstoque (int quantidade,Integer produto) throws ReporEstoqueException, produtoInvalidoException{
			if(produto > 0) {
			Produto p = procurarProdutoId(produto);
			p.reporProduto(quantidade);
			return atualizarProduto(p);
			}else {
				throw new produtoInvalidoException();
			}
			
	}
	
	public Setor procurarSetor(String nome){
		return cadastroSetor.procurarSetorUnico(nome);
	}
	public Setor procurarSetorId(int id){
		return cadastroSetor.procurarSetorId(id);
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
	public Produto atualizarProduto(Produto produto) {
		return cadastroProduto.atualizarProduto(produto);
	}
	
}
	
