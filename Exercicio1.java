import javax.swing.JOptionPane; //fica fora da class
public class Exercicio1{ //declaração da classe principal do programa
    static public void main(String args []){ //metodod main, ponto de entrada no programa 
       String entrada = //abre a caixa de dialogo 
        JOptionPane.showInputDialog("Digite temp em celsius");     //interface grafica (fora do terminal que o usuario pode escrever)
       //classe empacotadora (wrapper) ela embrulha o duble dentro de um objeto e oferece metodos utilitarios
       double celsius = Double.parseDouble(entrada);    //Double = Classe , double = variavel
       double fahrenheit = celsius * 1.8 + 32;
       JOptionPane.showMessageDialog(   
        null,  //indica que a caixa de diálogo não tem uma janela "pai" específica
            String.format("Temp em fahrenhit: %.2f", fahrenheit)    //monta o texto que será exibido, (string) formatando o número
       );

    }
}
