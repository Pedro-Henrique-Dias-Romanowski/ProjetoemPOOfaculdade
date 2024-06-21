package modelo;

public class Terreno extends Financiamento{
    private int  tipodeZona;
    public Terreno(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual, int tipodeZona){
        this.valorImovel = valorestimadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoanual;
        this.taxaJurosAnual = taxadeJurosAnual;
        this.tipodeZona = tipodeZona;
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
}

