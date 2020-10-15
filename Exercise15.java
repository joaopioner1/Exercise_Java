package arrays_exercises;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] age = new int[10];
		double[] height = new double[age.length];
		int soma = 0, alunoRuim = 0, alunoBom = 0, sm = 0;
		
		for (int i = 0; i < age.length; ++i) {
			sm += 1;
			System.out.print("Insira a idade do aluno " + sm + ": ");
			age[i] = in.nextInt();
			System.out.print("Insira a altura do aluno " + sm + ": ");
			height[i] = in.nextDouble();
			soma += height[i];
		}
		double mediAltura = soma / 10;
		
		for (int j = 0; j < age.length; ++j) {
			if (age[j] >= 13 && height[j] < mediAltura) {
				alunoRuim += 1;
			} else {
				alunoBom += 1;
			}
		}
		System.out.println("Quantidade de alunos com 13 anos e altura abaixo da media: " + alunoRuim);
		System.out.println("alunos normais: " + alunoBom);
	
		in.close();
	}

}
/*.Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que
determine quantos alunos com mais de 13 anos possuem altura inferior à média de
altura desses alunos.
*/
