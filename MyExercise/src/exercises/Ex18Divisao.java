package exercises;

import java.util.Scanner;

public class Ex18Divisao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número para divisão: ");
		float n1 = in.nextFloat();
		System.out.println("Insira o segundo número para divisão: ");
		float n2 = in.nextFloat();
		
		float divisao = n1 / n2;
		if (divisao < 0) {
			System.out.println("Erro. O valor é 0.");
		}else {
			System.out.println("O valor da divisão é: "+divisao);
		}
		in.close();
	}

}
