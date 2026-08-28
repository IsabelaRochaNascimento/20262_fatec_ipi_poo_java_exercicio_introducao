
import javax.swing.JOptionPane; //traz a classe das janelinhas gráficas.

public class Exercicio8{ //Declaração da classe
    static public void main(String [] args){ //não muda nada no comportamento: em Java, 
                                            //a ordem dos modificadores (public, static, private, etc.)
        //classes empacotadoras (wrapper) -> Integer em vez do Double 
        int numero = Integer.parseInt( //converte uma String em um número inteiro
            JOptionPane.showInputDialog("Digite um inteiro: ")
        );
        //o tipo String -> é imutável — uma vez criada, uma String nunca muda
        // StringBuilder -> ele é mutável — você pode ir "adicionando"
        //pedaços de texto nele sem recriar tudo do zero a cada vez
        StringBuilder tabuada = new StringBuilder(); //concatenar string de maneira eficiente
       //new StringBuilder() cria um objeto StringBuilder vazio, guardado na variável tabuada
        for (int i = 1; i <= 10; i++) {
            //7 x 1 = 7
            //7 x 2 = 14
            tabuada 
            //append -> method chaining (encadeamento de métodos) — uma técnica de escrever 
            //várias chamadas de método em sequência, uma "grudada na outra"
                .append(numero)    //"7"
                .append(" x ")     //"7 x"
                .append(i)         //"7 x 1"
                .append(" = ")     //"7 x 1 = "
                .append(numero * i)    //"7 x 1 = 7"
                .append("\n");         //"7 x 1 = 7\n"
        }
        javax.swing.JOptionPane.showMessageDialog(
            null,
            //StringBuilder não é uma String (é um tipo diferente!), então, pra usar o conteúdo dele 
            //onde uma String é esperada, você precisa convertê-lo chamando .toString()
            tabuada. toString(),
            "Tabuada", // o título da janela
            JOptionPane.INFORMATION_MESSAGE //define o tipo/ícone da mensagem
        );
    }
}
