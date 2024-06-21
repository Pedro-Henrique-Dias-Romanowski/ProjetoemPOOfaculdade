package util;
import java.util.Scanner;
import modelo.Financiamento;
import modelo.Apartamento;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);

    // Esse método vai solicitar para o usuário digitar o valor do imóvel
    public double pedirValorImovel() {
        double valorImovel;
        do{
            System.out.println("Qual é o valor do ímovel?");
            valorImovel = scanner.nextDouble();
            if(valorImovel <= 0 ){
                System.out.println("O valor do imóvel não pode ser negativo e nem igual a zero, tente novamnete");
            } else if(valorImovel > 100000000){
                System.out.println("Valor do imóvel muito alto tente novamente");
            }
        } while(valorImovel <= 0 || valorImovel > 100000000);
        return valorImovel;

    }


    // Esse método vai solicitar ao usário para ele digitar o valor do financiamento
    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento ;
        do{
            System.out.println("Em quantos anos irá ser o financiamento?");
            prazoFinanciamento = scanner.nextInt();
            if (prazoFinanciamento <= 0) {
                System.out.println("O valor do financiamneto não pode ser negativo ou igual a zero, tente novamante");
            } else if(prazoFinanciamento > 20){
                System.out.println("O prazo do financiamento não pode ser maior  do que 20 anos, tente novamente");
            }
        } while (prazoFinanciamento<= 0 || prazoFinanciamento > 20);
        return prazoFinanciamento;
    }



    // Esse método vai solicitar ao usuário para que ele digite o valor da taxa de juros
    public double pedirTaxadejuros() {
        double taxaJurosAnual ;
        do {
            System.out.println("Qual é o valor da porcentagem da taxa de juros?");
            taxaJurosAnual = scanner.nextDouble();
            if (taxaJurosAnual<= 0) {
                System.out.println("O valor da taxa de juros não pode ser negativo e nem igual a zero, tente novamente");
            } else if(taxaJurosAnual > 20){
                System.out.println("Taxa de juros muito alta, tente novamente");
            }
        } while(taxaJurosAnual <= 0 || taxaJurosAnual > 20);
        return taxaJurosAnual;

    }

    public double pedirTamanhoArea(){
         double tamanhoArea;
         do{
             System.out.println("Qual é o tamanho da área construída(Em metros qudrados)");
             tamanhoArea = scanner.nextDouble();
             if(tamanhoArea > 500000){
                 System.out.println("Tamanho da área muito grande, tente novamente");
             } else if(tamanhoArea < 100){
                 System.out.println("O tamanho da área deve ser maior, tente novamente");
             }
         } while(tamanhoArea > 500000 || tamanhoArea < 100 );
           return  tamanhoArea;
    }
    public double pedirTamanhoTerreno(){
         double tamanhoTerreno;
         do{
             System.out.println("Qual será o tamanho do terreno?(Em metros quadrados)");
             tamanhoTerreno = scanner.nextDouble();
             if(tamanhoTerreno > 1000000){
                 System.out.println("Tamanho do terreno muito grande, tente novamente");
             } else if(tamanhoTerreno < 100){
                 System.out.println("O tamanho do terreno deve ser maior, tente novamente");
             }
         } while(tamanhoTerreno > 1000000 || tamanhoTerreno < 100);
         return tamanhoTerreno;
    }

    public int pedirNumeroDeVagasGaragem(){
         int numeroDeVagas;
         do{
             System.out.println("Serão quantas vagas na garagem?");
             numeroDeVagas = scanner.nextInt();
             if(numeroDeVagas > 5){
                 System.out.println("O número de vagas deve ser menor do que 5, tente novamente");
             } else if (numeroDeVagas < 0){
                 System.out.println("O número de vagas não pode ser negativo e nem maior doque cinco, tente novamente");
             }
         } while(numeroDeVagas > 5 || numeroDeVagas < 0);
         return numeroDeVagas;
    }

    public int  pedirAndar(){
         int andar;
         do{
             System.out.println("Qual é o andar do apartamento");
             andar = scanner.nextInt();
             if(andar > 25){
                 System.out.println("O andar deve ser menor do que 25, tente novamente");
             } else if(andar < 0){
                 System.out.println("O andar não pode ser negativo, tente novamente");
             }
         } while(andar > 25 || andar < 0);
         return  andar;
    }

    public int pedirTipoDeZona(){
         int  tipodeZona;
         do{
             System.out.println("Qual será o tipo do terreno? (1[Residencial]/2[Comercial])");
             tipodeZona = scanner.nextInt();
             if(tipodeZona < 1 || tipodeZona > 2){
                 System.out.println("O tipo de zona deve ser Residencial[1] ou comercial[2], tente novamente");
             }
         } while (tipodeZona < 1 || tipodeZona > 2);
         return tipodeZona;
    }

}
