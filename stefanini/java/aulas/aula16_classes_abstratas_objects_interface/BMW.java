package aula16_classes_abstratas_objects_interface;

public class BMW extends Carro implements Conversivel, Utilitario{
    @Override
    public double calculcarTaxaAceleracao(double vel_final, double tempo_final) {
        System.out.println("BMW Sobreescrita");
        return vel_final / tempo_final;
    }
    
    @Override
    public void piscarAlerta() {
    	System.out.println("BMW piscando alerta...");
    }
    
    @Override
    public void acionarTurbo() {
    	
    }
    @Override
    public void passear() {
    	
    }
}
