package interfaces;

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupança cp = new ContaPoupança();
		GeradorExtratos ge = new GeradorExtratos();
		
		
		cc.depositar(2000);
		ge.imprimeExtrato(cc);
		cc.sacar(500);
		ge.imprimeExtrato(cc);
		
		System.out.println("==============");
		
		cp.depositar(1000); 
		ge.imprimeExtrato(cp);
		cp.sacar(500);
		ge.imprimeExtrato(cp);
		
		
		
	}
}
