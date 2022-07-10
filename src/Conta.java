import javax.swing.*;

public abstract class Conta implements IConta {

    private  static  final  int AGENCIA_PADRAO = 1;
    private  static int SEQUANCIAL = 1;

    protected int agencia;
    protected  int numero;
    protected  double saldo;
    protected  Cliente cliente;

    public  Conta(Cliente client){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUANCIAL++;
        this.cliente = client;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getName());
        System.out.printf("Agencia: %d", this.agencia);
        System.out.printf("Numero: %d", this.numero);
        System.out.printf("Saldo: %.2f", this.saldo);
    }
}
