package com.dev.petshop.cadastro;

import java.util.List;

import com.dev.petshop.basica.Usuario;

public interface InterfaceUsuario {

	Usuario procurarUsuario(String email);
	
	void deletarUsuario(String email);
	
	Usuario salvarUsuario(Usuario entity);
	
	List<Usuario> listarUsuario();
}
