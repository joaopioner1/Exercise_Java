package exercises;

import java.util.Scanner;

public class Ex16PositivoNegativo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira um número para ver se é positivo ou negativo: ");
		float n = in.nextFloat();
		if (n >= 0) {
			System.out.print("O número é positivo.");
		}else {
			System.out.println("O número é negativo.");
		}
			in.close();
	}
}