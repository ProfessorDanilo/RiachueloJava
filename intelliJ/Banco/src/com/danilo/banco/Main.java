package com.danilo.banco;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        Conta contaAtual = null;

        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Selecionar conta");
            System.out.println("3. Ver saldo");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("6. Transferir PIX");
            System.out.println("7. Ver histórico");
            System.out.println("8. Listar todas as contas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1: // Criar nova conta
                    System.out.print("Digite o número da conta: ");
                    String numero = scanner.nextLine();

                    System.out.print("Digite o nome do titular: ");
                    String titular = scanner.nextLine();

                    ContaCorrente novaConta = new ContaCorrente(numero, titular);
                    banco.adicionarConta(novaConta);
                    System.out.println("Conta criada com sucesso.");
                    break;

                case 2: // Selecionar conta
                    System.out.print("Digite o número da conta a selecionar: ");
                    String numSelecionado = scanner.nextLine();
                    Conta encontrada = banco.buscarConta(numSelecionado);
                    if (encontrada != null) {
                        contaAtual = encontrada;
                        System.out.println("Conta " + contaAtual.getNumero() + " selecionada.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3: // Ver saldo
                    if (contaAtual != null) {
                        System.out.println("Saldo atual: R$ " + contaAtual.getSaldo());
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 4: // Depositar
                    if (contaAtual != null) {
                        System.out.print("Valor para depositar: ");
                        double valorDep = scanner.nextDouble();
                        contaAtual.depositar(valorDep);
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 5: // Sacar
                    if (contaAtual != null) {
                        System.out.print("Valor para sacar: ");
                        double valorSaq = scanner.nextDouble();
                        if (!contaAtual.sacar(valorSaq)) {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 6: // Transferência PIX
                    if (contaAtual != null) {
                        System.out.print("Número da conta destino: ");
                        String contaDestino = scanner.nextLine();
                        Conta destino = banco.buscarConta(contaDestino);
                        if (destino != null) {
                            System.out.print("Valor para transferir: ");
                            double valorTransf = scanner.nextDouble();
                            if (!contaAtual.transferirPIX(destino, valorTransf)) {
                                System.out.println("Transferência não realizada.");
                            }
                        } else {
                            System.out.println("Conta destino não encontrada.");
                        }
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 7: // Histórico
                    if (contaAtual != null) {
                        contaAtual.imprimirHistorico();
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 8: // Listar contas
                    banco.listarContas();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
