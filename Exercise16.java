package arrays_exercises;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] name = new String[10];
		int[] age = new int[name.length];
		
		System.out.println("Insira 10 nomes e 10 idades: ");
		for (int i = 0; i < name.length; ++i) {
			System.out.print("Insira os nomes: ");
			name[i] = in.next();
			System.out.print("Insira a idade: ");
			age[i] = in.nextInt();
		}
		
		
		
		
		in.close();
	}

}
