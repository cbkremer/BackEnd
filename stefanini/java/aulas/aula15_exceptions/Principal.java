package aula15_exceptions;


public class Principal {
    public static void main(String[] args){
        Carro bmw = new Carro();
        Carro mercedes = new Carro("Mercedes","guingu");
        BMW bmw2 = new BMW();

        Tesla tesla = new Tesla();
        Carro tesla_dois =  new Tesla();

        //BMW bmw3 = null;
        //bmw.acelerar();

        try{
            bmw2.setVelocidade_max(10);
        }
        catch(NegocioException e){
            System.out.println(e);
        }
        finally{
            System.out.println("passou aqui");
        }

        tesla.isDirige_sozinho();
        ((Tesla)tesla_dois).setDirige_sozinho(true);
        System.out.println(((Tesla)tesla_dois).isDirige_sozinho());

        Carro[] carros = new Carro[] {bmw,tesla,tesla_dois};

        for (Carro carro : carros) {
            if(carro instanceof Tesla){
                System.out.println(((Tesla)carro).isDirige_sozinho());
            }
        }

        bmw2.calculcarTaxaAceleracao(100.4, 5);

        bmw.setMarca("BMW");
        bmw.setModelo("M3");
        bmw.setKm_litro(7.5);
        //bmw.aceleracao = 50;
        //bmw.setVelocidade_max(280);;
        


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

        bmw2.calculcarTaxaAceleracao(100.50, 10);
        tesla.calculcarTaxaAceleracao(100.50, 10);

    }
}
