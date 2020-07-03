package exercises;

import java.util.Scanner;

public class Ex32AumentoSalario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o sal�rio do colaborador: ");
		double salario = in.nextDouble();

		if (salario <= 280) {
			double percentual = (salario * 20) / 100;
			System.out.println("O sal�rio antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 20%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O sal�rio integrado ao aumento ficou: R$ " + (percentual + salario));
		} else if (salario > 280 && salario <= 700) {
			double percentual = (salario * 15) / 100;
			System.out.println("O sal�rio antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 15%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O sal�rio integrado ao aumento ficou: R$ " + (percentual + salario));
		} else if (salario > 700 && salario <= 1500) {
			double percentual = (salario * 10) / 100;
			System.out.println("O sal�rio antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 10%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O sal�rio integrado ao aumento ficou: R$ " + (percentual + salario));
		} else {
			double percentual = (salario * 5) / 100;
			System.out.println("O sal�rio antes do reajuste era: R$ " + salario);
			System.out.println("O percentual aplicado foi de 5%.");
			System.out.println("O valor do aumento foi de: R$ " + percentual);
			System.out.println("O sal�rio integrado ao aumento ficou: R$ " + (percentual + salario));
		}

		in.close();
	}

}
/*
 * 6) As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus
 * colaboradores e lhe contrataram para desenvolver o programa que calcular� os
 * reajustes. Fa�a um programa que recebe o sal�rio de um colaborador e o
 * reajuste segundo o seguinte crit�rio, baseado no sal�rio atual: - sal�rios
 * at� R$ 280,00 (incluindo) : aumento de 20% - sal�rios entre R$ 280,00 e R$
 * 700,00 : aumento de 15% - sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de
 * 10% - sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser
 * realizado, informe na tela: - sal�rio antes do reajuste; - percentual de
 * aumento aplicado; - valor do aumento; - novo sal�rio, ap�s o aumento.
 */