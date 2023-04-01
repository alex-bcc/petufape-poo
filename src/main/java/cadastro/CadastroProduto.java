package cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Produto;

import colecao.ColecaoProduto;

@Service
public class CadastroProduto implements InterfaceProduto{
	@Autowired
	private ColecaoProduto colecaoProduto;
	
	@Override
	public List<Produto> procurarProduto(String nome){
		return colecaoProduto.findByNomeContaining(nome);
	}
	
	@Override
	public void deletarProduto(int id) {
		colecaoProduto.deleteById(id);
	}

	@Override
	public Produto salvarProduto(Produto entity) {
		return colecaoProduto.save(entity);
	}

	@Override
	public List<Produto> listarProduto() {
		return colecaoProduto.findAll();
	}
}
