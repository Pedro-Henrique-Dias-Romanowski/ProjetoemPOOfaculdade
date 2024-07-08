package util;
import java.util.Scanner;
import modelo.Financiamento;
import modelo.Apartamento;

public class InterfaceUsuario  {
    Scanner scanner = new Scanner(System.in);

    // Esse método vai solicitar para o usuário digitar o valor do imóvel
    public double pedirValorImovel() {
        double valorImovel = -1;
        while(valorImovel <= 0 || valorImovel > 1000000){
            System.out.println("Qual será o valor do imóvel?");
            try{
                valorImovel = scanner.nextDouble();
                if(valorImovel <= 0 || valorImovel > 1000000){
                    System.out.println("Valor de imóvel inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return valorImovel;
    }



    // Esse método vai solicitar ao usário para ele digitar o valor do financiamento
    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento = -1;
        while(prazoFinanciamento <= 0 || prazoFinanciamento > 20){
            System.out.println("Em quantos anos será o financiamento?");
            try{
                prazoFinanciamento = scanner.nextInt();
                if(prazoFinanciamento <= 0 || prazoFinanciamento > 20){
                    System.out.println("Prazo inválido, tente novamente");
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return prazoFinanciamento;
    }


    // Esse método pede ao usuário o valor do financiamento
    public double pedirValorFinaciamento() {
        double valorFinanciamento = -1;
        while(valorFinanciamento <= 0 || valorFinanciamento > 1000000 ){
            System.out.println("Qual será o valor do financiamento?");
            try{
                valorFinanciamento = scanner.nextDouble();
                if(valorFinanciamento <= 0 || valorFinanciamento > 1000000){
                    System.out.println("Valor de imóvel inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return valorFinanciamento;
    }





    // Esse método vai solicitar ao usuário para que ele digite o valor da taxa de juros
    public double pedirTaxadejuros() {

        double taxaJurosAnual = -1;
        while(taxaJurosAnual <= 0 || taxaJurosAnual > 20){
            System.out.println("Qual é o valor da porcentagem da taxa de juros?");
            try{
                taxaJurosAnual = scanner.nextInt();
                if(taxaJurosAnual <= 0 || taxaJurosAnual > 20){
                    System.out.println("Taxa de juros inválida, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return taxaJurosAnual;

    }



    // Esse método vai pedir ao usuário o tamanho da área do terreno
    public double pedirTamanhoArea(){
        double tamanhoArea = -1;
        while(tamanhoArea < 100 || tamanhoArea > 500000){
            System.out.println("Qual será o tamanho da área construída?(Em metros quadrados)");
            try{
                tamanhoArea = scanner.nextDouble();
                if(tamanhoArea < 100 || tamanhoArea > 500000){
                    System.out.println("Tamanho da área invalida, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return tamanhoArea;
    }




    // Esse método vai pedir ao usuário o tamanho do terreno
    public double pedirTamanhoTerreno(){
        double tamanhoTerreno = -1;
        while(tamanhoTerreno > 1000000 || tamanhoTerreno < 100){
            System.out.println("Qual será o tamanho do terreno?(Em metros quadrados)");
            try{
                tamanhoTerreno = scanner.nextDouble();
                if(tamanhoTerreno < 100 || tamanhoTerreno > 1000000 ){
                    System.out.println("Tamanho do terreno inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return tamanhoTerreno;

    }


    // Esse método vai pedir ao usuário a quantidade de vagas na garagem do apartamento
    public int pedirNumeroDeVagasGaragem(){
        int numeroDeVagas = -1;
        while(numeroDeVagas > 5 || numeroDeVagas < 0){
            System.out.println("Serão quantas vagas na garagem?");
            try{
                numeroDeVagas = scanner.nextInt();
                if(numeroDeVagas > 5 || numeroDeVagas < 0 ){
                    System.out.println("Número de vagas inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return numeroDeVagas;
    }




    // Esse método vai pedir ao usuário o número do andar do apartamento
    public int  pedirAndar(){
        int andar = -1;
        while(andar > 25 || andar < 0 ){
            System.out.println("Qual é o andar do apartamento?");
            try{
                andar = scanner.nextInt();
                if(andar > 25 || andar < 0 ){
                    System.out.println("Número do andar inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return andar;
    }





    // Esse método vai pedir ao usuário o tipo de zona do terreno
    public int pedirTipoDeZona(){
        int tipoDeZona = -1;
        while(tipoDeZona < 1 || tipoDeZona > 2){
            System.out.println("Qual será o tipo do terreno? Residencial[1] ou Comercial[2]");
            try{
                tipoDeZona = scanner.nextInt();
                if(tipoDeZona < 1 || tipoDeZona > 2 ){
                    System.out.println("Tipo de terreno inválido, tente novamente");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return tipoDeZona;
    }
    }








