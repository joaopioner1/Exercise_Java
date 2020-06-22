package exercises;

import java.util.Scanner;

public class Ex15StatusAluno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Qual a nota final do aluno?");
		float nota = in.nextFloat();
		
		if (nota >= 7) {
			System.out.print("Aluno aprovado");
		}else {
			System.out.println("Aluno reprovado");
		}
		in.close();
	}

}
