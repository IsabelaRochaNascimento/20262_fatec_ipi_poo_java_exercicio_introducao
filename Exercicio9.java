import java.util.Scanner; //REFAZER

public class Exercicio9{
    public static void main(String[] args) {
        //var a = 1; //inteiro pq ela esta atribuida ao 1 que e inteiro
        //var b = 2.2;
        //var c = "abc";
        var leitor = new Scanner(System.in); //operador de inferencia de tipo (java 10+)
        int opcao; //usou int pq nn atribui valor
        var menu = "1-Somar\n2-Multiplicar\n0-Sair";
        do{ 
            System.out.println(menu);
            opcao = leitor.nextInt();
            if(opcao == 1 || opcao == 2){
            System.out.println("Digite o valor 1");
            var a = leitor.nextInt();
            System.out.println("Digite o valor 2");
            var b = leitor.nextInt();
            if(opcao == 1){
                System.out.printf("%d + %d = %d\n"
                , a, b, a + b
                );
            }
        } 
            else{
             System.out.printf("%d * %d = %d\n"
             , a, b, a * b
             );
            }
        }
    }else if (opcao != 0) {
                System.out.println("Opcao Invalida");
            }while (opcao != 0);

}