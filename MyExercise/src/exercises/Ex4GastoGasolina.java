package exercises;
import java.util.Scanner;
public class Ex4GastoGasolina {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira quantos km o carro faz com 1 litro de gasolina: ");
		double kmLitro = in.nextDouble();
		System.out.print("Insira a quilometragem inicial do veículo (na saída do passeio): ");
		double kmInicial = in.nextDouble();
		System.out.print("Inisra a quilometragem final do veículo (no retorno do passeio) ");
		double kmFInal = in.nextDouble();
		System.out.print("Insira o valor do litro da gasolina: ");
		double precoLitro = in.nextDouble();
		
		double media = (kmFInal + kmInicial) / kmLitro; 
		double media2 = media * precoLitro;
		System.out.printf("Cada amigo deverá pagar %.2f",(media2 / 4));
		
		in.close();
	}

}
