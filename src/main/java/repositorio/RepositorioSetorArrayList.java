package repositorio;

import java.util.ArrayList;
import java.util.List;

import com.dev.petshop.basica.Setor;

public class RepositorioSetorArrayList implements RepositorioSetor {
private List<Setor> setor;
	
	public RepositorioSetorArrayList() {
		this.setor = new ArrayList<Setor>();
	}
	
	@Override
	public void cadastrarSetor(Setor a) {
		this.setor.add(a);
	}

	@Override
	public Setor procurarSetorId(int id) {
		return this.setor.stream()
			.filter(setor -> setor.getId()==id)
			.findAny()
			.orElse(null);
	}

	@Override
	public void removerSetor(Setor a) {
		this.setor.remove(a);
	}

	@Override
	public void atualizarSetor(Setor a) {
		this.setor.remove(a);
		this.setor.add(a);
	}
	
	@Override
	public List<Setor> listarSetor() {
		return this.setor;
	}


}
