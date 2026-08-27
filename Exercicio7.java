public class Exercicio7{
    public static void main(String... args){
        //nome completamente qualificado da classe 
        //fully-qualified name 
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        int soma = 0; //acumulador 
        int quantidade = 0; //contador
        System.out.println("Digite um inteiro (0 para encerra)");
        int numero = leitor.nextInt();
        while(numero != 0){
            soma += numero; 
            quantidade++; //pode usar tambem ++quantidade
            java.lang.System.out.println("Digite um inteiro (0 para encerrar)");
            numero = leitor.nextInt();
        }
        java.lang.System.out.println("Soma " + soma);
        java.lang.System.out.printf("Qtde: %d\n", quantidade);
        leitor.close();
    }
}