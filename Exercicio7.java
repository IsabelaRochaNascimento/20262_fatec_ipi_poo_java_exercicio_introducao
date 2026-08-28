public class Exercicio7{
    public static void main(String... args){
        //nome completamente qualificado da classe 
        //fully-qualified name 
        //em vez de fazer o import lá em cima e usar só Scanner, o código
        // está escrevendo o caminho completo da classe toda vez que ela é usada -> java.util.Scanner
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        int soma = 0; //acumulador 
        int quantidade = 0; //contador
        System.out.println("Digite um inteiro (0 para encerra)"); //pedir ao usuario digitar um inteiro
        int numero = leitor.nextInt(); //guarda o valor qeu o ususario digitou em numero
        while(numero != 0){
            soma += numero; 
            quantidade++; //pode usar tambem ++quantidade
            //java.lang.System.out.println -> nome completo mesmo sendo desnecessário, pq classe System
            //está no pacote java.lang, que é o único pacote que o Java importa automaticamente pra todo programa
            java.lang.System.out.println("Digite um inteiro (0 para encerrar)"); 
            numero = leitor.nextInt(); 
        }
        java.lang.System.out.println("Soma " + soma);
        java.lang.System.out.printf("Qtde: %d\n", quantidade);
        leitor.close();
    }
}
