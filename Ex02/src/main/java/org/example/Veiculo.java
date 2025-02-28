package org.example;

abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int capacidadePassageiros;
    protected String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        if (marca == null || marca.trim().isEmpty()) throw new IllegalArgumentException("Marca não pode ser vazia");
        if (ano < 1886) throw new IllegalArgumentException("Ano inválido");
        if (capacidadePassageiros < 1) throw new IllegalArgumentException("Capacidade deve ser positiva");

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    public abstract double calcularAutonomia();

    public void exibirDetalhes() {
        System.out.printf("Marca: %s, Modelo: %s, Ano: %d, Passageiros: %d, Combustível: %s%n",
                marca, modelo, ano, capacidadePassageiros, combustivel);
    }
}
