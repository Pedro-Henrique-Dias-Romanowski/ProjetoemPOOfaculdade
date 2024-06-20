package modelo;

public class Terreno extends Financiamento{
    public Terreno(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual){
        super(valorestimadoImovel, prazoFinanciamentoanual, taxadeJurosAnual);
    }

    @Override
    public  double calular_pagamento_mensal() {
        double pagamentoMensalComJuros = super.calular_pagamento_mensal();
        return pagamentoMensalComJuros * 1.02;

    }
}

