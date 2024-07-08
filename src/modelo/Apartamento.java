package modelo;

import java.io.Serializable;

public class Apartamento extends Financiamento implements Serializable {
    private int numeroDeVagas;
    private int andar;


    public Apartamento(double valorestimadoImovel, int prazoFinanciamentoanual, double valorFinanciamento,double taxadeJurosAnual, int numeroDeVagas, int andar) {
        this.valorImovel = valorestimadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoanual;
        this.taxaJurosAnual = taxadeJurosAnual;
        this.numeroDeVagas = numeroDeVagas;
        this.andar = andar;
        this.valorFinanciamento = valorFinanciamento;
    }

    @Override
    public double calular_pagamento_mensal() {
        // calcular a taxa mensal
        double TaxaMensal = this.taxaJurosAnual / 12;
        // calcular o financiamento em meses
        int Meses = this.prazoFinanciamento * 12;
        // Math.pow(numero, numero) eleva um número(Exemplo: 2 ^ 3)
        return (this.valorImovel * Math.pow(1 + TaxaMensal, Meses)) /
                Math.pow(1 + TaxaMensal, Meses - 1);

    }

    @Override
    public double calcular_total_pagamento() {
        return this.calular_pagamento_mensal() * this.prazoFinanciamento * 12;
    }

    @Override
    public void mostrarDadosFinanciamento() {
        System.out.printf("O valor total vai ser de: R$%.2f", this.calcular_total_pagamento(), ",");
        System.out.printf("O valor do imóvel  vai ser de: R$%.2f ", this.getValorImovel());
        System.out.println("A taxa de juros vai ser de: " + getTaxaJurosAnual() + "%");

    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public int getAndar() {
        return andar;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(String.format("Valor do imóvel: R$%.2f", this.getValorImovel())).append("\n");
        sb.append(String.format("Valor do finaciamento: R$%.2f", this.getValorFinanciamento())).append("\n");
        sb.append("Prazo financiamento anual: " + this.getPrazoFinanciamento()).append("\n");
        sb.append("Taxa de juros: " + this.getTaxaJurosAnual()).append("\n");
        sb.append("Número de vagas: " + this.getNumeroDeVagas()).append("\n");
        sb.append("Andar: " + this.getAndar()).append("\n");
        sb.append("\n");
        sb.append(String.format("O valor total vai ser de: R$%.2f", this.calcular_total_pagamento())).append("\n");
        sb.append(String.format("O pagamento mensal vai ser de: R$%.2f", this.calular_pagamento_mensal())).append("\n");
        sb.append(String.format("O valor do imóvel  vai ser de: R$%.2f" , this.getValorImovel())).append("\n");
        sb.append("\n");


        return sb.toString();
    }
}



