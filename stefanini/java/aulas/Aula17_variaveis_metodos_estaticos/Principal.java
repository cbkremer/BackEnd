package Aula17_variaveis_metodos_estaticos;

import Aula17_variaveis_metodos_estaticos.entidades.BMW;
import Aula17_variaveis_metodos_estaticos.entidades.Tesla;

public class Principal {
	static int valor = 10;
	static void print() {
		System.out.println(valor);
	}
    public static void main(String[] args){
        Carro bmw = new Carro();
        valor = 20;
        print();
        
        BMW bmw2 = new BMW();

        Tesla tesla = new Tesla();
        Carro tesla_dois =  new Tesla();

        tesla.isDirige_sozinho();
        ((Tesla)tesla_dois).setDirige_sozinho(true);
        System.out.println(((Tesla)tesla_dois).isDirige_sozinho());

        Carro[] carros = new Carro[] {bmw,tesla,tesla_dois};

        for (Carro carro : carros) {
        	if(Constante.marca_famosa.equals(carro.getMarca()))
        		System.out.println("Esse carro é uma ferrari");
            if(carro instanceof Tesla){
                System.out.println(((Tesla)carro).isDirige_sozinho());
            }
        }
        
        Calcular.soma(1, 2);
        
        //Constante.marca_famosa = "asd";
      

    }
}