package exercises;

import java.util.Scanner;

public class Ex16PositivoNegativo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira um n�mero para ver se � positivo ou negativo: ");
		float n = in.nextFloat();
		if (n >= 0) {
			System.out.print("O n�mero � positivo.");
		}else {
			System.out.println("O n�mero � negativo.");
		}
			in.close();
	}
}