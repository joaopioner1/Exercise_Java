package arrays_exercises;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = in.nextDouble();
		}
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 0) {
				System.out.println();
			}
		}
		
		in.close();
	}

}
