public class Main {
    public static void main(String[] args) {
            Cliente eric = new Cliente();
            Cliente douglas = new Cliente();
            eric.setName("Eric");
            douglas.setName("Douglas");


            Conta cc = new ContaCorrente(eric);
            Conta poupanca = new ContaPoupanca(douglas);

            cc.depositar(500);
            cc.transferir(50, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
    }
}
