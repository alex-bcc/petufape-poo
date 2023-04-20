package com.dev.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.petshop.basica.Setor;
import com.dev.petshop.fachada.Petshop;

@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class SetorController {
	@Autowired(required = true)
	private Petshop petshop;
	
	@PostMapping(value = "/setor")
	public ResponseEntity<Setor> adicionarSetor(@RequestBody Setor c) {
		return ResponseEntity.ok(petshop.salvarSetor(c));
	}
	@GetMapping(value="/setor")
	public ResponseEntity<List<Setor>> carregarSetor(){
		return ResponseEntity.ok(petshop.listarSetor());
	}
}
