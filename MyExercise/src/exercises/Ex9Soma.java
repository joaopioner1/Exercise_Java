package exercises;

import java.util.Scanner;

public class Ex9Soma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insria um n�mero(inteiro) para calcular ao quadrado: ");
		int input = in.nextInt();
		System.out.println("O quadrado do n�mero �: " + input * input);
		
		in.close();
	}

}
