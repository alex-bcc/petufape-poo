package cadastro;

import java.util.List;

import com.dev.petshop.basica.Compra;

public interface InterfaceCompra {

	Compra procurarCompra(int id);
	
	Compra salvarCompra(Compra entity);
	
	List<Compra> listarCompra();
	
}
