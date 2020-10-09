package arrays_exercises;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] age = new int[5];
		double[] h = new double[age.length];

		for (int i = 0; i < age.length; ++i) {
			System.out.print("insira a idade da pessoa: ");
			age[i] = in.nextInt();
			System.out.print("insira a altura da pessoa: ");
			h[i] = in.nextInt();
		}
		
		byte pessoa = 0;
		for (int j = 0; j < age.length; ++j) {
			System.out.println("\nAltura da pessoa " + (pessoa + 1) + ": " + h[j]);
			System.out.println("idade da pessoa " + pessoa + ": " + age[j]);
		}
		in.close();
	}

}
/*
 * aça um Programa que peça a idade e a altura de 5 pessoas, armazene cada
 * informação no seu respectivo vetor. Imprima a idade e a altura na ordem
 * inversa a ordem lida.
 */
