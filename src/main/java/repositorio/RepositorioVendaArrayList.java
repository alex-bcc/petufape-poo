package repositorio;

import java.util.ArrayList;
import java.util.List;

import com.dev.petshop.basica.Venda;

public class RepositorioVendaArrayList implements RepositorioVenda{
private List<Venda> venda;
	
	public RepositorioVendaArrayList() {
		this.venda = new ArrayList<Venda>();
	}
	
	@Override
	public void adicionarVenda(Venda r) {
		this.venda.add(r);
	}
	
	@Override
	public List<Venda> listarPorVenda(int id) {
		return this.venda.stream()
				.filter(venda -> venda.getId()==id)
				.toList();
	}

}
