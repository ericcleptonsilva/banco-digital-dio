public class Main {
    public static void main(String[] args) {
            Cliente eric = new Cliente();
            Cliente Douglas = new Cliente();
            eric.setName("Douglas");

            Conta cc = new ContaCorrente(eric);
            Conta poupanca = new ContaPoupanca(Douglas);

            cc.depositar(500);
            cc.transferir(50, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
    }
}
