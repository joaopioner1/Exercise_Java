package exercises;

import java.util.Scanner;

public class Ex23adicao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero: ");
		float n1 = in.nextFloat();
		System.out.print("Insira o segundo n�umero: ");
		float n2 = in.nextFloat();
		
		if (n1 + n2 > 20) {
			float soma = n1 + n2 + 8;
			System.out.print("O n�mero inserido somado com mais 8, �: " + soma);
		}else {
			float diferenca = (n1 + n2) - 8;
			System.out.print("O n�mero inserido diminuido de 8, �: " + diferenca);
		}
		
		
		in.close();
	}

}
