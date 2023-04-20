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

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.cadastro.DepartamentoDuplicadoException;
import com.dev.petshop.fachada.Petshop;

@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class DepartamentoController {
	@Autowired(required = true)
	private Petshop petshop;
	
	@PostMapping(value = "/departamento")
	public ResponseEntity<Departamento> adicionarDepartamento(@RequestBody Departamento c) {
		try {
			return ResponseEntity.ok(petshop.salvarDepartamento(c));
		} catch (DepartamentoDuplicadoException e) {
			return new ResponseEntity<Departamento>(HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping(value="/departamento")
	public ResponseEntity<List<Departamento>> carregarDepartamento(){
		return ResponseEntity.ok(petshop.listarDepartamento());
	}

}

