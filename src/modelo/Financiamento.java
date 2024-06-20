package modelo;


public class Financiamento {

    // Essa clase contém três atributos
    protected   double valorImovel;
    protected   int prazoFinanciamento;
    protected   double taxaJurosAnual;

    // Início de um método construtor
    public Financiamento(double valorestimadoImovel, int prazoFinanciamentoanual, double taxadeJurosAnual) {
        this.valorImovel = valorestimadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoanual;
        this.taxaJurosAnual = taxadeJurosAnual;
    }



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



    // Métodos
    // Esse método irá calcular o pagamento mensal
    public  double calular_pagamento_mensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));

    }

    // Esse método irá calcular o total do pagamento
    public double calcular_total_pagamento() {
        return this.calular_pagamento_mensal() * this.prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento(){
        System.out.println("O valor total vai ser de: " + this.calcular_total_pagamento());
        System.out.println("O valor do imóvel  vai ser de: " + this.getValorImovel());

    }


}

