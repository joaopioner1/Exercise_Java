package exercises;

import java.util.Scanner;
public class Ex13Eleicao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com o n�mero total de eleitores, n�mero de votos v�lidos, n�mero de votos brancos, n�mero de votos nulos: ");
		int totalE = in.nextInt();
		int votosV = in.nextInt();
		int votosB = in.nextInt();
		int votosN = in.nextInt();
		
		float percentualVV = (votosV * totalE) / 100;
		float percentualVB = (votosB * totalE) / 100;
		float percentualVN = (votosN * totalE) / 100;
		
		System.out.printf("\nO percentual de votos v�lidos � de: ",percentualVV,"%");
		System.out.print("\nO percentual de votos brancos � de: "+percentualVB+"%");
		System.out.print("\nO percentual de votos nulos � de: "+percentualVN+"%");
		in.close();
	}
}
