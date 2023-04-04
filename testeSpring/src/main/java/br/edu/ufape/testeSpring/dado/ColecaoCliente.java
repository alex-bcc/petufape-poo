package br.edu.ufape.testeSpring.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ufape.testeSpring.negocio.basica.Cliente;

@Repository
public interface ColecaoCliente 
	extends JpaRepository<Cliente, Long> {
	
	public List<Cliente> findByNomeContaining(String nome);

}
