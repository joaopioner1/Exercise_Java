package exercises;

import java.util.Scanner;

public class Ex10AreaTriangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o valor da base do tri�ngulo: ");
		int b = in.nextInt();
		System.out.print("Insira o valor da altura do tri�ngulo: ");
		int h = in.nextInt();
		float area = (b * h) / 2;
		System.out.println("A �rea do tri�ngulo �: " + area);
		
		in.close();
	}

}
