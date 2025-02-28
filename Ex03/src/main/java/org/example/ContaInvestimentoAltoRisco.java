package org.example;

class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double TAXA_RETIRADA = 0.05;
    private static final double SALDO_MINIMO = 10000.00;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || saldo < SALDO_MINIMO) return false;
        double valorComTaxa = valor + (valor * TAXA_RETIRADA);
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            return true;
        }
        return false;
    }
}
