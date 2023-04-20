package com.dev.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.ReporEstoqueException;
import com.dev.petshop.basica.Setor;
import com.dev.petshop.cadastro.ProdutoDuplicadoException;
import com.dev.petshop.fachada.Petshop;
import com.dev.petshop.fachada.parametrosInvalidosException;
import com.dev.petshop.fachada.produtoInvalidoException;

@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class ProdutoController {
	@Autowired(required = true)
	private Petshop petshop;
	
	@PostMapping(value = "/produto")
	public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto c)throws ProdutoDuplicadoException {
		try {
			return ResponseEntity.ok(petshop.salvarProduto(c));
		} catch (ProdutoDuplicadoException e) {
			return new ResponseEntity<Produto>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping(value = "/produto/reporEstoque")
	public ResponseEntity<Produto> reporEstoque(@RequestParam(value = "produto") Integer produto,@RequestParam(value = "i") int i) throws produtoInvalidoException {
		try {
		return ResponseEntity.ok(petshop.reporEstoque(i, produto));
		}catch (ReporEstoqueException e) {
			return new ResponseEntity<Produto>(HttpStatus.BAD_REQUEST);
		}catch(produtoInvalidoException e) {
			return new ResponseEntity<Produto>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/produto/{produtoNome}")
	public ResponseEntity<Produto> carregarProduto(@PathVariable String produtoNome) {
		//return ResponseEntity.ok(produtoNome);
		return ResponseEntity.ok(petshop.procurarProdutoUnico(produtoNome));
	}
	
	@GetMapping(value="/produto/departamento/{departamento}/setor/{setor}")
	public ResponseEntity<List<Produto>> carregarProdutoDepartamentoSetor(@PathVariable Integer departamento, @PathVariable Integer setor)throws parametrosInvalidosException{
		try {
			return ResponseEntity.ok(petshop.procurarProdutoDepartamentoSetor(departamento, setor));
		} catch (parametrosInvalidosException e) {
			return new ResponseEntity<List<Produto>>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value="/produto/setor")
	public ResponseEntity<List<Produto>> carregarProdutoSetor(@PathVariable Setor setor){
		return ResponseEntity.ok(petshop.procurarProdutoSetor(setor));
	}
	@GetMapping(value="/produto")
	public ResponseEntity<List<Produto>> carregarProduto(){
		return ResponseEntity.ok(petshop.listarProduto());
	}
}
