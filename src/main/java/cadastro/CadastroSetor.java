package cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Setor;

import colecao.ColecaoSetor;


@Service
public class CadastroSetor implements InterfaceSetor{
	@Autowired
	private ColecaoSetor colecaoSetor;
	
	@Override
	public List<Setor> procurarSetor(String nome){
		return colecaoSetor.findByNomeContaining(nome);
	}
	
	@Override
	public void deletarSetor(int id) {
		colecaoSetor.deleteById(id);
	}

	@Override
	public Setor salvarSetor(Setor entity) {
		return colecaoSetor.save(entity);
	}

	@Override
	public List<Setor> listarSetor() {
		return colecaoSetor.findAll();
	}
}
