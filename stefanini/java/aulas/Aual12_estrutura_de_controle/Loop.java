package Aula12_estrutura_de_controle;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Loop {
    public static void main(String[] args){

            int count = 10;
        
            while(count < 100){
                System.out.println(count);
                count++;
            }
        
            int count_dois = 10;
        
            do{
                System.out.println(count_dois);
                count_dois++;
            }while(count_dois<100);
        
            //for normal
            for(int i = 0;i < 100;i++){
                System.out.println(i);
            }
            //for com areas ausentes
            int i = 0;
            for(;i < 100;){
                i++;
            }
            //for infinito
            for(;;){
                System.out.println("infinito");
            }
        }
    }
