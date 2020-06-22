package exercises;

import java.util.Scanner;

public class Ex14Bhaskara {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira os valores do Delta(a, b, c): ");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		
		double delta = Math.sqrt(b * b - 4 * a * c);
		double x1 = (((-1 * b) + delta)) / (2*a);
		double x2 = (((-1 * b) - delta)) / (2*a);
		System.out.printf("x1 = %.5f\n",x1);
		System.out.printf("x2 = %.5f\n",x2);
		
		in.close();
	}
}


