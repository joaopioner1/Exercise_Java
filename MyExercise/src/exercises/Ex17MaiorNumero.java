package exercises;

import java.util.Scanner;

public class Ex17MaiorNumero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número(inteiro): ");
		int n1 = in.nextInt();
		System.out.print("Insira o segundo número(inteiro): ");
		int n2 = in.nextInt();
		
		if (n1 > n2) {
			System.out.print("O número "+n1+" é maior que o número "+n2+".");
		}else {
			System.out.print("O número "+n2+" é maior que o número "+n1+".");
		}
		in.close();
		
	}

}
