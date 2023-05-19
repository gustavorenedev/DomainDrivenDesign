package EstudoMatriz;

public class Matriz {
	public static void main(String[] args) {		
		// criando um array
		int[] vetor;
		
		// criando uma matriz
		// criando uma tabela com x = 5 e y = 5
		int[][] matriz = new int[5][5];
		
		// linha 1 coluna 3 recebe o valor 10
		matriz[1][3] = 10;
		matriz[2][1] = 5; 
		
		int soma = matriz[1][3] + matriz[2][1];
		
		// Acessar a matriz
		System.out.println(soma);
	}
}
