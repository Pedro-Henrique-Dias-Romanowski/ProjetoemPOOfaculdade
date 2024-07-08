package main;
import modelo.*;
import util.InterfaceUsuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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

        Financiamento apartamento = new Apartamento(valorImovel, prazofinanciamento, valorFinanciamento,taxaJuros, numeroVagasGaragem, andar);
        financiamentos.add(apartamento);

        InterfaceUsuario interfaceusuario1 = new InterfaceUsuario();
        Financiamento casa = new Casa(250000, 10, 1500, 20, 50000, 35000);
        financiamentos.add(casa);


        /* InterfaceUsuario interfaceusuario2 = new InterfaceUsuario();
         double valorImovel1 = interfaceusuario2.pedirValorImovel();
         int prazoFinanciamento1 = interfaceusuario2.pedirPrazoFinanciamento();
         double taxaJuros1 = interfaceusuario2.pedirTaxadejuros();
         int tipoZona = interfaceusuario2.pedirTipoDeZona();

         */

        Financiamento terreno = new Terreno(500000, 15, 11,10, 2);
        financiamentos.add(terreno);


        FileWriter escritor = null;
        try {
            escritor = new FileWriter("arquivofinanciamentos.txt");
            escritor.write(apartamento.toString());
            escritor.write(casa.toString());
            escritor.write(terreno.toString());

            escritor.flush();
            escritor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedReader br = null;
        FileReader leitor = null;

        String linha;

        try{
            leitor = new FileReader("arquivofinanciamentos.txt");
            br = new BufferedReader(leitor);

            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            leitor.close();
            br.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}














