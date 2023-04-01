package cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.petshop.basica.Compra;

import colecao.ColecaoCompra;


@Service
public class CadastroCompra implements InterfaceCompra{
	@Autowired
	private ColecaoCompra colecaoCompra;

	@Override
	public Compra procurarCompra(int id) {
		Optional<Compra> obj = colecaoCompra.findById(id);
		return obj.get();
	}
	
	@Override
	public Compra salvarCompra(Compra entity) {
		return colecaoCompra.save(entity);
	}

	@Override
	public List<Compra> listarCompra() {
		return colecaoCompra.findAll();
	}
	
}
