package exercises;

import java.util.Scanner;

public class Ex8Porcentagem {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com um valor inteiro para ser calulado mais 20% no mesmo: ");
		int input = in.nextInt();
		int porcentagem = ((input * 20) / 100) + input;
		System.out.println("O valor inserido com mais 20% é: "+porcentagem);
		
		in.close();
	}

}
