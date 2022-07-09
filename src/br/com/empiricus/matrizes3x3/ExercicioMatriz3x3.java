package br.com.empiricus.matrizes3x3;

import java.util.Scanner;

public class ExercicioMatriz3x3 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		double soma = 0;
		double diagonalPrincipal = 0;
		Scanner elemento = new Scanner(System.in);
		
		//inicializando a matriz 3x3
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("elemento [" + i + "][" + j + "] = ");
				matriz[i][j] = elemento.nextInt();
				soma += matriz[i][j]; //soma dos elementos da matriz
				
				if(i ==j) {
					diagonalPrincipal += matriz[i][j]; //soma dos elementos da diagonal principal
				}
			}
		}
		System.out.println();
		
		//mostra matriz 3x3
		System.out.println("Matriz N1:");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " / ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("A soma dos elementos da matriz é " + soma + ".");
		System.out.println("A soma dos valores da diagonal principal é " + diagonalPrincipal + ".");

	}

}
