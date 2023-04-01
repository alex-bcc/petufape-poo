package cadastro;

import java.util.List;

import com.dev.petshop.basica.Produto;

public interface InterfaceProduto {

	List<Produto> procurarProduto(String nome);
	
	void deletarProduto(int id);
	
	Produto salvarProduto(Produto entity);
	
	List<Produto> listarProduto();
}
