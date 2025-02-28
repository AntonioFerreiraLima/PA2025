package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        try {
            // Criando instâncias das contas
            ContaCorrente cc = new ContaCorrente("001", "AAA", 1000.00, 500.00);
            ContaPoupanca cp = new ContaPoupanca("002", "AAA", 2000.00);
            ContaInvestimento ci = new ContaInvestimento("003", "AAA", 5000.00);
            ContaSalario cs = new ContaSalario("004", "AAA", 1500.00, 200.00);
            ContaInvestimentoAltoRisco risco = new ContaInvestimentoAltoRisco("005", "AAA", 15000.00);

            // Testando depósitos
            cc.depositar(200.00);
            cp.depositar(300.00);
            ci.depositar(1000.00);
            cs.depositar(500.00);
            risco.depositar(2000.00);

            // Testando saques
            System.out.println("---     Testes de Saque     ---");
            System.out.println("Conta Corrente: " + cc.sacar(1300.00));
            System.out.println("Conta Poupança: " + cp.sacar(2500.00));
            System.out.println("Conta Investimento: " + ci.sacar(2000.00));
            System.out.println("Conta Salário: " + cs.sacar(1000.00));
            System.out.println("Conta Salário: " + cs.sacar(200.00));
            System.out.println("Conta Invest Alto Risco: " + risco.sacar(3000.00));

            // Exibindo informações
            System.out.println("\n---     Informações das Contas     ---");
            System.out.println("Conta Corrente:");
            cc.exibirInformacoes();
            System.out.println("\nConta Poupança:");
            cp.exibirInformacoes();
            System.out.println("\nConta Investimento:");
            ci.exibirInformacoes();
            System.out.println("\nConta Salário:");
            cs.exibirInformacoes();
            System.out.println("\nConta Investimento Alto Risco:");
            risco.exibirInformacoes();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}