import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double input, soma = 0;

    System.out.println("Insira quantos numeros quiser, no final sera imprimida a soma tota. \nPara parar o programa, digite 0");
    while (input != 0) {
        System.out.print("Insira um numero: ");
        input = in.nextDouble();
        soma += input;
    } 
    System.out.println("Soma total = " + soma);
	}
}
