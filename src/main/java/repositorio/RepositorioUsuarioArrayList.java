package repositorio;

import java.util.ArrayList;
import java.util.List;

import com.dev.petshop.basica.Usuario;

public class RepositorioUsuarioArrayList implements RepositorioUsuario{
	private List<Usuario> usuario;
	
	public RepositorioUsuarioArrayList() {
		this.usuario = new ArrayList<Usuario>();
	}
	
	@Override
	public void cadastrarUsuario(Usuario a) {
		this.usuario.add(a);
	}

	@Override
	public Usuario procurarUsuario(String email) {
		return this.usuario.stream()
			.filter(usuario -> usuario.getEmail().equals(email))
			.findAny()
			.orElse(null);
	}

	@Override
	public void removerUsuario(Usuario a) {
		this.usuario.remove(a);
	}

	@Override
	public void atualizarUsuario(Usuario a) {
		this.usuario.remove(a);
		this.usuario.add(a);
	}
	
	@Override
	public List<Usuario> listarUsuario() {
		return this.usuario;
	}

}
