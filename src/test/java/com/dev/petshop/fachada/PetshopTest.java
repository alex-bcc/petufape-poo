package com.dev.petshop.fachada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dev.petshop.basica.Departamento;
import com.dev.petshop.cadastro.DepartamentoDuplicadoException;

@SpringBootTest
class PetshopTest {
	
	@Autowired
	private Petshop petshop;

	@Test
	void cadastrarDoisDepartamentosMesmoNomeTest() {
		Departamento d1 = new Departamento("Cachorro");
		Departamento d2 = new Departamento("Cachorro");
		try {
			petshop.salvarDepartamento(d1);
			petshop.salvarDepartamento(d2);
			fail("Nao deveria cadastrar dois departamentos com mesmo nome");
		} catch (DepartamentoDuplicadoException e) {
			assertTrue(true, "Ok");
		}
		
	}

}
