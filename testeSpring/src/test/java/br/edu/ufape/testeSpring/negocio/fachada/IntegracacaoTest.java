package br.edu.ufape.testeSpring.negocio.fachada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.testeSpring.negocio.basica.Conta;

@SpringBootTest
class IntegracacaoTest {
	@Autowired
	private Banco banco;

	@Test
	void cadastrarDuasContasMesmoNumeroTest() {
		Conta c1 = new Conta("123", 1000);
		Conta c2 = new Conta("123", 2000);
		try {
			banco.salvarConta(c1);
			banco.salvarConta(c2);
			fail("Nao deveria cadastrar duas contas com mesmo numero");
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(true, "Ok");
		}
		
	}

}
