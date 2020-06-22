package exercises;

import java.util.Scanner;
public class Ex13Eleicao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com o número total de eleitores, número de votos válidos, número de votos brancos, número de votos nulos: ");
		int totalE = in.nextInt();
		int votosV = in.nextInt();
		int votosB = in.nextInt();
		int votosN = in.nextInt();
		
		float percentualVV = (votosV * totalE) / 100;
		float percentualVB = (votosB * totalE) / 100;
		float percentualVN = (votosN * totalE) / 100;
		
		System.out.printf("\nO percentual de votos válidos é de: ",percentualVV,"%");
		System.out.print("\nO percentual de votos brancos é de: "+percentualVB+"%");
		System.out.print("\nO percentual de votos nulos é de: "+percentualVN+"%");
		in.close();
	}
}
