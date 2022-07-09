package br.com.empiricus.matrizes2x3;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		int matrizN1[][] = new int[2][3];
		int matrizN2[][] = new int[2][3];
		int matrizM1[][] = new int[2][3];
		int matrizM2[][] = new int[2][3];
		Scanner elemento = new Scanner(System.in);
		
		//inicializando matriz N1
		for(int i = 0; i < matrizN1.length; i++) {
			for(int j = 0; j < matrizN1[i].length; j++) {
				System.out.print("N1 [" + i + "][" + j + "] = ");
				matrizN1[i][j] = elemento.nextInt();
			}
		}
		System.out.println();
		
		//mostra matriz N1
		System.out.println("Matriz N1:");
		for(int i = 0; i < matrizN1.length; i++) {
			for(int j = 0; j < matrizN1[i].length; j++) {
				System.out.print(matrizN1[i][j] + " / ");
			}
			System.out.println();
		}
		System.out.println();
		
		//inicializando matriz N2
		for(int i = 0; i < matrizN2.length; i++) {
			for(int j = 0; j < matrizN2[i].length; j++) {
				System.out.print("N2 [" + i + "][" + j + "] = ");
				matrizN2[i][j] = elemento.nextInt();
			}
		}
		System.out.println();
		
		//mostra matriz N2
		System.out.println("Matriz N2:");
		for(int i = 0; i < matrizN2.length; i++) {
			for(int j = 0; j < matrizN2[i].length; j++) {
				System.out.print(matrizN2[i][j] + " / ");
			}
			System.out.println();
		}
		//inicializando matriz M1 e M2
		for(int i = 0; i < matrizM1.length; i++) {
			for(int j = 0; j < matrizM1[i].length; j++) {
				matrizM1[i][j] = matrizN1[i][j] + matrizN2[i][j];
				matrizM2[i][j] = matrizN1[i][j] - matrizN2[i][j];
			}
		}
		System.out.println();
		
		//mostra matriz M1
		System.out.println("Matriz M1 (N1 + N2):");
		for(int i = 0; i < matrizN2.length; i++) {
			for(int j = 0; j < matrizN2[i].length; j++) {
				
				System.out.print(matrizM1[i][j] + " / ");
			}
			System.out.println();
		}
		System.out.println();
		
		//mostra matriz M2
		System.out.println("Matriz M2 (N1 - N2):");
		for(int i = 0; i < matrizM2.length; i++) {
			for(int j = 0; j < matrizM2[i].length; j++) {			
				System.out.print(matrizM2[i][j] + " / ");
			}
			System.out.println();
		}
	}

}
