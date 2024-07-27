public class Main {

    public static void main(String[] args) {

        Banco b1 = new Banco();
        b1.setNome("Banco Digital");

        Cliente c1 = new Cliente("Clara", b1);

        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c1);

        cc.depositar(100);
        cp.depositar(500);
        cp.transferir(cc, 50);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        b1.mostrarClientes();

    }
}