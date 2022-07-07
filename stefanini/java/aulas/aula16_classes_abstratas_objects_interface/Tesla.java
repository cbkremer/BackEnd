package aula16_classes_abstratas_objects_interface;

public class Tesla extends Carro{
    private boolean dirige_sozinho;

    public Tesla(){
        super();
    }

    @Override
    public double calculcarTaxaAceleracao(double vel_final, double tempo_final) {
        System.out.println("Tesla Sobreescrita");
        return vel_final * tempo_final;
    }
    
    @Override
    public void piscarAlerta() {
    	System.out.println("Tesla piscando alerta...");
    }

    public boolean isDirige_sozinho() {
        return dirige_sozinho;
    }

    public void setDirige_sozinho(boolean dirige_sozinho) {
        this.dirige_sozinho = dirige_sozinho;
    }

    
}