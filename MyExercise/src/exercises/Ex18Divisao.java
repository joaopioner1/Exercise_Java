package exercises;

import java.util.Scanner;

public class Ex18Divisao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero para divis�o: ");
		float n1 = in.nextFloat();
		System.out.println("Insira o segundo n�mero para divis�o: ");
		float n2 = in.nextFloat();
		
		float divisao = n1 / n2;
		if (divisao < 0) {
			System.out.println("Erro. O valor � 0.");
		}else {
			System.out.println("O valor da divis�o �: "+divisao);
		}
		in.close();
	}

}
