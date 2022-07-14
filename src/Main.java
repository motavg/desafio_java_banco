public class Main {

    public static void main(String[] args) {
        Cliente Anthony = new Cliente();
        Anthony.setNome("Anthony");

        Conta cc = new ContaCorrente(Anthony);
        cc.depositar(1000);


        Conta poupanca = new ContaPoupanca(Anthony);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
