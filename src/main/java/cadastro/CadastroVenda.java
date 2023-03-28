package cadastro;

import java.util.List;

import com.dev.petshop.basica.Venda;

import repositorio.RepositorioVenda;

public class CadastroVenda {
	private RepositorioVenda repositorioVenda;

	public CadastroVenda(RepositorioVenda repositorioVenda) {
		this.repositorioVenda = repositorioVenda;
	}

	public void adicionarVenda(Venda r) {
		repositorioVenda.adicionarVenda(r);
	}

	public List<Venda> listarPorVenda(int id) {
		return repositorioVenda.listarPorVenda(id);
	}
	
}
