//arquivo para ver onde o sistemas funciona 
public class TesteLivroDeNotas{
    public static void main(String [] args){
        //NEW MESMA COISA QUE O MALLOC
        LivroDeNotas livroDeNotas = new LivroDeNotas("POO"); //variavel de referencia -> livroDeNotas
        livroDeNotas.exibirMensagem();
        LivroDeNotas livroDeNotas2 = new LivroDeNotas("PAOO");
        livroDeNotas2.exibirMensagem();
        //Esse livro é de : POO 
        System.out.printf("Esse livro é de: %s\n", livroDeNotas.getNomeDaDisciplina());
        //Esse livro é de : PAOO
        System.out.printf("Esse livro é de: %s\n", livroDeNotas2.getNomeDaDisciplina());
    }
}