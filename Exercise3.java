package arrays_exercises;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] vet1 = new int[10];
		int[] vet2 = new int[vet1.length];
		
		for (int i = 0; i < vet1.length; ++i) {
			System.out.print("Insira um numero: ");
			vet1[i] = in.nextInt();
		}
		
		for (int j = 0; j < vet1.length; ++j) {
			vet2[j] = vet1[j];
			if (vet2[j] % 2 == 0) {
				vet2[j] /= 2;
			} else {
				vet2[j] *= 3;
			}
		}
		
		System.out.println("\nNumeros digitados: ");
		for (int k = 0; k < vet1.length; ++k) {
			System.out.println(vet1[k]);
		}
		
		System.out.println("\nNumeros digitados com o codigo aplicado: ");
		for (int l = 0; l < vet1.length; ++l) {
			System.out.println(vet2[l]);
		}
		
		in.close();
	}

}
