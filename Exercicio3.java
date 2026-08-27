import javax.swing.JOptionPane; //Import = traz a classe JOptionPane

public class Exercicio3{    //Declaração da classe principal
    public static void main(String args []){    //ponto de entrada do programa
        double prova = Double.parseDouble(    //pega essa String retornada NA HORA e já CONVERTE para double
            JOptionPane.showInputDialog("Nota de prova: ")//conversao e captura de uma vez so
        );
        double trabalho = Double.parseDouble(    //pede a nota do trabalho e já converte direto para double
            JOptionPane.showInputDialog("Nota de trabalho: ")
        );

        double media = (prova * 6 + trabalho * 4) / 10;    //calculo

        JOptionPane.showMessageDialog(
            null,    //sem janela "pai", a caixa aparece centralizada.
            "Media ponderada: " + media
        );
    }
}
