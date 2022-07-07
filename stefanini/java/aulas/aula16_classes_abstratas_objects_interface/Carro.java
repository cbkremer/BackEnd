package aula16_classes_abstratas_objects_interface;

public abstract class Carro {
    private String marca;
    private String modelo;
    private int velocidade_max;
    private int aceleracao;
    private double km_litro;

    public Carro(){
        System.out.println("Construindo carro...");
    }
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract void piscarAlerta();

    public void acelerar(){
        System.out.println("Acelerando...");
    }
    public void frear(){
        System.out.println("Freando..");
    }
    public double calculcarTaxaAceleracao(double vel_final, double vel_inicial, double tempo_final, double tempo_inicial){
        return (vel_final - vel_inicial) / (tempo_final - tempo_inicial) * 3.6;
    }
    public double calculcarTaxaAceleracao(double vel_final, double tempo_final){
        return (vel_final - 0) / (tempo_final - 0) * 3.6;
    }
    public String calculcarTaxaAceleracao(int vel_final, int tempo_final){
        System.out.println("int");
        return ""+(vel_final - 0) / (tempo_final - 0) * 3.6;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidade_max() {
        return velocidade_max;
    }
    
    public int getAceleracao() {
        return aceleracao;
    }
    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
    public double getKm_litro() {
        return km_litro;
    }
    public void setKm_litro(double km_litro) {
        this.km_litro = km_litro;
    }
    
}
