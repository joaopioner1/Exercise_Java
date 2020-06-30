package exercises;

import java.util.Scanner;

public class Ex28Multa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira o valor da multa: ");
		double valorMulta = in.nextDouble();
		System.out.print("Insira o mês(em número) que a multa foi paga: ");
		int mes = in.nextInt();

		double juroComp = valorMulta * (Math.pow(1 + 0.05, mes - 1));
		if (mes == 1) {
			System.out.printf("O valor da multa a ser pago é: %.2f", valorMulta);
		} else {
			while (mes >= 2 && mes <= 12) {
				System.out.printf("O valor da multa a ser pago é: %.2f", juroComp);
				break;
			}
		}

		in.close();
	}
}
/*
 * 3) Criar um programa para calcular o valor da multa a ser paga de anuidade de
 * uma associação. A anuidade deve ser paga no mês de janeiro. Por mês, é
 * cobrado 5% de juros (com juros sobre juros). Por exemplo, uma associação de
 * R$100 paga em janeiro, custa R$ 100; em fevereiro, custa R$105; em março,
 * custa R$110,25; e, em dezembro, R$171,03. O usuário deve informar o valor da
 * multa o mês em que foi paga.
 */
