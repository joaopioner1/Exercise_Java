package exercises;

import java.util.Scanner;

public class Ex19HomensMulheres {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com a idade do primeiro homem: ");
		int idadeH1 = in.nextInt();
		System.out.print("Ente com a idade do segundo homem: ");
		int idadeH2 = in.nextInt();
		System.out.print("Ente com a idade da primeira mulher: ");
		int idadeM1 = in.nextInt();
		System.out.print("Ente com a idade da segunda mulher: ");
		int idadeM2 = in.nextInt();
		
		if (idadeH1 > idadeH2 && idadeM1 < idadeM2) {
			int totalH1M1 = idadeH1 + idadeM1;
			int totalH2M2 = idadeH2 + idadeM2;
			System.out.println("A idade da mulher mais velha é: "+idadeM2);
			System.out.println("A idade da mulher mais nova é: "+idadeM1);
			System.out.println("A idade do homem mais velho é: "+idadeH1);
			System.out.println("A idade do homem mais novo é: "+idadeH2);
			System.out.println("A idade do homem mais velho somada com a idade da mulher mais nova é: "+totalH1M1);
			System.out.println("A idade da mulher mais velha somada com a idade do homens mais novo é: "+totalH2M2);
		}
		else if (idadeH1 < idadeH2 && idadeM2 > idadeM1) {
			int totalH2M1 = idadeH2 + idadeM1;
			int totalH1M2 = idadeH1 + idadeM2;
			System.out.println("A idade da mulher mais velha é: "+idadeM1);
			System.out.println("A idade da mulher mais nova é: "+idadeM2);
			System.out.println("A idade do homem mais velho é: "+idadeH2);
			System.out.println("A idade do homem mais novo é: "+idadeH1);
			System.out.println("A idade do homem mais velho somada com a idade da mulher mais nova é: "+totalH2M1);
			System.out.println("A idade da mulher mais velha somada com a idade do homens mais novo é: "+totalH1M2);
		}
		else if (idadeH1 < idadeH2 && idadeM1 < idadeM2) {
			int totalH2M2 = idadeH2 + idadeM2;
			int totalH1M1 = idadeH1 + idadeM1;
			System.out.println("A idade da mulher mais velha é: "+idadeM2);
			System.out.println("A idade da mulher mais nova é: "+idadeM1);
			System.out.println("A idade do homem mais velho é: "+idadeH2);
			System.out.println("A idade do homem mais novo é: "+idadeH1);
			System.out.println("A idade do homem mais velho somada com a idade da mulher mais nova é: "+totalH2M2);
			System.out.println("A idade da mulher mais velha somada com a idade do homens mais novo é: "+totalH1M1);
		}
		in.close();
	}

}
