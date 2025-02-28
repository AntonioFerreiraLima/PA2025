package org.example;

class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, "Diesel");
        if (capacidadeCarga <= 0) throw new IllegalArgumentException("Capacidade de carga inválida");
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducaoPercentual = Math.min(capacidadeCarga * 0.01, 0.25);
        double consumoAjustado = 6 * (1 - reducaoPercentual);
        return 300 * consumoAjustado; // 300 litros * consumo ajustado
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
}