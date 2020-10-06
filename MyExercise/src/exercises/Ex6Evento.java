package exercises;

import java.util.Scanner;

public class Ex6Evento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//codigo morto
		System.out.print("Entre com o valor de cada ingresso: ");
		float valorI = in.nextFloat();
		System.out.print("Entre com o número de pessoas (público do evento) que são sócias do clube: ");
		int socios = in.nextInt();
		System.out.print("Entre com o número de pessoas (público do evento) não pagantes (menores de 10 anos): ");
		int criancas = in.nextInt();
		System.out.print("Entre com o número de pessoas (público do evento) pagantes (sem desconto algum): ");
		int pComuns = in.nextInt();
		
		int publicoTotal = socios + criancas + pComuns;
		float valorS = (valorI *  30) / (100) * socios;
		float valorPC = valorI * pComuns;
		float valorC = criancas * 0;
		float valorFicSocio = valorI * socios;
		float valorFicCrianca = valorI * criancas;
		float totalArrecadado = valorS + valorPC + valorC;
		float totalPerdido =(valorFicCrianca + valorFicSocio + valorPC) - (totalArrecadado);
		
		System.out.print("\nO publico total é: " + publicoTotal);
		System.out.print("\nO valor arrecadado é: " + totalArrecadado);
		System.out.print("\nO valor perdido com as exceções é: " + totalPerdido);
		
		in.close();
	}

}
