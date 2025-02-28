package org.example;

class CarroEletrico extends Carro {
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros,
                         String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCarro);
        this.combustivel = "Elétrico";
        if (bateriaKWh <= 0) throw new IllegalArgumentException("Capacidade da bateria inválida");
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        return bateriaKWh * 5; // 5 km por kWh
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bateria: " + bateriaKWh + " kWh");
    }
}