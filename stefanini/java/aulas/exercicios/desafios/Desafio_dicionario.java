package desafios;

import java.util.Scanner;

public class Desafio_dicionario{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        String[] dict =  new String[] {"alo","hello","hesl","hes","hellowed","hellowesa","h"};
        String x = getSubstring(leia.nextLine(),dict);
        System.out.println(x);
        for(;;){
            System.out.print(x);
            x = getSubstring(x+leia.nextLine(), dict);
        }
    }
    private static String getSubstring(String input, String[] dict){
        int n = dict.length; 
        int n2 = input.length();
        String ret_input = input;
        int i = 0;
        boolean ok = true;
        while(ok){
            n2 = ret_input.length();
            System.out.println("checando retorno");
            for(int j = 0;j < n;j++){
                if(ret_input.equals(dict[j])){
                    System.out.println(" - ret_input: "+ret_input);
                    System.out.println(" - dict j: "+dict[j]);
                    return ret_input;
                }
            }
            if(dict[i].length()>n2){
                boolean all_next_chars = true;
                char next_char = ' ';//algum char que nao exista em dict
                for(int k = 0;k<n;k++){
                    //se input é encontrado no array como substring
                    if(dict[k].length()>n2){
                        if(dict[k].substring(0,n2).equals(ret_input)){ 
                            System.out.println("k index:"+k);
                            System.out.println("Input: "+ret_input);
                            System.out.println("dict substring: "+dict[k].substring(0,n2));
                            if(next_char == ' '){
                                next_char = dict[k].charAt(n2);
                                System.out.println("next_char: "+next_char);
                            }
                            else if(dict[k].charAt(n2)!=next_char){
                                System.out.println("deu ruim");
                                System.out.println("proximo char em dict[k]: "+dict[k].charAt(n2));
                                all_next_chars = false;
                                return ret_input;
                            }
                        }
                    }

                }
                if(all_next_chars){
                    ret_input += next_char;
                    System.out.println("ret_input: "+ret_input);
                }
                    
            }
            
            if(i == n-1)
                i = 0;
            else
                i++;
            //System.out.println(i);
        }

        return ret_input;
    }
}