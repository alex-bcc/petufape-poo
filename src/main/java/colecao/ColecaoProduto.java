package colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.petshop.basica.Produto;

@Repository
public interface ColecaoProduto 
	extends JpaRepository<Produto, Integer>{
	
	public List<Produto> findByNomeContaining(String nome);
}
