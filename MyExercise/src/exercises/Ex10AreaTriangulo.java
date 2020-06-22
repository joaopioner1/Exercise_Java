package exercises;

import java.util.Scanner;

public class Ex10AreaTriangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o valor da base do triângulo: ");
		int b = in.nextInt();
		System.out.print("Insira o valor da altura do triângulo: ");
		int h = in.nextInt();
		float area = (b * h) / 2;
		System.out.println("A área do triângulo é: " + area);
		
		in.close();
	}

}
