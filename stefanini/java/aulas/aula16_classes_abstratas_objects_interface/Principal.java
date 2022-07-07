package aula16_classes_abstratas_objects_interface;


public class Principal {
    public static void main(String[] args){
        //Carro bmw = new Carro();
        //Carro mercedes = new Carro("Mercedes","guingu");
        BMW bmw2 = new BMW();

        Tesla tesla = new Tesla();
        Carro tesla_dois =  new Tesla();

        //BMW bmw3 = null;
        //bmw.acelerar();
        bmw2.piscarAlerta();
        tesla_dois.piscarAlerta();
        

        tesla.isDirige_sozinho();
        ((Tesla)tesla_dois).setDirige_sozinho(true);
        System.out.println(((Tesla)tesla_dois).isDirige_sozinho());

        //Carro[] carros = new Carro[] {bmw,tesla,tesla_dois};

        

        

    }
}
