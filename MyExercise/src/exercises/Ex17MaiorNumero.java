package exercises;

import java.util.Scanner;

public class Ex17MaiorNumero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero(inteiro): ");
		int n1 = in.nextInt();
		System.out.print("Insira o segundo n�mero(inteiro): ");
		int n2 = in.nextInt();
		
		if (n1 > n2) {
			System.out.print("O n�mero "+n1+" � maior que o n�mero "+n2+".");
		}else {
			System.out.print("O n�mero "+n2+" � maior que o n�mero "+n1+".");
		}
		in.close();
		
	}

}
