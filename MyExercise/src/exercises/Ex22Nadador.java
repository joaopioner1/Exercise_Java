package exercises;

import java.util.Scanner;

public class Ex22Nadador {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com a idade do nadador para verificar qual categoria o mesmo se encaixa: ");
		int idade = in.nextInt();
		
		if (idade >= 18) {
			System.out.print("Categoria Adulta, o nadador tem "+idade+" anos de idade.");
		}else if (idade >= 14 &&  idade < 18) {
			System.out.print("Categoria Juvenil, o nadador tem "+idade+" anos de idade.");
		}else if (idade >= 9 && idade < 14) {
			System.out.print("Categoria Infantil, o nadador tem "+idade+" anos de idade.");
		}else {
			System.out.print("Categoria mirim, o nadador tem "+idade+" anos de idade.");
		}
		in.close();
	}
}
