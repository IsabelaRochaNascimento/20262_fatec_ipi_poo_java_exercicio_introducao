import java.util.Scanner; //importa a classe que nesse caso é o Scanner 

public class Exercicio6 {
    public static void main(String[] args) { //public -> acessível de fora | static -> pertence à classe
        Scanner leitor = new Scanner(System.in); //new -> cria o objeto qeu vai capturar oq o usuario vai digitar
       //leitor - nome que escolhemos para a variavel //(System.in) -> entrada padrao do sistema 
        System.out.println("Digite um valor de 1 a 7: "); //println ele ja pula a linha no final
        int numero = leitor.nextInt(); //guarda o valor retornado na variável numero do tipo int
                                    //chama o método nextInt() sobre o objeto leitor
        //fall-through
        switch(numero){
            case 1: System.out.println("Segunda"); break;
            case 2: System.out.println("Terca"); break;
            case 3: System.out.println("Quarta"); break;
            case 4: System.out.println("Quinta"); break;
            case 5: System.out.println("Sexta"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Opcao Invalida"); break;
                //break necessario pq em java ele nao para de executar um case
        }
        System.out.println("Até mais"); //sempre sera executada por estar fora das chaves
        leitor.close(); //boa pratica para sempre fechar recursos
    } 
}
