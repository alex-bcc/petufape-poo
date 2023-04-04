package br.edu.ufape.testeSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.testeSpring.controller.dto.CreditoDebitoRequest;
import br.edu.ufape.testeSpring.controller.dto.TransferirRequest;
import br.edu.ufape.testeSpring.negocio.basica.Conta;
import br.edu.ufape.testeSpring.negocio.cadastro.ContaDuplicadaException;
import br.edu.ufape.testeSpring.negocio.cadastro.ContaNaoExisteException;
import br.edu.ufape.testeSpring.negocio.fachada.Banco;
import jakarta.validation.Valid;

@CrossOrigin (origins = "http://localhost:3000/" )
@RestController
public class ContaController {
	@Autowired
	private Banco banco;
	
	@PostMapping(value = "/conta/creditar")
	public ResponseEntity<String> creditar(@RequestBody @Valid CreditoDebitoRequest opcao) {
		try {
			banco.creditar(opcao.getNumero(), opcao.getValor());
			return ResponseEntity.ok("Credito realizado");
		} catch (ContaNaoExisteException e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping(value = "/conta/transferir")
	public ResponseEntity<String> transferir(@RequestBody @Valid TransferirRequest dados) {
		try {
			banco.transferir(dados.getContaOrigem(), dados.getContaDestino(), dados.getValor());
			return ResponseEntity.ok("Transferencia realizada com sucesso");
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	@PostMapping(value = "/conta")
	public ResponseEntity<String> cadastrarConta(@RequestBody Conta c) {
		try {
			banco.salvarConta(c);
			return ResponseEntity.ok("OK");
		} catch (ContaDuplicadaException e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}


}
