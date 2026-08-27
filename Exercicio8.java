
import javax.swing.JOptionPane;

public class Exercicio8{
    static public void main(String [] args){
        //classes empacotadoras (wrapper)
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um inteiro: ")
        );
        StringBuilder tabuada = new StringBuilder(); //concatenar string de maneira eficiente
        for (int i = 1; i <= 10; i++) {
            //7 x 1 = 7
            //7 x 2 = 14
            tabuada 
                .append(numero)
                .append(" x ")
                .append(i)
                .append(" = ")
                .append(numero * i)
                .append("\n");
        }
        javax.swing.JOptionPane.showMessageDialog(
            null,
            tabuada. toString(),
            "Tabuada",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}