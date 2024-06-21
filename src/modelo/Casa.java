package modelo;

public class Casa extends Financiamento{
    public  double tamanhoArea;
    private double tamanhoTerreno;

    public Casa(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual, double tamanhoArea, double tamanhoTerreno){
       this.valorImovel = valorestimadoImovel;
       this.prazoFinanciamento = prazoFinanciamentoanual;
       this.taxaJurosAnual = taxadeJurosAnual;
       this.tamanhoArea = tamanhoArea;
       this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public  double calular_pagamento_mensal() {
        return  (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12)) + 80;

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

    public double getTamanhoArea() {
        return tamanhoArea;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
}
