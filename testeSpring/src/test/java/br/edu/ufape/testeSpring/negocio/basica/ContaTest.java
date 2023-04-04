package br.edu.ufape.testeSpring.negocio.basica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaTest {

	@Test
	void testeCreditar() {
		Conta c = new Conta("123", 1000);
		c.creditar(500);
		assertEquals(1500, c.getSaldo());
	}
	
	@Test
	void testeDebitarSaldoSuficiente() {
		Conta c = new Conta("123", 1000);
		try {
			c.debitar(500);
			assertEquals(500, c.getSaldo());
		} catch (SaldoInsuficienteException e) {
			fail("Saldo insuficiente");
		}
		
	}
	
	@Test
	void testeDebitarSaldoInsuficiente() {
		Conta c = new Conta("123", 1000);
		try {
			c.debitar(5000);
			fail("Não deveria debitar com saldo insuficiente");
		} catch(Exception e) {
			assertEquals(1000, c.getSaldo());
		}

	}

}
