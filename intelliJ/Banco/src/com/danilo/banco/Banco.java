package com.danilo.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNumero() + " - Titular: " + conta.getTitular() + " - Saldo: R$ " + conta.getSaldo());
        }
    }
}
