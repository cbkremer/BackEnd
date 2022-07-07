package Aula17_variaveis_metodos_estaticos.entidades;

import Aula17_variaveis_metodos_estaticos.Carro;

public class Tesla extends Carro{
    private boolean dirige_sozinho;

    public Tesla(){
        super();
    }

    

    public boolean isDirige_sozinho() {
        return dirige_sozinho;
    }

    public void setDirige_sozinho(boolean dirige_sozinho) {
        this.dirige_sozinho = dirige_sozinho;
    }

    
}