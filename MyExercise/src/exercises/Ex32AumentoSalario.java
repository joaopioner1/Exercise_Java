package exercises;

import java.util.Scanner;

public class Ex32AumentoSalario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o salário do colaborador: ");
		double salario = in.nextDouble();

		if (salario <= 280) {
			double percentual = (salario * 20) / 100;
			System.out.println("O salário antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 20%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O salário integrado ao aumento ficou: R$ " + (percentual + salario));
		} else if (salario > 280 && salario <= 700) {
			double percentual = (salario * 15) / 100;
			System.out.println("O salário antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 15%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O salário integrado ao aumento ficou: R$ " + (percentual + salario));
		} else if (salario > 700 && salario <= 1500) {
			double percentual = (salario * 10) / 100;
			System.out.println("O salário antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 10%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O salário integrado ao aumento ficou: R$ " + (percentual + salario));
		} else {
			double percentual = (salario * 5) / 100;
			System.out.println("O salário antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 5%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O salário integrado ao aumento ficou: R$ " + (percentual + salario));
		}

		in.close();
	}

}
/*
 * 6) As Organizações Tabajara resolveram dar um aumento de salário aos seus
 * colaboradores e lhe contrataram para desenvolver o programa que calculará os
 * reajustes. Faça um programa que recebe o salário de um colaborador e o
 * reajuste segundo o seguinte critério, baseado no salário atual: - salários
 * até R$ 280,00 (incluindo) : aumento de 20% - salários entre R$ 280,00 e R$
 * 700,00 : aumento de 15% - salários entre R$ 700,00 e R$ 1500,00 : aumento de
 * 10% - salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
 * realizado, informe na tela: - salário antes do reajuste; - percentual de
 * aumento aplicado; - valor do aumento; - novo salário, após o aumento.
 */