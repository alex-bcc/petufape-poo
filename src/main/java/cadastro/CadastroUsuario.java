package cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Usuario;

import colecao.ColecaoUsuario;

@Service
public class CadastroUsuario implements InterfaceUsuario {
	@Autowired
	private ColecaoUsuario colecaoUsuario;
	
	@Override
	public Usuario procurarUsuario(String email) {
		return colecaoUsuario.findByEmail(email);
	}
	
	@Override
	public void deletarUsuario(String email) {
		colecaoUsuario.delete(colecaoUsuario.findByEmail(email));
	}

	@Override
	public Usuario salvarUsuario(Usuario entity) {
		return colecaoUsuario.save(entity);
	}

	@Override
	public List<Usuario> listarUsuario() {
		return colecaoUsuario.findAll();
	}
}
