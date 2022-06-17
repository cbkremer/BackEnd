package br.com.stefanini.orientacaoaobjetos.entidade;

import br.com.stefanini.orientacaoaobjetos.Carro;

public class BMW extends Carro{
	public BMW() {
		this.setMarca("BMW");
	}
	
	@Override
	public String acelerar() {
		return "A bmw pode fazer de 0 a "+this.getVelocidade()+" em 5s";
	}
}
