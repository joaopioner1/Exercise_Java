package exercises;
import java.util.Scanner;
public class Ex3QuantidadeCarne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inisra a quantidade de homens que comparecer�o no churrasco: ");
		int homem = in.nextInt();
		System.out.print("Inisra a quantidade de mulheres que comparecer�o no churrasco: ");
		int mulher = in.nextInt();
		System.out.print("Inisra a quantidade de crian�as que comparecer�o no churrasco: ");
		int crianca = in.nextInt();
		
		double quantidadeCarne = (homem * 0.480) + (mulher * 0.384) + (crianca * 0.240);
		System.out.println("A quantidade de carne de que � preciso comprar �: " + quantidadeCarne + "Kg");
		
		in.close();
	}

}
