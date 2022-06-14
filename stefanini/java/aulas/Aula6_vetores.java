package com.stefanini.cursojavabasico.vetor;

public class Aula6_vetores {
	public static void main(String[] args) {
		int[] notas = new int[10];
		notas[1] = 10;
		notas[6] = 3;
		
		System.out.println(notas.length);
		System.out.println(notas[1]);
		System.out.println(notas[6]);
		
		int[][] matriz = new int[5][5];
		
		for(int[] m : matriz) {
			for(int v : m) {
				System.out.println(v);
			}
		}
		
		String[] meses = new String[] {"1","2","3"};
		
		for(String m: meses) {
			System.out.println(m);
		}
		
		for(int i = 0;i < notas.length;i++) {
			System.out.println(notas[i]);
		}
	}
}
