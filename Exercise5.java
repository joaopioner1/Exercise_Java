package arrays_exercises;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double[] vet = new double[5];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = in.nextDouble();
		}
		
		System.out.println("Os numeros digitados foram: ");
		for (int j = 0; j < vet.length; j++) {
			System.out.println("-> " + vet[j]);
		}
		
		
		in.close();
	}

}
