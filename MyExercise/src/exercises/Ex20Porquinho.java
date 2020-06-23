package exercises;

import java.util.Scanner;

public class Ex20Porquinho {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira o valor do produto para verificar se você pode comprar-lo: ");
		float valorInput = in.nextFloat();
		//variaveis
		short moeda1real = 50;
		double moeda50cent = 0.50 * 20;
		double moeda25cent = 0.25 * 30;
		double moeda10cent = 0.10 * 60;
		double moeda5cent = 0.05 * 40;
		
		double soma = moeda1real + moeda50cent + moeda25cent + moeda10cent + moeda5cent;
		if (valorInput <= soma) {
			System.out.println("Você tem dinheiro suficinete para comprar isso. sobrou: "+(soma - valorInput)+" reais.");
		}else {
			System.out.println("Você não tem dinheiro suficiente para comprar isso. faltou: "+(soma - valorInput)+" reais.");
		}
			in.close();
	}

}
