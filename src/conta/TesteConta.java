package conta;

public class TesteConta {
	// importar significa que esta em outro pacote
	// instanciar significa que esta no mesmo pacote
	public static void main(String[] args) {
		Conta c1 = new Conta();
		

		
		c1.setTitular("Gostavo");
		c1.setAgencia("123-4");
		c1.setNconta("0001-0");
		c1.depositar(1000);
		
		System.out.println("Objeto: " + c1);
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Conta: " + c1.getNconta());
		System.out.println("Agencia: " + c1.getAgencia());
		System.out.println("Saldo: " + c1.getSaldo());
		
		c1.sacar(300);
		
		c1.verificaSaldo();

	}

}
