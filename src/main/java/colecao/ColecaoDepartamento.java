package colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.petshop.basica.Departamento;

@Repository
public interface ColecaoDepartamento 
	extends JpaRepository<Departamento, Integer>{
	
	public List<Departamento> findByNomeContaining(String nome);
	
}