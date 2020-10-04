package arrays_exercises;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0;
		
		for (int i = 0; i < notas.length; ++i) {
			System.out.print("Insira uma nota: ");
			notas[i] = in.nextDouble();
			soma += notas[i];
		}
		System.out.println("\nA media das notas eh: " + (soma / 4));
		
		in.close();
	}

}
