package exercises;

import java.util.Scanner;

public class Ex30Mesada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		

		System.out.print("Quanto você recebe de mesada? ");

		double mesada = in.nextDouble();

		

		System.out.print("Você deseja comprar alguma coisa?(sim/nao) ");

		String resposta = in.next();

		if (resposta.equals("nao")) {

			System.out.print("Tudo bem, até logo!");

			
		}
		if (resposta.equals("sim")) {
			System.out.print("Insira o valor do produto que deseja comprar: ");
			double valorP1 = in.nextDouble();

			if (valorP1 <= mesada) 

				System.out.print("Você pode comprar esse produto, e o saldo restante Ã©: " + (mesada - valorP1 + " reais."));

				double resto = mesada - valorP1;


				

				System.out.print("Você deseja comprar mais alguma coisa?(sim/nao) ");

				String resposta2 = in.next();
				
				if (resposta2.equals("sim")) {
					System.out.print("Insira o valor do produto que deseja comprar: ");
					double valorP2 = in.nextDouble();

					if (resto >= valorP2) {
			

						System.out.print("Você pode comprar somente mais esse produto, porque o estoque da loja acabou. O saldo restante Ã©: " + (resto - valorP2) + " reais.");

					} else {

						System.out.print("Você não tem dinheiro para comprar esse produto.");

						

					}
				}
			}
			in.close();
		}

	}
