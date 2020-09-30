package arrays_exercises;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		for (int i = 0; i < vet.length; ++i) {
			System.out.print("Insira um numero: " );
			vet[i] = in.nextInt();
		}
		System.out.println("\nOs numeros digitados foram: ");
		for (int j = 0; j < vet.length; ++j) {
			System.out.println(vet[j]);
		}
		
		in.close();
	}

}
