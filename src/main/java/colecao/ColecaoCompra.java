package colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.petshop.basica.Compra;

@Repository
public interface ColecaoCompra 
	extends JpaRepository<Compra, Integer>{
	
	public List<Compra> findByIdContaining(int Id);
}
