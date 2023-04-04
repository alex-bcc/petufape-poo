package br.edu.ufape.testeSpring.dado;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.testeSpring.negocio.basica.Conta;

public interface ColecaoConta extends JpaRepository<Conta, Long> {
	public Conta findByNumero(String numero);
}
