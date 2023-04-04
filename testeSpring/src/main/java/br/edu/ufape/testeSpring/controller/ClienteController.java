package br.edu.ufape.testeSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.testeSpring.negocio.basica.Cliente;
import br.edu.ufape.testeSpring.negocio.basica.Conta;
import br.edu.ufape.testeSpring.negocio.cadastro.ContaDuplicadaException;
import br.edu.ufape.testeSpring.negocio.fachada.Banco;

@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class ClienteController {
	@Autowired
	private Banco banco;
	
	@PostMapping(value = "/cliente")
	public ResponseEntity<Cliente> adicionarCliente(@RequestBody Cliente c) {
		return ResponseEntity.ok(banco.salvarCliente(c));
	}
	
	@PostMapping(value = "/cliente/{clienteId}/conta")
	public ResponseEntity<Conta> adicionarContaCliente(@RequestBody Conta c, @PathVariable long clienteId) {
		try {
			return ResponseEntity.ok(banco.adicionarContaUsuario(clienteId, c));
		} catch(ContaDuplicadaException ex) {
			return new ResponseEntity<Conta> (HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/cliente/{clienteId}")
	public ResponseEntity<Cliente> carregarCliente(@PathVariable long clienteId) {
		return ResponseEntity.ok(banco.procurarClienteId(clienteId));
	}
	
	@PatchMapping(value = "/cliente/{clienteId}" )
	public ResponseEntity<Cliente> atualizarCliente(@RequestBody Cliente c, @PathVariable long clienteId) {
		return ResponseEntity.ok(banco.atualizarCliente(c));
	}

}
