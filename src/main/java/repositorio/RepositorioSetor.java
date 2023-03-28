package repositorio;

import java.util.List;

import com.dev.petshop.basica.Setor;

public interface RepositorioSetor {

	void cadastrarSetor(Setor a);

	Setor procurarSetorId(int id);

	void removerSetor(Setor a);

	void atualizarSetor(Setor a);

	List<Setor> listarSetor();
}
