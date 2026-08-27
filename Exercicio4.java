import java.util.Scanner;    //Import: traz a classe Scanner
public class Exercicio4{    //Declaração da classe principal
    static public void main(String abc []){    //ponto de entrada do programa | parâmetro se chama abc em vez de args — o nome do parâmetro é livre
        Scanner leitor = new Scanner(System.in);    //Cria o objeto Scanner para ler a entrada do teclado (System.in)
        System.out.println("Digite um numero inteiro: ");
        //byte(1byte)vai de -128 a 127 , short(2bytes)vai de -32.768 a 32.767 , int(4bytes)vai de aproximadamente -2,1 bilhões a 2,1 bilhões , long(8bytes)para numeros grandes
        int numero = leitor.nextInt();    //lê especificamente um número inteiro
        
       //FORMA TRADICIONAL DE FAZER USAR IF/ELSE
        //if(numero % 2 == 0){
          //  System.out.println("O numero é par");
        //}else 
        //    System.out.println("O numero é impar");
        
        System.out.println(numero % 2 == 0 ? "Par" : "Impar");    //usando o operador ternário, escrever uma condição simples em uma única linha
        leitor.close();    //Fecha o Scanner
    }
}
