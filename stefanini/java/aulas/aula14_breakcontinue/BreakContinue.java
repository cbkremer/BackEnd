package aula14_breakcontinue;

public class BreakContinue{
    public static void main(String[] args){
        String[] carros = new String[] {"BMW","Mercedes"};

        for(int i = 0;i<carros.length;i++){
            if(carros[i] == "BMW"){
                System.out.println(carros[i]);
                continue;
            }
            System.out.println("Quero esse carro");
            System.out.println(carros[i]);
        }
    }
}