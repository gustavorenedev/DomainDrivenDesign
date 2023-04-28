package vetores;

import java.util.Scanner;

/*
 * 
 * 1) Método para definir o tamanho
 * 2) Método para criar o vetor
 * 3) Método para preencher o vetor
 * 4) Método para imprimir os elementos do vetor
 * 
 * */
public class Exercicio2Vetor {
	
	public int tamanhoVetor() {
		System.out.println("*- Definindo o tamanho do veto -*");
		System.out.println("=================================");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = input.nextInt();
		return tamanho;
	}
	
	// alocando memória para o vetor
	public int[] criaVetor(int t) {
		System.out.println("*- CRIA VETOR -*");
		System.out.println("================");
		int[] v = new int[t];
		return v;
	}
	
	public int[] preencheVetor(int[] v) {
		System.out.println("*- PREENCHE VETOR -*");
		System.out.println("================");
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Digite o vetor[%d]: \n", i);
			v[i] = input.nextInt();
		}
		return v;
	}
	
	public void imprimir(int[] v) {
		System.out.println("*- IMPRIME VETOR -*");
		System.out.println("===================");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Vetor[%d]: %d \n", i, v[i]);
		}
	}
	
	// testando o código acima
	public static void main(String[] args) {
		
		Exercicio2Vetor ev = new Exercicio2Vetor();
		
		int tamanho = ev.tamanhoVetor();
		int[] v = ev.criaVetor(tamanho);
		v = ev.preencheVetor(v);
		ev.imprimir(v);
		
	}
	
	
	
	
	
	
	
	
	
}
