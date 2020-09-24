package arrays_codes;

import java.util.Scanner;

public class DivisionNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros deseja adigitar (lembre-se, o programa subtrai 2 numrs): ");
		int count = in.nextInt();
		double[] n1 = new double[count];
		double[] n2 = new double[count];
		
		for (int i = 0; i < count; ++i) {
			System.out.print("Insira um numero: ");
			n1[i] = in.nextDouble();
			System.out.print("Insira outro numero: ");
			n2[i] = in.nextDouble();
		}
		
		for (int j = 0; j < count; ++j) {
			System.out.println("A divisao de " + n1[j] + " x " + n2[j] + " = " + (n1[j] / n2[j]));
		}
		in.close();

	}

}
