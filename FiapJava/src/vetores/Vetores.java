package vetores;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		
		// instanciando um vetor com 5 elementos
		int[] vetor = new int [5];
		
		// preencher o vetor
//		vetor[0] = -2;
//		vetor[1] = 10;
//		vetor[2] = -5;
//		vetor[3] = 100;
//		vetor[4] = 20;
//		
//		System.out.println("Vetor[0]: " + vetor[0]);
//		System.out.println("Vetor[1]: " + vetor[1]);
//		System.out.println("Vetor[2]: " + vetor[2]);
//		System.out.println("Vetor[3]: " + vetor[3]);
//		System.out.println("Vetor[4]: " + vetor[4]);

		// Melhorando o exemplo acima
							// lenght = tamanho do vetor
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]: ", i);
			vetor[i] = input.nextInt();
		}
		
		// percorrendo o vetor e imprimindo os seus elementos
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf(" vetor[%d]: %d", i, vetor[i]);
		}
	}
}
