package arrays_exercises;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
        
        // declara��o de vetor
        int[] vetor = new int[10];
        
        // entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um n�mero");
            vetor[i] = ent.nextInt();
        }
        
        // sa�da de dados
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
		
		ent.close();
	}

}
