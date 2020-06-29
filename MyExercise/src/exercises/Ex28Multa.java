package exercises;

import java.util.Scanner;

public class Ex28Multa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o valor da multa: ");
		double valorMulta = in.nextDouble();
		System.out.println("Insira o m�s(em n�mero) que a multa foi paga: ");
		int mes = in.nextInt();

		double juroComp = valorMulta * (Math.pow(1 + 0.05, mes));
		if (mes == 1) {
			System.out.printf("O valor da multa a ser pago �: %.2f", valorMulta);
		} else {
			while (mes >= 2 && mes <= 12) {
				System.out.printf("O valor da multa a ser pago �: %.2f", juroComp);
				break;
			}
		}

		in.close();
	}
}
/*
 * 3) Criar um programa para calcular o valor da multa a ser paga de anuidade de
 * uma associa��o. A anuidade deve ser paga no m�s de janeiro. Por m�s, �
 * cobrado 5% de juros (com juros sobre juros). Por exemplo, uma associa��o de
 * R$100 paga em janeiro, custa R$ 100; em fevereiro, custa R$105; em mar�o,
 * custa R$110,25; e, em dezembro, R$171,03. O usu�rio deve informar o valor da
 * multa o m�s em que foi paga.
 */