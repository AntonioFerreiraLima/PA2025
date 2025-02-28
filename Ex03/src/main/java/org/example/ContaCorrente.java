package org.example;

class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial; //limite predefinido unk?

    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial);
        if (limiteChequeEspecial < 0) throw new IllegalArgumentException("Limite inválido");
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    protected double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite Cheque Especial: R$ " + limiteChequeEspecial);
    }
}
