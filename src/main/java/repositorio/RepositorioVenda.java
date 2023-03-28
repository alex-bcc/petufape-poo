package repositorio;

import java.util.List;

import com.dev.petshop.basica.Venda;

public interface RepositorioVenda {

	void adicionarVenda(Venda r);

	List<Venda> listarPorVenda(int id);
}
