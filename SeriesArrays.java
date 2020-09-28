import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de series que deseja digitar: ");
		int sizeVet = in.nextInt();
		//sizeVet = sizeVet - 1;
		
		String[] inputSeries  = new String[sizeVet];
		
		for (int i = 0; i < sizeVet; ++i) {
		    System.out.print("Digite o nome das suas series favoritas: ");
		    inputSeries[i] = in.next();
		    in.nextLine();
		}
	
		System.out.println("SUAS SERIES FAVORITAS: "); 
		for (int j = 0; j < sizeVet; ++j) {
		    System.out.println("--> " + inputSeries[j]);
		}
		
		in.close();
	}
}
