package cadastro;

import java.util.List;

import com.dev.petshop.basica.Departamento;

public interface InterfaceDepartamento {

	List<Departamento> procurarDepartamento(String nome);
	
	void deletarDepartamento(int id);
	
	Departamento salvarDepartamento(Departamento entity);
	
	List<Departamento> listarDepartamento();
}
