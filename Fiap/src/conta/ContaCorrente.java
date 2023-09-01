package conta;

public class ContaCorrente implements Conta{
    private double saldo;
    private double taxaOperacional = 0.5;
    @Override
    public void depositar(double valor) {
        this.saldo+=valor;

    }
    @Override
    public void sacar(double valor) {
        this.saldo-= valor;

    }
    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
}
