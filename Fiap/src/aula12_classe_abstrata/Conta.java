package aula12_classe_abstrata;

public abstract class Conta {
	// Classe Abstrata
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// a classe que herda conta será obrigado a implementar o método por conta dele ser abstrato
	public abstract void imprimeExtrato();
	
}
