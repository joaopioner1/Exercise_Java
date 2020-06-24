package exercises;

import java.util.Scanner;

public class Ex21Circunferencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com o raio da círcuferência: ");
		float raio = in.nextFloat();
		
		double diametro = raio * raio;
		double area = raio * Math.PI;
		double comprimento = 2 * Math.PI * raio;
		System.out.print("O diâmetro da circuferência é: "+diametro+"\nA area é: "+area+" \nO comprimento é: "+comprimento);
		
		in.close();
	}

}
