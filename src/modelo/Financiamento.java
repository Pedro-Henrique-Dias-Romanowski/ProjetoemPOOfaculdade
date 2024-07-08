package modelo;


public  abstract class Financiamento {

    // Essa clase contém três atributos
    protected double valorImovel;
    protected    int prazoFinanciamento;
    protected   double taxaJurosAnual;
    protected double valorFinanciamento;


    // Aqui estão os métodos getters
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double getValorFinanciamento() {
        return valorFinanciamento;
    }

    // Métodos
    // Esse método irá calcular o pagamento mensal
    public   abstract double calular_pagamento_mensal();


    // Esse método irá calcular o total do pagamento
    public abstract  double calcular_total_pagamento();

    public abstract void mostrarDadosFinanciamento();


}

