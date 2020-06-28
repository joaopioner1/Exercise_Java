package exercises;

import java.util.Scanner;

public class Ex29Porcentagem {

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com o valor: ");
		float v1 = in.nextFloat();
		System.out.print("Entre com o percentual: ");
		float v2 = in.nextFloat();
		
		double porcent = (v1 * v2) / 100;
		System.out.println(v2+"% de "+v1+" é: "+porcent);
		
		in.close();
	}

}
