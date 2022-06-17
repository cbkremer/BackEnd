package br.com.stefanini.orientacaoaobjetos.executor;

import br.com.stefanini.orientacaoaobjetos.Carro;
import br.com.stefanini.orientacaoaobjetos.Mercedes;
import br.com.stefanini.orientacaoaobjetos.entidade.BMW;


public class Executor {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.setMarca("BMW");	 
		carro1.setModelo("320i");
		carro1.setChassi(9999);
		carro1.setPlaca("AAA9999");
		carro1.setBancos(5);
		carro1.setRoda(5);
		carro1.setVelocidade(280);
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getChassi());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getBancos());
		System.out.println(carro1.getRoda());
		
		System.out.println(carro1.acelerar());
		
		/*carro1.marca = carro1.getMarca();
		carro1.modelo = "320i";
		carro1.chassi = 9999;
		carro1.placa = "AAA9999";
		carro1.bancos = 5;
		carro1.roda = 20;
		
		System.out.println(carro1.marca);
		System.out.println(carro1.modelo);
		System.out.println(carro1.chassi);
		System.out.println(carro1.placa);
		System.out.println(carro1.bancos);
		System.out.println(carro1.roda);*/
		
		Carro carro2 = new Carro("Mercedes");
		
		System.out.println(soma(0,5));
		System.out.println(soma(0,5,10));
		
		BMW bmw = new BMW();
		bmw.setVelocidade(100);
		System.out.println(bmw.acelerar());
		
		Mercedes mercedes = new Mercedes();
		System.out.println(mercedes.acelerar());
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int soma(int a, int b, int c) {
		return a + b + c;
	}
}
