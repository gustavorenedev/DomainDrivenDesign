package repeticao;

import java.util.Scanner;

public class CalculadoraDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("Operação: ");
			op = input.nextInt();
			// condição falsa
		} while(op < 1 || op > 4);
		
		System.out.println("Fora do while!!");
	}	

}
