package arrays_exercises;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] A = new int[10];
		int quad = 0, soma = 0;
		
		for (int i = 0; i < A.length; ++i) {
			System.out.print("Insira um numero: ");
			A[i] = in.nextInt();
			quad = (int) Math.pow(2, A[i]);
			soma += quad;
		}
		
		
		in.close();
	}

}
/* Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre
a soma dos quadrados dos elementos do vetor.
*/
