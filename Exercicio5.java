import javax.swing.JOptionPane;

public class Exercicio5{
    public static void main(String args[]){
        float media = Float.parseFloat(  //float(4bytes) , double(8bystes)
            JOptionPane.showInputDialog("Digite a media: ")
        );        
        String situacao;
        //if/else encadeado
        if(media >= 6)
            situacao = "Aprovado";
        else if(media >= 4)
            situacao = "Recuperacao";
        else
            situacao = "Reprovado";
        JOptionPane.showMessageDialog(
            null,
            "O aluno esta: " + situacao
        );
    }
}