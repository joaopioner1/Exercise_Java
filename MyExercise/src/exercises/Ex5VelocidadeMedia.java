package exercises;
import java.util.Scanner;
public class Ex5VelocidadeMedia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o tempo que levou para chegar em Garopaba (297 km de dist�ncia): ");
		float tempo = in.nextFloat();
		float Vmedia = 297 / tempo;
		System.out.printf("A velocidade m�dia �: %.2f",Vmedia);
		
		in.close();
	}

}
