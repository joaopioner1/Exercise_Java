package exercises;
import java.util.Scanner;
public class Ex2Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota do aluno: (De 0 a 10)");
		float nota1 = in.nextFloat();
		System.out.print("Insira a segunda nota do aluno: (De 0 a 10)");
		float nota2 = in.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		System.out.println("A media é: " + media);
		
		in.close();
	}

}
