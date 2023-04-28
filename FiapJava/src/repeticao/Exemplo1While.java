package repeticao;

import java.util.Scanner;

public class Exemplo1While {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int num = 0;
		int cont = 0;
		int maior = 0;
		int menor = 0;
		System.out.println("Digite um número, o programa só ira para quando for digitado: 999");
		while(num != 999) {
			if (cont == 1){
				maior = num;
				menor = num;
			}
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
			cont += 1;
			System.out.println("Digite 999 quando quiser parar: ");
			num = input.nextInt();
		}
		System.out.println("Dentre todos os " + cont +" números o maior número digitado é: " + maior + " e o menor é: " + menor);
	}

}
