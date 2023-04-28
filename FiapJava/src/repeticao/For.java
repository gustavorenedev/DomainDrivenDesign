package repeticao;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Início: ");
		int inicio = input.nextInt();
		
		System.out.println("Fim: ");
		int fim = input.nextInt();
		
		if(inicio < fim) {
			for(int i = inicio; i <= fim; i++) {
				System.out.println("O valor de i é: " + i);
				if(i == 5) {
					break;
				}
			}	
		} else {
			for(int i = inicio; i >= fim; i--) {
				System.out.println("O valor de i é: " + i);
			}
		}
		
	}
}
