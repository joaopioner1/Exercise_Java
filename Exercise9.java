package arrays_exercises;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] vet = new int[20];
		int[] vetPar = new int[vet.length];
		int[] vetImpar = new int[vet.length];
		
		for (int i = 0; i < vet.length; ++i) {
			System.out.print("Insira um numero: ");
			vet[i] = in.nextInt();
		}
		
		for (int j = 0; j < vet.length; ++j) {
			if (vet[j] % 2 == 0) {
				vetPar[j] = vet[j];
			} else {
				vetImpar[j] = vet[j];
			}
		}
		
		System.out.println("\nTodos os numeros: ");
		for (int k = 0; k < vet.length; ++k) {
			System.out.println(vet[k]);
		}
		System.out.println("Todos os numeros pares: ");
		for (int k = 0; k < vet.length; ++k) {
			System.out.println(vetPar[k]);
		}
		System.out.println("Todos os numeros impares: ");
		for (int k = 0; k < vet.length; ++k) {
			System.out.println(vetImpar[k]);
		}
		
		in.close();
	}

}
/*Fa�a um Programa que leia 20 n�meros inteiros e armazene-os num vetor.
Armazene os n�meros pares no vetor PAR e os n�meros IMPARES no vetor impar.
Imprima os tr�s vetores.*/