package arrays_exercises;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		//nao esta funcionando corretamente
		Scanner in = new Scanner(System.in);
		
		int[] alunos = new int[10];
		int soma = 0, n1, n2, n3, n4;
		
		
		for (int i = 0; i < alunos.length; ++i) {
			soma = 0;
			System.out.println("Digite a nota 1 do aluno: ");
			n1 = in.nextInt();
			soma += n1;
			System.out.println("Digite a nota 2 do aluno: ");
			n2 = in.nextInt();
			soma += n2;
			System.out.println("Digite a nota 3 do aluno: ");
			n3 = in.nextInt();
			soma += n3;
			System.out.println("Digite a nota 4 do aluno: ");
			n4 = in.nextInt();
			soma += n4;
			soma /= 4;
			alunos[i] = soma;
		}
		for (int j = 0; j < 11; ++j) {
			if (alunos[j] >= 7) {
				System.out.println("O aluno " + alunos[j] + " passou, nota = " + soma);
			} else {
				System.out.println("O aluno  " + alunos[j] + " reprovou, nota = " + soma);
			}
		}
		
		in.close();
	}

}
/* Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene
num vetor a média de cada aluno, imprima o número de alunos com média maior
ou igual a 7.0.
*/
