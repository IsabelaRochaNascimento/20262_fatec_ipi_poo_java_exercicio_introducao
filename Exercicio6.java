import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 7: ");
        int numero = leitor.nextInt();

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
        }
        System.out.println("Até mais");
        leitor.close();
    }
}