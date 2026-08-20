import javax.swing.JOptionPane; //ESTUDAR E REVER E COMENTAR

public class Exercicio3{
    public static void main(String args []){
        double prova = Double.parseDouble(
            JOptionPane.showInputDialog("Nota de prova: ")//conversao e captura de uma vez so
        );
        double trabalho = Double.parseDouble(
            JOptionPane.showInputDialog("Notab de trabalho: ")
        );

        double media = (prova * 6 + trabalho * 4) / 10;

        JOptionPane.showMessageDialog(
            null,
            "Media ponderada: " + media
        );
    }
}