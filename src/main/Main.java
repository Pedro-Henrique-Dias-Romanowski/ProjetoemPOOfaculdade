package main;
import modelo.*;
import util.InterfaceUsuario;
import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {


        InterfaceUsuario interfaceusuario  = new InterfaceUsuario();

        double valorImovel = interfaceusuario.pedirValorImovel();
        int prazoFinanciamento = interfaceusuario.pedirPrazoFinanciamento();
        double TaxaJuros = interfaceusuario.pedirTaxadejuros();

        Financiamento financiamentoUsuario = new Financiamento(valorImovel, prazoFinanciamento, TaxaJuros);
        List<Financiamento> financiamentos = new ArrayList<>();
         financiamentos.add(financiamentoUsuario);
         financiamentos.add(new Casa(200000, 20, 8));
         financiamentos.add(new Casa(300000,20, 7));
         financiamentos.add(new Apartamento(1500000, 5, 10));
         financiamentos.add(new Apartamento(250000, 15, 20));
         financiamentos.add(new Terreno(700000, 20, 20));

         double totalImoveis = 0;
         double totalFinanciamentos = 0;
         double pagamentoMensal = 0;

        for(Financiamento financiamento: financiamentos){
            financiamento.mostrarDadosFinanciamento();
            System.out.println("============");
            totalImoveis += financiamento.getValorImovel();
            totalFinanciamentos += financiamento.calcular_total_pagamento();
        }

        System.out.println("Total de todos os imóveis: R$" + totalImoveis);
        System.out.println();
        System.out.println("Total de todos os financiamentos: R$" + totalFinanciamentos);
        System.out.println();
        System.out.println("Cada parcela ficará: R$" + pagamentoMensal);
        System.out.println();
    }
}

       /* InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        double  taxaJuros = interfaceUsuario.pedirTaxadejuros();
        int prazoFinanciamentoanual = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamentoanual, taxaJuros);
        financiamentos.add(financiamento);


        InterfaceUsuario interfaceUsuario1 = new InterfaceUsuario();
        double taxaJuros1 = interfaceUsuario1.pedirTaxadejuros();
        int prazoFinanciamentoanual1 = interfaceUsuario1.pedirPrazoFinanciamento();
        double valorImovel1 = interfaceUsuario1.pedirValorImovel();

        Financiamento financiamento1 = new Financiamento(valorImovel1, prazoFinanciamentoanual1, taxaJuros1);
        financiamentos.add(financiamento1);


        InterfaceUsuario interfaceUsuario2 = new InterfaceUsuario();
        double taxaJuros2 = interfaceUsuario2.pedirTaxadejuros();
        int prazoFinanciamentoanual2 = interfaceUsuario2.pedirPrazoFinanciamento();
        double valorImovel2 = interfaceUsuario2.pedirValorImovel();

        Financiamento financiamento2 = new Financiamento(valorImovel2, prazoFinanciamentoanual2, taxaJuros2);
        financiamentos.add(financiamento2);


        InterfaceUsuario interfaceUsuario3 = new InterfaceUsuario();
        double taxaJuros3 = interfaceUsuario3.pedirTaxadejuros();
        int prazoFinanciamentoanual3 = interfaceUsuario3.pedirPrazoFinanciamento();
        double valorImovel3 = interfaceUsuario3.pedirValorImovel();

        Financiamento financiamento3 = new Financiamento(valorImovel3, prazoFinanciamentoanual3, taxaJuros3);
        financiamentos.add(financiamento3);

        for(Financiamento f : financiamentos){
            System.out.println("----------------------");
            System.out.println("Valor do imóvel: R$" + f.getValorImovel());
            System.out.println("Prazo do financiamento (anos): " + f.getPrazoFinanciamento());
            System.out.println("Taxa de juros: " + f.getTaxaJurosAnual());
            System.out.println("Valor das parcelas: R$" + f.calular_pagamento_mensal());
            System.out.println("Valor total pago: R$" + f.calcular_total_pagamento());
            System.out.println("-----------------------------------------");
        }

        System.out.println("Valor total de todos os imóveis: " + (valorImovel + valorImovel1 + valorImovel2 + valorImovel3));
        System.out.println("O valor total de todos os financiamentos vai ser de: " + (financiamento.calcular_total_pagamento() + financiamento1.calcular_total_pagamento()+
                financiamento2.calcular_total_pagamento()+ financiamento3.calcular_total_pagamento()));

        */







