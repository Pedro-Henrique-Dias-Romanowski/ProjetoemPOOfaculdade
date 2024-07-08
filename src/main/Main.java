package main;
import modelo.*;
import util.InterfaceUsuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        InterfaceUsuario interfaceusuario = new InterfaceUsuario();
        List<Financiamento> financiamentos = new ArrayList<Financiamento>();

        double valorImovel = interfaceusuario.pedirValorImovel();
        int prazofinanciamento = interfaceusuario.pedirPrazoFinanciamento();
        double valorFinanciamento = interfaceusuario.pedirValorFinaciamento();
        double taxaJuros = interfaceusuario.pedirTaxadejuros();
        int andar = interfaceusuario.pedirAndar();
        int numeroVagasGaragem = interfaceusuario.pedirNumeroDeVagasGaragem();

        Financiamento apartamento = new Apartamento(valorImovel, prazofinanciamento, valorFinanciamento, taxaJuros, numeroVagasGaragem, andar);
        financiamentos.add(apartamento);

        InterfaceUsuario interfaceusuario1 = new InterfaceUsuario();
        Financiamento casa = new Casa(250000, 10, 15000, 10, 50000, 35000);
        financiamentos.add(casa);


        Financiamento terreno = new Terreno(500000, 15, 10000, 10, 2);
        financiamentos.add(terreno);

        Financiamento ap = new Apartamento(20000, 5, 1500, 3, 1, 5);
        financiamentos.add(ap);

        Financiamento casa1 = new Casa(10000, 15, 2000, 2, 25000, 10000);
        financiamentos.add(casa1);


        FileWriter escritor = null;
        double totalImoveis = 0;
        double totalFinanciamentos = 0;
        try {
            escritor = new FileWriter("arquivofinanciamentos.txt");
            escritor.write(apartamento.toString());
            escritor.write(casa.toString());
            escritor.write(terreno.toString());
            escritor.write(ap.toString());
            escritor.write(casa1.toString());
            for (Financiamento financiamento : financiamentos) {
                totalImoveis += financiamento.getValorImovel();
                totalFinanciamentos += financiamento.calcular_total_pagamento();
            }

            escritor.flush();
            escritor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedReader br = null;
        FileReader leitor = null;

        String linha;

        try {
            leitor = new FileReader("arquivofinanciamentos.txt");
            br = new BufferedReader(leitor);

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            leitor.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ObjectOutputStream obj = null;
        try {
            obj = new ObjectOutputStream(new FileOutputStream("arquivolistaFinanciamentos.ser"));
            obj.writeObject(financiamentos);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Financiamento> financiamentosSerializados = new ArrayList<>();
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("arquivolistaFinanciamentos.ser"));
            financiamentosSerializados = (List<Financiamento>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Financiamento financiamento : financiamentosSerializados) {
            System.out.println(financiamento);
        }
    }
}
















