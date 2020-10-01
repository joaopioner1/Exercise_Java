package arrays_exercises;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] vet = new String[10];
		//String[] vet2 = new String[vet1.length];
		
		for (int i = 0; i < vet.length; ++i) {
			System.out.print("Insira um nome: ");
			vet[i] = in.next();
		}
		
		System.out.println("Insira um numero qualquer: ");
		String name = in.next();
		
		for (int i = 0; i < vet.length;) {
			if (vet[i].equals(name)) {
				System.out.print("ACHEI");
				break;
			} else {
				System.out.print("NAO ACHEI");
				break;
			}
		}
		
		in.close();
	}

}
/*Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite um nome qualquer de
pessoa. Escrever a mensagem “ACHEI”, se o nome estiver armazenado no vetor C ou “NÃO ACHEI”
caso contrário. 
*/