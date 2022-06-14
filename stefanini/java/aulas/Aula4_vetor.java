package com.stefanini.cursojavabasico.vetor;

public class Aula4_vetor {
	public static void main(String[] args) {
		int[] notas = new int[10];
		
		notas[2] = 5;
		notas[9] = 67;
		notas[0] = 2;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		String[] carros = new String[] {"tesla","chevrolet","carro"};
		
		for (String string : carros) {
			System.out.println(string);
		}
		int[][] matriz = new int[2][3];
		
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
	}
}
