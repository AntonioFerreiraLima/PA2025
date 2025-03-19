package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, Produto> produtos = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== Sistema de Cadastro de Produtos ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando produto...");
                    System.out.print("Digite o código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço: ");
                    double preco = scanner.nextDouble();
                    produtos.put(codigo, new Produto(codigo, nome, preco));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Busca por produto por código...");
                    System.out.print("Digite o código: ");
                    int codigoBusca = scanner.nextInt();
                    Produto produto = produtos.get(codigoBusca);
                    if (produto != null) {
                        System.out.println("=== Produto encontrado ===" );
                        System.out.println("---  " + produto.getCodigo());
                        System.out.println("---  " + produto.getNome());
                        System.out.printf("---  %.2f",+produto.getPreco());

                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}