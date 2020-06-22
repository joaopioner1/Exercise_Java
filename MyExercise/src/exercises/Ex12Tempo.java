package exercises;

import java.util.Scanner;

public class Ex12Tempo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira a valocidade média da viagem: ");
		float vM = in.nextFloat();
		System.out.print("Insira a distância da viagem: ");
		float distancia = in.nextFloat();
		float tempo = distancia / vM;
		
		if (tempo >= 1.0) {
			System.out.print("O tempo levado na viagem foi de: "+tempo+" horas.");
		}else{
			System.out.println("O tempo levado na viagem foi de: "+tempo+" minutos.");
		
		in.close();
		}
	}

}
