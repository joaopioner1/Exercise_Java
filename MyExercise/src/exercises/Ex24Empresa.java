package exercises;

import java.util.Scanner;

public class Ex24Empresa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Os valores n�o podem ser <=0.");
		System.out.print("Insira o sal�rio: ");
		double s = in.nextInt();
		System.out.print("Insira o valor do empr�stimo: ");
		double e = in.nextInt();
		System.out.print("Insira o n�mero de presta��es: ");
		double p = in.nextInt();
		
		double percentual = (30 * s) / 100;
		if (e > percentual) {
			System.out.println("Erro!! O valor do emp�stimo � acima de 30% do sal�rio.");
		}else {
			System.out.println("O sal�rio do funcion�rio �: " + s);
			System.out.println("O valor do empr�stimo �: " + e);
			System.out.println("O n�mero de presta��es �: " + p);
			System.out.println("O valor do sal�rio somado ao empr�stimo �: "+ (s + e));
			System.out.println("O valor de cada presta��o �: " + (e / p));
		}
		in.close();
	}

}
