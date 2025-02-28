package org.example;

class ContaInvestimento extends ContaBancaria {
    private static final double TAXA_RETIRADA = 0.02;

    public ContaInvestimento(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        double valorComTaxa = valor + (valor * TAXA_RETIRADA);
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            return true;
        }
        return false;
    }
}
