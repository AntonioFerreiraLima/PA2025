package org.example;

abstract class ContaBancaria {
    protected String numeroConta;
    protected String titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) throw new IllegalArgumentException("Número da conta inválido");
        if (titular == null || titular.trim().isEmpty()) throw new IllegalArgumentException("Titular inválido");
        if (saldoInicial < 0) throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor de depósito deve ser positivo");
        this.saldo += valor;
    }

    public abstract boolean sacar(double valor);

    public void exibirInformacoes() {
        System.out.printf("Conta: %s, Titular: %s, Saldo: R$ %.2f%n",
                numeroConta, titular, saldo);
    }
}
