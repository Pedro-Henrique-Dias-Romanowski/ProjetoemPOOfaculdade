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

}
