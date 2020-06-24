package exercises;

import java.util.Scanner;

public class Ex23adicao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		float n1 = in.nextFloat();
		System.out.print("Insira o segundo núumero: ");
		float n2 = in.nextFloat();
		
		if (n1 + n2 > 20) {
			float soma = n1 + n2 + 8;
			System.out.print("O número inserido somado com mais 8, é: " + soma);
		}else {
			float diferenca = (n1 + n2) - 8;
			System.out.print("O número inserido diminuido de 8, é: " + diferenca);
		}
		
		
		in.close();
	}

}
