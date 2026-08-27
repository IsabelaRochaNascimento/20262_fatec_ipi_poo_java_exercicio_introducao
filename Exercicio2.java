import java.util.Scanner;     //Import: traz a classe Scanner

public class Exercicio2{     //Declaração da classe principal
    public static void main(String... args){     //ponto de entrada do programa
        Scanner leitor = new Scanner(System.in);    //cria um objeto da classe Scanner,chamado leitor
        System.out.println("Digite a distancia:");    //imprime uma mensagem no terminal
        double distancia = leitor.nextDouble();    //PAUSA o programa esperando o usuário digitar um número decimal
        System.out.println("Digite o consumo em km/1");    
        double consumo = leitor.nextDouble();
        System.out.println("Preco do litro");
        double preco = leitor.nextDouble();
        double litros = distancia / consumo;    //Calcula quantos litros de combustível
        double custo = litros * preco;    //Calcula o custo total da viagem
        System.out.println("Litros necessarios: " + litros);    //Imprime o resultado dos litros necessários
        System.out.printf("Custo total R$%.2f", custo);    
        leitor.close();    //FECHA o Scanner, liberando o recurso de leitura do teclado
    }
}
