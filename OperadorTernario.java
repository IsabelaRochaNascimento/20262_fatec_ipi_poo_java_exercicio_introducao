public class OperadorTernario{
    static public void main(String args []){
        double nota = 2;
        //se a nota for no minimo 6 esta aprovado, se nao reprovado
        System.out.println(nota >= 6 ? "Aprovado" : nota >= 4 ? "Exame Final" : "Reprovado");
    }
}