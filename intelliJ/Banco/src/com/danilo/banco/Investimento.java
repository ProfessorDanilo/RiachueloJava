package com.danilo.banco;

public class Investimento {
    private String nome;
    private double valorAplicado;
    private double rentabilidade; // exemplo: 10% ao ano

    public Investimento(String nome, double valorAplicado, double rentabilidade) {
        this.nome = nome;
        this.valorAplicado = valorAplicado;
        this.rentabilidade = rentabilidade;
    }

    public void mostrarInfo() {
        System.out.println("Investimento: " + nome);
        System.out.println("Valor aplicado: R$ " + valorAplicado);
        System.out.println("Rentabilidade anual: " + rentabilidade + "%");
    }
}
