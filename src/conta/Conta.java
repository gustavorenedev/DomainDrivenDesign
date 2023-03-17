package conta;

public class Conta {
	private String titular;
	private String agencia;
	private String nConta;
	private double saldo;
	
	// this = apresenta o atributo que vai receber
	// ex: titular recebe titular, qual é parametro e qual é var
	// o certo: parametro titular receber this.titular = titular
	
	// acessores e métodos
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNconta() {
		return nConta;
	}
	public void setNconta(String nConta) {
		this.nConta = nConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// métodos operacionais
	public void depositar(double valor) {
		//this.saldo = saldo + valor;
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void verificaSaldo() {
		System.out.println("Saldo: " + getSaldo());
	}
		
}