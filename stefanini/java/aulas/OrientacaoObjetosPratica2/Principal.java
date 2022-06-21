package Aulas.Orientacao_objetos_pratica1;


public class Principal {
    public static void main(String[] args){
        Carro bmw = new Carro();
        Carro mercedes = new Carro("Mercedes","guingu");
        BMW bmw2 = new BMW();

        bmw2.calculcarTaxaAceleracao(100.4, 5);

        bmw.setMarca("BMW");
        bmw.setModelo("M3");
        bmw.setKm_litro(7.5);
        //bmw.aceleracao = 50;
        bmw.setVelocidade_max(280);;
        
        System.out.println(mercedes.getMarca());
        System.out.println(mercedes.getModelo());
        System.out.println(bmw.getKm_litro());
        System.out.println(bmw.getAceleracao());
        System.out.println(bmw.getVelocidade_max());

        bmw.acelerar();
        bmw.frear();

        System.out.println(bmw.calculcarTaxaAceleracao(bmw.getVelocidade_max(), 0, 10, 0));
        System.out.println(bmw.calculcarTaxaAceleracao(bmw.getVelocidade_max(), 10));
        System.out.println(bmw.calculcarTaxaAceleracao(100, 5));
    }
}
