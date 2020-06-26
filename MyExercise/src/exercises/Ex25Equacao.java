package exercises;

import java.util.Scanner;

public class Ex25Equacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o valor de a: ");
		int a = in.nextInt();
		System.out.print("Insira o valor de b: ");
		int b = in.nextInt();
		System.out.print("Insira o valor de c: ");
		int c = in.nextInt();
		
		double delta = Math.sqrt((b * b) - 4 * a * c);
		if (delta == 0 || delta < 0) {
			System.out.print("O valor do delta é negativo ou igual a zero, impossível solução.");
		}else {
			
		double x1 = (((-1 * b) + delta)) / (2*a);
		double x2 = (((-1 * b) - delta)) / (2*a);
		System.out.printf("x1 = %.3f\n",x1);
		System.out.printf("x2 = %.3f\n",x2);
		
		in.close();
		}
	}

}
