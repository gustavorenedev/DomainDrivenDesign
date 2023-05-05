package Matriz;

import java.util.Scanner;

public class TesteMatriz {
	public int[] tamanho(){
		System.out.println("- TAMANHO -");
		System.out.println("==============");
		
		Scanner input = new Scanner(System.in);
		int [] vetor = new int[2];
		
		System.out.println("Linhas: ");
		vetor[0] = input.nextInt();
		
		System.out.println("Colunas: ");
		vetor[1] = input.nextInt();
		
		return vetor;
	}
	
	public int[][] criarMatriz(int[] vetor){
		System.out.println("- Criando a Matriz -");
		System.out.println("==============");
		
		int[][] matriz = new int[vetor[0]][vetor[1]];
		
		Scanner input = new Scanner(System.in);
		
		// linhas
		for(int i = 0; i < matriz.length; i++){
			// colunas dentro da linha
			for(int j = 0; j < matriz[i].length; j++){
				System.out.printf("Matriz[%d][%d]: \n", i, j);
				matriz[i][j] = input.nextInt();
			}
		}
		return matriz;
	}
	
	public void imprimirMatriz(int[][] matriz){
		System.out.println("- IMPRIMIR MATRIZ -");
		System.out.println("==============");
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				System.out.printf("Matriz[%d][[%d]: %d \n", i, j, matriz[i][j]);
			}
		}
	}
	
	// testa o cód acima
	
	public static void main(String[] args) {
		TesteMatriz ex = new TesteMatriz();
		
		int[] tamanho = ex.tamanho();
		
		ex.criarMatriz(tamanho);
		int[][] matriz = ex.criarMatriz(tamanho);
		ex.imprimirMatriz(matriz);
	}
}