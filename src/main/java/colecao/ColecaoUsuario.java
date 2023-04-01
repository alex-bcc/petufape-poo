package colecao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.petshop.basica.Usuario;

@Repository
public interface ColecaoUsuario
    extends JpaRepository<Usuario, Integer>{
	
	public List<Usuario> findByEmailContaining(String email);
	
	public Usuario findByEmail(String email);
}
