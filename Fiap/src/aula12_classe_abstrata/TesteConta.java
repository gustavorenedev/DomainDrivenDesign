package aula12_classe_abstrata;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.setSaldo(1000);
		cp.setSaldo(1500);
		
		cc.imprimeExtrato();
		cp.imprimeExtrato();
		
	}

}
