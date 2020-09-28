package arrays_codes;

import java.util.Scanner;

public class NameAges {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira quantos nomes voce deseja digitar: ");
		int count = in.nextInt();
		
		String[] names = new String[count];
		int[] age = new int[count];
		
		for (int i = 0; i < count; ++i) {
			System.out.print("Insira um nome: ");
			in.nextLine();
			names[i] = in.nextLine();
			System.out.print("Insira uma idade: ");
			age[i] = in.nextInt();
		}
		
		for (int j = 0; j < count; ++j) {
			System.out.println("Nome: " + names[j] + " | Idade: " + age[j]);
		}
		in.close();
	}

}
