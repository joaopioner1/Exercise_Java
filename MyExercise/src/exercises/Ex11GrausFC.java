package exercises;

import java.util.Scanner;

public class Ex11GrausFC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em Fahrenheit: ");
		float f = in.nextInt();
		float conversao = (f - 32) / 9;
		System.out.printf("A temperatura em graus Celsius é: %.2f",conversao);
		
		in.close();
	}

}
