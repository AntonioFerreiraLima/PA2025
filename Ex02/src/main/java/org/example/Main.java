package org.example;

class Main {
    public static void main(String[] args) {
        try {

            Carro carro = new Carro("AAA", "MOD", 2025, 5, "carroA");
            Caminhao caminhao = new Caminhao("BBB", "MOD", 2025, 2, 10.0);
            Onibus onibus = new Onibus("CCC", "MOD", 2025, 40, 6);
            CarroEletrico carroEletrico = new CarroEletrico("DDD", "MOD", 2025, 5, "carroA", 75.0);
            CaminhaoRefrigerado caminhaoRef = new CaminhaoRefrigerado("EEE", "MOD", 2025, 2, 8.0, -20.0);


            System.out.println("---     Carro     ---");
            carro.exibirDetalhes();
            System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");

            System.out.println("---     Caminhão     ---");
            caminhao.exibirDetalhes();
            System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");

            System.out.println("---     Ônibus     ---");
            onibus.exibirDetalhes();
            System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");

            System.out.println("---     Carro Elétrico     ---");
            carroEletrico.exibirDetalhes();
            System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");

            System.out.println("---     Caminhão Refrigerado     ---");
            caminhaoRef.exibirDetalhes();
            System.out.println("Autonomia: " + caminhaoRef.calcularAutonomia() + " km\n");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}