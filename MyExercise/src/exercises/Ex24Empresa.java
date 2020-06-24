package exercises;

import java.util.Scanner;

public class Ex24Empresa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Os valores não podem ser <=0.");
		System.out.print("Insira o salário: ");
		double s = in.nextInt();
		System.out.print("Insira o valor do empréstimo: ");
		double e = in.nextInt();
		System.out.print("Insira o número de prestações: ");
		double p = in.nextInt();
		
		double percentual = (30 * s) / 100;
		if (e > percentual) {
			System.out.println("Erro!! O valor do empéstimo é acima de 30% do salário.");
		}else {
			System.out.println("O salário do funcionário é: " + s);
			System.out.println("O valor do empréstimo é: " + e);
			System.out.println("O número de prestações é: " + p);
			System.out.println("O valor do salário somado ao empréstimo é: "+ (s + e));
			System.out.println("O valor de cada prestação é: " + (e / p));
		}
		in.close();
	}

}
