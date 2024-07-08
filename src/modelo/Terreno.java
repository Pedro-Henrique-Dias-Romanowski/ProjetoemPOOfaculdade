package modelo;

import java.io.Serializable;

public class Terreno extends Financiamento implements Serializable {
    private int  tipodeZona;
    public Terreno(double valorestimadoImovel, int prazoFinanciamentoanual,  double valorFinanciamento , double taxadeJurosAnual, int tipodeZona){
        this.valorImovel = valorestimadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoanual;
        this.taxaJurosAnual = taxadeJurosAnual;
        this.tipodeZona = tipodeZona;
        this.valorFinanciamento = valorFinanciamento;
    }

    @Override
    public  double calular_pagamento_mensal() {
        double pagamentoMensalComJuros = (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
        return pagamentoMensalComJuros * 1.02;
    }

    @Override
    public double calcular_total_pagamento() {
        return this.calular_pagamento_mensal() * this.prazoFinanciamento * 12;
    }

    @Override
    public void mostrarDadosFinanciamento() {
        System.out.printf("O valor total vai ser de: R$%.2f" , this.calcular_total_pagamento(), ",");
        System.out.printf("O valor do imóvel  vai ser de: R$%.2f" , this.getValorImovel());
    }

    public int getTipodeZona() {
        return tipodeZona;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(String.format("Valor do imóvel: R$%.2f", this.getValorImovel())).append("\n");
        sb.append(String.format("Valor do finaciamento: R$%.2f", this.getValorFinanciamento())).append("\n");
        sb.append("Prazo financiamento: " + this.getPrazoFinanciamento()).append("\n");
        sb.append("Taxa de juros: " + this.getTaxaJurosAnual() + "%").append("\n");
        sb.append("Tipo de zona: " + this.getTipodeZona()).append("\n");
        sb.append("\n");
        sb.append(String.format("O valor total vai ser de: R$%.2f", this.calcular_total_pagamento(), ",")).append("\n");
        sb.append(String.format("O pagamento mensal vai ser de: R$%.2f", this.calular_pagamento_mensal())).append("\n");
        sb.append(String.format("O valor do imóvel  vai ser de: R$%.2f" , this.getValorImovel())).append("\n");
        sb.append("\n");


        return sb.toString();
    }
}

