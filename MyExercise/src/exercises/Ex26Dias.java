package exercises;

import java.util.Scanner;

public class Ex26Dias {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro para saber a qual dia da semana o mesmo é referido: ");
		int input = in.nextInt();
		
		switch (input){
			case 1: 
				System.out.print("Segunda-Feira (dia da semana).");
				break;
			case 2: 
				System.out.print("Terça-Feira (dia da semana).");
				break;
			case 3: 
				System.out.print("Quarta-Feira (dia da semana).");
				break;
			case 4: 
				System.out.print("Quinta-Feira (dia da semana).");
				break;
			case 5: 
				System.out.print("Sexta-Feira (dia da semana).");
				break;
			case 6: 
				System.out.print("Sabádo (Fim de semana).");
				break;			
			case 7: 
				System.out.print("Domingo (Fim de semana).");
				break;
				
			default: 
				System.out.print("Dia inválido. Digite números entre 1 e 7.");

			in.close();
		}
	}

}
