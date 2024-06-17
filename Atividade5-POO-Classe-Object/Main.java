public class Main {
    public static void main(String[] args) {

        

        PessoaFisica Miguel = new PessoaFisica("Miguel", "Rua x", "222.222.222.22", 16, 'f');
        PessoaFisica Julia = new PessoaFisica("Julia", "Quintas", "333.333.333.33", 16, 'm');

        PessoaJuridica Jujuba = new PessoaJuridica("Jujuba", "DeQuintas", "444444444", 14, "Galo");
        PessoaJuridica MiguelJuri = new PessoaJuridica("MiguelJuri", "Rua X", "555555555", 10, "Flamengo");


        Conta conta1 = new Conta(1234, Jujuba, 565, 5888);
        Conta conta2 = new Conta(1234, Miguel, 0, 1500);

        conta1.depositar(3000);
        conta1.sacar(500);
        conta1.depositar(500);
        conta1.sacar(500);

        conta2.transferir(conta1, 666);
        conta2.depositar(234);

        System.out.println(conta2);
        conta1.imprimirExtrato();

        System.out.println(Miguel);
        System.out.println(Jujuba);

        @SuppressWarnings("unused")
        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();

        System.out.println("conta1 == conta2 ? " + conta1.equals(conta2));
        System.out.println("Miguel == Julia ? " + Miguel.equals(Julia));
        System.out.println("MiguelJuri == Jujuba ? " + Jujuba.equals(MiguelJuri));

    }
}