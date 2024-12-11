package Empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        while (true) {
            System.out.println("\n=== Menu do Cofrinho ===");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha a moeda para adicionar:");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.print("Escolha uma opção: ");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Informe o valor da moeda: ");
                    double valor = scanner.nextDouble();

                    Moeda moeda = null;
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else if (tipoMoeda == 3) {
                        moeda = new Real(valor);
                    }

                    if (moeda != null) {
                        cofre.adicionarMoeda(moeda);
                        System.out.println("Moeda adicionada com sucesso!");
                    }
                    break;

                case 2:
                    cofre.listarMoedas();
                    System.out.print("Informe o índice da moeda para remover: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < cofre.moedas.size()) {
                        cofre.removerMoeda(cofre.moedas.get(indice));
                        System.out.println("Moeda removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    cofre.listarMoedas();
                    break;

                case 4:
                    double total = cofre.calcularTotalEmReal();
                    System.out.println("O total em Real é: " + total);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}