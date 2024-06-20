package modelo;

public class Apartamento extends Financiamento {



    public Apartamento(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual){
        super(valorestimadoImovel, prazoFinanciamentoanual, taxadeJurosAnual);

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
}



