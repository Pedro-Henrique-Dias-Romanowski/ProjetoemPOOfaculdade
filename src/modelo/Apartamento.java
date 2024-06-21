package modelo;

public class Apartamento extends Financiamento {
    private int numeroDeVagas;
    private int andar;


    public Apartamento(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual, int numeroDeVagas, int andar){
        this.valorImovel = valorestimadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoanual;
        this.taxaJurosAnual = taxadeJurosAnual;
        this.numeroDeVagas = numeroDeVagas;
        this.andar = andar;
        }

    @Override
    public  double calular_pagamento_mensal() {
        // calcular a taxa mensal
          double TaxaMensal = this.taxaJurosAnual / 12;
        // calcular o financiamento em meses
        int Meses = this.prazoFinanciamento * 12;
        // Math.pow(numero, numero) eleva um número(Exemplo: 2 ^ 3)
        return (this.valorImovel*Math.pow(1 + TaxaMensal, Meses))/
                Math.pow(1 + TaxaMensal, Meses - 1);

    }

    @Override
    public double calcular_total_pagamento() {
        return this.calular_pagamento_mensal() * this.prazoFinanciamento * 12;
    }

    @Override
    public void mostrarDadosFinanciamento() {
        System.out.printf("O valor total vai ser de: R$%.2f" , this.calcular_total_pagamento() ,",");
        System.out.printf("O valor do imóvel  vai ser de: R$%.2f " , this.getValorImovel());

    }
}



