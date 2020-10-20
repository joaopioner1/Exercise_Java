package arrays_exercises;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double[] array = new double[10];
		short imp = 0, par = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = in.nextDouble();
		}
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 0) {
				par += 1;
				System.out.println("Par: " + array[j]);
			} else {
				imp += 1;
				System.out.println("impar: " + array[j]);

			}
		}
		System.out.println("Quantidade n pares: " + par);
		System.out.println("Quantidade n impares: " + imp);

		
		in.close();
	}

}
