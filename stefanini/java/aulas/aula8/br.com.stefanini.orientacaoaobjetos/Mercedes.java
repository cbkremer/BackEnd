package br.com.stefanini.orientacaoaobjetos;

public class Mercedes extends Carro {
	public Mercedes() {
		this.setMarca("Mercedes");
	}
	@Override
	public String acelerar() {
		return "A Mercedes poss�i uma acelera��o diferente para cada modelo.";
	}
	
}
