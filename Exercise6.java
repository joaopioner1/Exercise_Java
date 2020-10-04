package arrays_exercises;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        // declaração de vetor
        int[] vetor = new int[10];
        
        // entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número");
            vetor[i] = in.nextInt();
        }
        
        // saída de dados
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
		
	in.close();
	}

}
