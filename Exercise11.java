package arrays_exercises;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] vet = new int[5];
		int soma = 0;
		int mul = 1;
		
		for (int i = 0; i < vet.length; ++i) {
			System.out.println("Digite um numero inteiro: ");
			vet[i] = in.nextInt();
			soma += vet[i];
			mul *= vet[i];
		}
		
		for (int j = 0; j < vet.length; ++j) {
			System.out.println(vet[j]);
		}
		for (int j = 0; j < vet.length; ++j) {
			System.out.println(soma);
		}
		for (int j = 0; j < vet.length; ++j) {
			System.out.println(mul);
		}
		in.close();
	}

}
/*Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a
multiplicação e os números.
*/
