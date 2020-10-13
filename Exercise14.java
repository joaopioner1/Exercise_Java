package arrays_exercises;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double[] vet1 = new double[10];
		double[] vet2 = new double[vet1.length];
		double[] vet3 = new double[vet1.length];
		
		for (int i = 0; i < vet1.length; ++i) {
			System.out.print("Insira um numero: ");
			vet1[i] = in.nextDouble();
			System.out.print("Insira um numero: ");
			vet2[i] = in.nextDouble();
		}
		
		System.out.println("Dados dos 2 arrays: ");
		for (int i = 0; i < vet1.length; ++i) {
			vet3[i] = vet1[i];
			System.out.println(vet3[i]);
		}
		for (int i = 0; i < vet1.length; ++i) {
			vet3[i] = vet2[i];
			System.out.println(vet3[i]);
		}
		in.close();
	}

}
/*.Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro
vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos
intercalados dos dois outros vetores.
*/