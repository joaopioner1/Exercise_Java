package exercises;

import java.util.Scanner;

public class Ex21Circunferencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com o raio da c�rcufer�ncia: ");
		float raio = in.nextFloat();
		
		double diametro = raio * raio;
		double area = raio * Math.PI;
		double comprimento = 2 * Math.PI * raio;
		System.out.print("O di�metro da circufer�ncia �: "+diametro+"\nA area �: "+area+" \nO comprimento �: "+comprimento);
		
		in.close();
	}

}
