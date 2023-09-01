package interfaces;

public interface Conta {
	// interface pode ser criado métodos default no qual você implementa nas outras classes
	public void depositar(double valor);
	public void sacar(double valor);
	public double getSaldo();
}
