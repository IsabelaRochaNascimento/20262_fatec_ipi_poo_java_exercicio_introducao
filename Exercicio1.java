import javax.swing.JOptionPane; //fica fora da class
public class Exercicio1{
    static public void main(String args []){
       String entrada = 
        JOptionPane.showInputDialog("Digite temp em celsius");     //interface grafica (fora do terminal que o usuario pode escrever)
       //classe empacotadora (wrapper)
       double celsius = Double.parseDouble(entrada);    //Double = Classe , double = variavel
       double fahrenheit = celsius * 1.8 + 32;
       JOptionPane.showMessageDialog(   //
        null,
            String.format("Temp em fahrenhit: %.2f", fahrenheit)    //String de formataçao
       );

    }
}