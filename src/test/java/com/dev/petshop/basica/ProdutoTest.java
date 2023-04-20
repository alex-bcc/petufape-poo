package com.dev.petshop.basica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void testeReporProdutoSuficiente() {
		Produto t = new Produto("racao",100);
		try {
			t.reporProduto(100);
			assertEquals(200, t.getEstoque());
		} catch (ReporEstoqueException e) {
			System.out.print(e.getMessage());
		}
	}
	@Test
	void testeReporProdutoInsuficiente() {
		Produto t = new Produto("racao",100);
		try {
			t.reporProduto(-100);
			fail("não deveria funcionar com quantidade negativa");
		} catch (ReporEstoqueException e) {
			assertEquals(100, t.getEstoque());
			
		}
	}
	@Test
	void testeReduzirProduto() throws ReduzirEstoqueException {
		Produto t = new Produto("racao",100);
		try {
			t.reduzirProduto(5);
			assertEquals(95, t.getEstoque());
		} catch (ReduzirEstoqueException e) {
			System.out.print(e.getMessage());
			
			
		}
	}

}
