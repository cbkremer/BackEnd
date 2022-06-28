package aula13_estruturasdecontrole;

public class For {
    public  static void main(String[] args){
        for(int i = 0;i < 100;i++){
            System.out.println(i);
        }

        int i = 0;

        for(;i < 10;){
            System.out.println(i);
            i++;
        }

        for(;;){
            System.out.println("loop infinito");
        }
    }
}
