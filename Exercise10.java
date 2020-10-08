package arrays_exercises;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] alunos = new int[10];
		int soma = 0;
		
		for (int i = 0; i < alunos.length; ++i) {
			soma = 0;
			System.out.println("Digite a nota 1 do aluno: ");
			alunos[i] = in.nextInt();
			soma += alunos[i];
			System.out.println("Digite a nota 2 do aluno: ");
			alunos[i] = in.nextInt();
			soma += alunos[i];
			System.out.println("Digite a nota 3 do aluno: ");
			alunos[i] = in.nextInt();
			soma += alunos[i];
			System.out.println("Digite a nota 4 do aluno: ");
			alunos[i] = in.nextInt();
			soma += alunos[i];
		}
		for (int j = 0; j < 11; ++j) {
			if (soma >= 7) {
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