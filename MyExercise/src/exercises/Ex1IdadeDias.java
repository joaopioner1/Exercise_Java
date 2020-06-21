package exercises;
import java.util.Scanner;
public class Ex1IdadeDias {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com a idade em anos, meses e dias: ");
		
		int idadeA = in.nextInt();
		int idadeM = in.nextInt();
		int idadeD = in.nextInt();
		int somaIdade = (idadeA * 365) + (idadeM * 30) + idadeD;
		
		System.out.print("A idade do Indíviduo em dias é: " + somaIdade);
		
		in.close();
	}

}
