package interfaces;

public class GeradorExtratos {
	
	public void imprimeExtrato(Conta conta) {
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
