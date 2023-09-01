package aula12_classe_abstrata;

import java.util.Date;

public class ContaCorrente extends Conta{

	@Override
	public void imprimeExtrato() {
		System.out.println("*** Extrato da Conta Corrente ***");
		System.out.println("=================================");
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + new Date());
		System.out.println("=================================");
	}
	
}
