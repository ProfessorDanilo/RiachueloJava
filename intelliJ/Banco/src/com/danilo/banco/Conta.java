package com.danilo.banco;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String numero;
    private String titular;
    protected double saldo;
    private List<Transacao> historico;

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add(new Transacao("Depósito", valor));
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historico.add(new Transacao("Saque", valor));
            return true;
        }
        return false;
    }

    public boolean transferirPIX(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            historico.add(new Transacao("Transferência PIX para " + destino.getNumero(), valor));
            return true;
        }
        return false;
    }

    public void imprimirHistorico() {
        System.out.println("Histórico da conta " + numero);
        for (Transacao t : historico) {
            System.out.println(t);
        }
    }
}
