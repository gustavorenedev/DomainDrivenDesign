package repeticao;

import java.util.Scanner;

public class ValorImpares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				System.out.println("i: " + i + " é ímpar!");
			} else if(i % 2 == 0) {
				System.out.println("i: " + i + " é par!");
			}
		}
	}
}
