public class ContaPoupanca  extends  Conta{

    public ContaPoupanca(Cliente client) {
        super(client);
    }

    @Override
    public  void imprimirExtrato(){
        System.out.println("Extrato da Conta Corrente");
        super.imprimirInfosComuns();
    }
}