package com.dev.petshop.basica;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ItemTest {

	@Test
	void testeSubtotal() {
		Produto p = new Produto("racao",100,new BigDecimal(20));
		Item i = new Item(5,p);
		
		i.calcularSubProduto();
		assertEquals(new BigDecimal(100), i.getPrecoUnit());
		
	}

}
