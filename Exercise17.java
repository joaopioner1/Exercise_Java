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
		
		
		
		in.close();
	}

}
