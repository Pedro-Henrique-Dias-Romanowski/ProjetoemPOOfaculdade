package util;
import java.util.Scanner;
import modelo.Financiamento;
import modelo.Apartamento;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);

    // Esse método vai solicitar para o usuário digitar o valor do imóvel
    public double pedirValorImovel() {
        double valorImovel = 0;
        do{
            try{
                System.out.println("Qual será o valor do imóvel? ");
                valorImovel = scanner.nextDouble();
                if(valorImovel <= 0 || valorImovel > 1000000){
                    System.out.println("Valor inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());

            }
        } while( valorImovel > 1000000);
        return valorImovel;
    }



    // Esse método vai solicitar ao usário para ele digitar o valor do financiamento
    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento = 0;
        do{
            try{
                System.out.println("Em quantos anos será o financiamento?");
                prazoFinanciamento = scanner.nextInt();
                if(prazoFinanciamento <= 0 || prazoFinanciamento > 20){
                    System.out.println("Prazo inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while(prazoFinanciamento <= 0 || prazoFinanciamento > 20);

        return prazoFinanciamento;
    }



    // Esse método vai solicitar ao usuário para que ele digite o valor da taxa de juros
    public double pedirTaxadejuros() {

        double taxaJurosAnual = 0;
        do{
            try{
                System.out.println("Qual é o valor da porcentagem da taxa de juros? ");
                taxaJurosAnual = scanner.nextDouble();
                if(taxaJurosAnual <= 0 || taxaJurosAnual > 20){
                    System.out.println("Taxa de juros imválida, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while(taxaJurosAnual <= 0 || taxaJurosAnual > 20);
        return taxaJurosAnual;

    }


    // Esse método vai pedir ao usuário o tamanho da área do terreno
    public double pedirTamanhoArea(){
        double tamamhoArea = 0;
        do{
            try{
                System.out.println("Qual será o tamanho da área construída?(Em metros quadrados)");
                tamamhoArea = scanner.nextDouble();
                if(tamamhoArea > 500000 || tamamhoArea < 100){
                    System.out.println("Tamanho da área invalida, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while(tamamhoArea > 500000 || tamamhoArea < 100);
        return tamamhoArea;
    }



    // Esse método vai pedir ao usuário o tamanho do terreno
    public double pedirTamanhoTerreno(){
        double tamanhoTerreno = 0;
        do{
            try{
                System.out.println("Qual será o tamanho do terreno?(Em metros quadrados)");
                tamanhoTerreno = scanner.nextDouble();
                if(tamanhoTerreno > 1000000 || tamanhoTerreno < 100){
                    System.out.println("Tamanho do terreno inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (tamanhoTerreno > 1000000 || tamanhoTerreno < 100);
        return tamanhoTerreno;

    }




    // Esse método vai pedir ao usuário a quantidade de vagas na caragem do apartamento
    public int pedirNumeroDeVagasGaragem(){
        int numeroDeVagas = 0;
        do{
            try {
                System.out.println("Serão quantas vagas na caragem?");
                numeroDeVagas = scanner.nextInt();
                if(numeroDeVagas > 5 || numeroDeVagas < 0){
                    System.out.println("Número de vagas inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while(numeroDeVagas > 5 || numeroDeVagas < 0);
        return numeroDeVagas;
    }



    // Esse método vai pedir ao usuário o número do andar do apartamento
    public int  pedirAndar(){
        int andar = 0;
        do{
            try{
                System.out.println("Qual é o andar do apartamento?");
                andar = scanner.nextInt();
                if(andar > 25 || andar < 0 ){
                    System.out.println("Número do andar inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while(andar > 25 || andar < 0);
        return andar;
    }



    // Esse método vai pedir ao usuário o tipo de zona do terreno
    public int pedirTipoDeZona(){
        int tipoZona = 0;
        do{
            try{
                System.out.println("Qual será o tipo do terreno? Residencial[1] ou Comercial[2]");
                tipoZona = scanner.nextInt();
                if(tipoZona < 1 || tipoZona > 2){
                    System.out.println("Tipo de terreno inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while(tipoZona < 1 || tipoZona > 2);
        return tipoZona;
    }
    }





