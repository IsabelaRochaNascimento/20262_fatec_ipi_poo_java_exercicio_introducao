import java.util.Scanner;  //ESTUDAR CODIGO COMENTRAR

public class Exercicio2{
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a distancia:");
        double distancia = leitor.nextDouble();
        System.out.println("Digite o consumo em km/1");
        double consumo = leitor.nextDouble();
        System.out.println("Preco do litro");
        double preco = leitor.nextDouble();
        double litros = distancia / consumo;
        double custo = litros * preco;
        System.out.println("Litros necessarios: " + litros);
        System.out.printf("Custo total R$%.2f", custo);
        leitor.close();
    }
}