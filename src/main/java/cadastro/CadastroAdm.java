package cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Adm;

import colecao.ColecaoAdm;

@Service
public class CadastroAdm implements InterfaceAdm {
	@Autowired
	private ColecaoAdm colecaoAdm;
	
	@Override
	public Adm procurarAdm(String login) {
		return colecaoAdm.findByLogin(login);
	}
	
	@Override
	public void deletarAdm(String login) {
		colecaoAdm.delete(colecaoAdm.findByLogin(login));
	}

	@Override
	public Adm salvarAdm(Adm entity) {
		return colecaoAdm.save(entity);
	}

	@Override
	public List<Adm> listarAdm() {
		return colecaoAdm.findAll();
	}
}
