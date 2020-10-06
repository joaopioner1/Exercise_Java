package arrays_exercises;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] vet = new char[10];
		int vogal = 0;
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Insira um caracter: ");
			vet[i] = in.next().charAt(0);
		}
		
		System.out.println("As consoantes digitadas foram: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == 'a' || vet[i] == 'e' || vet[i] == 'i' || vet[i] == 'o' || vet[i] == 'u') {
				System.out.println("-");
				vogal += 1;
			} else {
				System.out.println(vet[i]);
			}
			System.out.println("Quantidade de vogais digitadas: " + vogal);
		}
		in.close();
	}

}
//Faça  um  Programa q ue  leia  um   vetor  de  10   caracteres,  e  diga  quantas   consoantesforam lidas. Imprima as consoantes. 
