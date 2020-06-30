package exercises;

import java.util.Scanner;

public class Ex31XYSM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero: ");
		double n1 = in.nextDouble();
		System.out.println("Insira o segundo n�mero(maior que o primeiro): ");
		double n2 = in.nextDouble();

		double soma = 0;
		double mul = 1;
		for (double i = n1; i < n2; ++i) {
			if (i % 2 == 0) {
				soma += i;
			} else if (i % 2 != 0) {
				mul *= i;
			}
		}
		System.out.print("Os numeros digitados foram = " + n1 + " e " + n2);
		System.out.println("A soma dos pares do intervalo � igual a: " + soma);
		System.out.print("O produto dos impares do intervalo � igual a: " + mul);

		in.close();
	}

}
/*
 * Fa�a um programa que receba dois n�meros X e Y, sendo X < Y. Calcule e
 * mostre: - a soma dos n�meros pares desse intervalo de n�meros, incluindo os
 * n�meros digitados; - a multiplica��o dos n�meros �mpares desse intervalo,
 * incluindo os digitados;
 */
