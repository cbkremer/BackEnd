package aula13_estruturasdecontrole;

public class SwitchCase {
    public static void main(String[] args){
        int mes = 1;

        switch(mes){
            case 1:
                System.out.println("Janeiro");
            break;
            case 2: 
                System.out.println("Fevereiro");
            break;
            default:
                System.out.println("Mês inválido");
        }
    }
}
