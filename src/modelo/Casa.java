package modelo;

import java.util.Scanner;

public class Casa extends Financiamento{
    public  double tamanhoArea;
    private double tamanhoTerreno;
    private double acrescimo;

    public Casa(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual, double tamanhoArea, double tamanhoTerreno){
       this.valorImovel = valorestimadoImovel;
       this.prazoFinanciamento = prazoFinanciamentoanual;
       this.taxaJurosAnual = taxadeJurosAnual;
       this.tamanhoArea = tamanhoArea;
       this.tamanhoTerreno = tamanhoTerreno;
    }

    public  double valorMaiorQueMensalidade(double valorJuros, double valorAcrescimo) throws DescontoMaiorDoQueJurosException{

        if(valorAcrescimo > valorJuros){
               acrescimo = valorAcrescimo = valorJuros;
            throw new DescontoMaiorDoQueJurosException(" O valor do acréscimo não pode ser maior do que o valor do juros");
        }

         return this.acrescimo = valorAcrescimo;

    }

    @Override
    public  double calular_pagamento_mensal() {
        try{
            valorMaiorQueMensalidade(taxaJurosAnual, 80);
        } catch (DescontoMaiorDoQueJurosException e){
            System.out.println(e.getMessage());
        }
        return  (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12)) + this.acrescimo;

    }

    @Override
    public double calcular_total_pagamento() {
        return this.calular_pagamento_mensal() * this.prazoFinanciamento * 12;
    }

    @Override
    public void mostrarDadosFinanciamento() {
        System.out.printf("O valor total vai ser de: R$%.2f" , this.calcular_total_pagamento());
        System.out.println();
        System.out.printf("O valor do imóvel  vai ser de: R$%.2f" , this.getValorImovel());
        System.out.println();
    }

    public double getTamanhoArea() {
        return tamanhoArea;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
}
