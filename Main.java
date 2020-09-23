import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);	    
        l
        System.out.print("Insira a quatidade de homens: ");
        int quantH = in.nextInt();
        System.out.print("Insira a quatidade de mulheres: ");
        int quantM = in.nextInt();
        System.out.print("Insira a quatidade de criancas: ");
        int quantC = in.nextInt();
        
        int somaPessoas = quantH + quantM + quantC;
        
        double carneHomem = quantH * 0.400; //calcula a quantidade de carne que cada pessoa vai comer
        double carneMulher = quantM * 0.320;
        double carneCrianca = quantC * 0.200;
        
        double carneTotal = carneHomem + carneMulher + carneCrianca;
        
        double percent = carneTotal * 20 / 100;
        double total = carneTotal + percent;
        
        System.out.printf("O total de carne que devera ser comprado eh de: %.3f kg", total);
        
        in.close();
	}
}
