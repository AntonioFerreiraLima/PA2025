package org.example;

class ContaSalario extends ContaCorrente {
    private int saquesNoMes;
    private static final double TAXA_SAQUE_ADICIONAL = 5.00;

    public ContaSalario(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial, limiteChequeEspecial);
        this.saquesNoMes = 0;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        double valorTotal = valor;
        saquesNoMes++;
        if (saquesNoMes > 1) {
            valorTotal += TAXA_SAQUE_ADICIONAL;
        }
        if (saldo + getLimiteChequeEspecial() >= valorTotal) {
            saldo -= valorTotal;
            return true;
        }
        return false;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Saques no mês: " + saquesNoMes);
    }
}