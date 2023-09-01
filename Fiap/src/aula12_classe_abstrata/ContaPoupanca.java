package aula12_classe_abstrata;

import java.util.Date;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimeExtrato() {
		System.out.println("*** Extrato da Conta Poupança ***");
		System.out.println("=================================");
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + new Date());
		System.out.println("=================================");
	}
	
}
