package EstudoMatriz;

import java.util.Scanner;

public class Matriz2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos dias você quer avaliar: ");
		int dias = input.nextInt();
		
		int[][] matriz = new int[dias][1];
		
		for (int i = 0; i < dias; i++) {
            System.out.println("Digite as temperaturas do dia " + (i + 1) + ":");
            for (int j = 0; j < 1; j++) {
                System.out.print("Temperatura " + (j + 1) + ": ");
                matriz[i][j] = input.nextInt();
            }
        }
		
	}
}
