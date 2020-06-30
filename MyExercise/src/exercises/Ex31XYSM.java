package exercises;

import java.util.Scanner;

public class Ex31XYSM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		double n1 = in.nextDouble();
		System.out.println("Insira o segundo número(maior que o primeiro): ");
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
		System.out.println("A soma dos pares do intervalo é igual a: " + soma);
		System.out.print("O produto dos impares do intervalo é igual a: " + mul);

		in.close();
	}

}
/*
 * Faça um programa que receba dois números X e Y, sendo X < Y. Calcule e
 * mostre: - a soma dos números pares desse intervalo de números, incluindo os
 * números digitados; - a multiplicação dos números ímpares desse intervalo,
 * incluindo os digitados;
 */
