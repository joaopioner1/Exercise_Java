package exercises;

import java.util.Scanner;

public class Ex27PlanoSaude {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira a idade do individuo: ");
		int idade = in.nextInt();
		
		if (idade < 10) {
			System.out.print("O plano de saúde desse individuo custa R$ 180,00. ");
		}else if (idade >= 10 && idade < 40) {
			System.out.print("O plano de saúde desse individuo custa R$ 150,00. ");
		}else if (idade >= 40 && idade <= 60) {
			System.out.println("O plano de saúde desse individuo custa R$ 195,00. ");
		}else{
			System.out.println("O plano de saúde desse individuo custa R$ 230,00. ");
		}
		in.close();
	}

}
/*Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade
do conveniado considerando que todos pagam R$ 100 mais um adicional conforme a seguinte
tabela: 1) crianças com menos de 10 anos pagam R$80; 2) conveniados com idade entre 10 e
30 anos pagam R$50; 3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e 4)
conveniados com mais de 60 anos pagam R$130.
*/