package repositorio;

import java.util.List;

import com.dev.petshop.basica.Usuario;

public interface RepositorioUsuario {

	void cadastrarUsuario(Usuario a);

	Usuario procurarUsuario(String email);

	void removerUsuario(Usuario a);

	void atualizarUsuario(Usuario a);

	List<Usuario> listarUsuario();
}
