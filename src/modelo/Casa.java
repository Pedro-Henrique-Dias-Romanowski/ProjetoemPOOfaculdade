package modelo;

public class Casa extends Financiamento{
    public Casa(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual){
        super(valorestimadoImovel, prazoFinanciamentoanual, taxadeJurosAnual);
    }

    @Override
    public  double calular_pagamento_mensal() {
        return  super.calular_pagamento_mensal() + 80;

    }
}
