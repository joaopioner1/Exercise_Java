package arrays_codes;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira quantos nomes deseja digitar: ");
		int countNames = in.nextInt();
		String[] names = new String[countNames];
		
		for (int i = 0; i < countNames; ++i) {
			System.out.print("Insira um nome (Com apenas uma palavra): ");
			names[i] = in.next();
		}
		
		for (int i = 0; i < countNames; ++i) {
			System.out.println("Nomes digitados: " + names[i]); //agrupa os nomes
		}
		
		in.close();
	}

}
