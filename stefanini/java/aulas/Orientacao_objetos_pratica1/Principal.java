package Aulas.Orientacao_objetos_pratica1;


public class Principal {
    public static void main(String[] args){
        Carro bmw = new Carro();

        bmw.marca = "BMW";
        bmw.modelo = "M3";
        bmw.km_litro = 7.5;
        bmw.aceleracao = 50;
        bmw.velocidade_max = 280;
        
        System.out.println(bmw.marca);
        System.out.println(bmw.modelo);
        System.out.println(bmw.km_litro);
        System.out.println(bmw.aceleracao);
        System.out.println(bmw.velocidade_max);

        bmw.acelerar();
        bmw.frear();

    }
}
