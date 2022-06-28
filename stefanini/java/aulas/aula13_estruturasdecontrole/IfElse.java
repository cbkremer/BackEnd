package aula13_estruturasdecontrole;

public class IfElse {
    public static void main(String[] args){
        int nota = 7;

        if(nota >= 7){
            System.out.println("Aprovado");
        }

        if(nota >= 7)
            System.out.println("Aprovado");

        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }

        if(nota>=9){
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }
        else if(nota>=7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
