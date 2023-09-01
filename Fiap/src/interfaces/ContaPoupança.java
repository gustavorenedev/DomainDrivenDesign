package interfaces;

public class ContaPoupança implements Conta{
	
	private double saldo;
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		if (valor < this.getSaldo())
			this.saldo -= valor;
		else
			System.out.println("Saldo insuficiente");
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}
}
