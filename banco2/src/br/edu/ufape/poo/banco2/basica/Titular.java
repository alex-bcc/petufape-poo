package br.edu.ufape.poo.banco2.basica;

public class Titular {
	private long id;
	private Cliente cliente;
	private int ordem;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public Titular(Cliente cliente, int ordem) {
		this.cliente = cliente;
		this.ordem = ordem;
	}
	public Titular() {
	}
	
}
