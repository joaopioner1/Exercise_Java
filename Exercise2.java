package arrays_exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] vet1 = new int[10]; 
		int[] vet2 = new int[vet1.length];
		
		for (int i = 0; i < vet1.length; ++i) {
			System.out.print("Insira um numero: ");
			vet1[i] = in.nextInt();
		}
		
		System.out.println("\nNumeros na ordem normal: ");
		for(int k = 0; k < vet1.length; ++k) {
			System.out.println(vet1[k]);
		}
		
		System.out.println("\nNumeros na ordem invertida: ");
		for (int j = 0; j < vet1.length; ++j) {
			vet2[j] = vet1[(vet1.length - j) - 1];
			System.out.println(vet2[j]);
		}
		in.close();
	}

}
