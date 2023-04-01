package cadastro;

import java.util.List;

import com.dev.petshop.basica.Setor;

public interface InterfaceSetor {

	List<Setor> procurarSetor(String nome);
	
	void deletarSetor(int id);
	
	Setor salvarSetor(Setor entity);
	
	List<Setor> listarSetor();
}
