package exercises;

import java.util.Scanner;

public class Ex7Antecessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int entrada = in.nextInt();
		entrada = entrada - 1;
		System.out.println("O antecessor do número é " + entrada);
		
		in.close();
	}

}
