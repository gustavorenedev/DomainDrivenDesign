package calculadora;

import java.util.Scanner;

public class TesteCalculadora {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		float num1 = input.nextFloat();
		
		System.out.println("Digite um número: ");
		float num2 = input.nextFloat();
		
		calc.setN1(num1);
		calc.setN2(num2);
		double r = calc.add(calc.getN1(), calc.getN2());
		
		System.out.println("Soma: " + r);
	}
}
