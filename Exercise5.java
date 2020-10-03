package arrays_exercises;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculadora com arrays");
		System.out.print("Insira a operacao que deseja realizar(* / - / + / / /): ");
		char operation = in.next().charAt(0);
		
		System.out.println("Insira quantos numeros deseja inserir: ");
		int quantNum = in.nextInt();
		double[] input = new double[quantNum];
		
		if (operation == '*') {
			for (int i = 0; i < input.length; i++) {
			System.out.print("Insira um numero para multiplicar: ");
			input[i] = in.nextDouble();
			}
			
			for (int j = 0; j < input.length; j++) {
				input[j] *= input[j];
				System.out.println("Produto total: " + input[j]);
			}
		} 
		if (simbolo = '+') {
			System.out.print("Insira um numero para multiplicar: ");
			input[i] = in.nextDouble();
		}
		
		
		
		
		
		
		
		in.close();
	}

}
