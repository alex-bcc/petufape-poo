package cadastro;

import java.util.List;

import com.dev.petshop.basica.Usuario;

import repositorio.RepositorioUsuario;

public class CadastroUsuario {
	private RepositorioUsuario repositorioUsuario;
	
	public CadastroUsuario(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}
	
	public RepositorioUsuario getRepositorioUsuario() {
		return repositorioUsuario;
	}

	public void setRepositorioUsuario(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}

	public Usuario procurarUsuario(String email) {
		return repositorioUsuario.procurarUsuario(email);
	}
	
	public List<Usuario> listarUsuario() {
		return repositorioUsuario.listarUsuario();
	}

	public void atualizarUsuario(Usuario c) {
		repositorioUsuario.atualizarUsuario(c);
	}
}
