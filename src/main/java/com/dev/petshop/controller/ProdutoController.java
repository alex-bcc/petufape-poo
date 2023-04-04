package com.dev.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.basica.Produto;
import com.dev.petshop.basica.Setor;
import com.dev.petshop.fachada.Petshop;

@CrossOrigin (origins = "http://localhost:8090/" )
@RestController
public class ProdutoController {
	@Autowired(required = true)
	private Petshop petshop;
	
	@PostMapping(value = "/produto")
	public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto c) {
		return ResponseEntity.ok(petshop.salvarProduto(c));
	}
	
	@GetMapping(value = "/produto/{produtoNome}")
	public ResponseEntity<Produto> carregarProduto(@PathVariable String produtoNome) {
		return ResponseEntity.ok(petshop.procurarProdutoUnico(produtoNome));
	}
	
	@GetMapping(value="/produto/departamento")
	public ResponseEntity<List<Produto>> carregarProdutoDepartamento(@PathVariable Departamento departamento){
		return ResponseEntity.ok(petshop.procurarProdutoDepartamento(departamento));
	}
	
	@GetMapping(value="/produto/setor")
	public ResponseEntity<List<Produto>> carregarProdutoSetor(@PathVariable Setor setor){
		return ResponseEntity.ok(petshop.procurarProdutoSetor(setor));
	}
}
