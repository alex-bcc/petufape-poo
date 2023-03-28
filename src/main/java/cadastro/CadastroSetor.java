package cadastro;

import java.util.List;

import com.dev.petshop.basica.Setor;

import repositorio.RepositorioSetor;


public class CadastroSetor {
private RepositorioSetor repositorioSetor;
	
	public CadastroSetor(RepositorioSetor repositorioSetor) {
		this.repositorioSetor= repositorioSetor;
	}

	public void cadastrarSetor(Setor a) {
		repositorioSetor.cadastrarSetor(a);
	}
	
	public Setor procurarSetorId(int id) {
		return repositorioSetor.procurarSetorId(id);
	}
	
	public void removerSetor(Setor a) {
		repositorioSetor.removerSetor(a);
	}

	public void atualizarSetor(Setor a) {
		repositorioSetor.atualizarSetor(a);
	}

	public List<Setor> listarSetor() {
		return repositorioSetor.listarSetor();
	}
}
