package com.dev.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.petshop.basica.Compra;
import com.dev.petshop.basica.ReduzirEstoqueException;
import com.dev.petshop.fachada.Petshop;


@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class CompraController {
	@Autowired(required = true)
	private Petshop petshop;
	
	@PostMapping(value = "/compra")
	public ResponseEntity<Compra> adicionarCompra(@RequestBody Compra c) throws ReduzirEstoqueException {
		try {
			return ResponseEntity.ok(petshop.salvarCompra(c));
			}catch (ReduzirEstoqueException e) {
				return new ResponseEntity<Compra>(HttpStatus.BAD_REQUEST);
			}
	}
	
	@GetMapping(value="/compra")
	public ResponseEntity<List<Compra>> carregarCompra(){
		return ResponseEntity.ok(petshop.listarCompra());
	}
	
	
}
