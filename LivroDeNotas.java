//alta coesão 
//somente uma responsabilidade , somente um unico proposito!!!
public class LivroDeNotas{
    private String nomeDaDiscplina; //privou o acesso | setter 

    public LivroDeNotas(String nomeDaDiscplina){
        setNomeDaDisciplina(nomeDaDiscplina);
    }
   //setter
    public void setNomeDaDisciplina(String nomeDaDiscplina  ){ ////efeito colateral -> nao devolve nada 
        //shadowing
       if(nomeDaDiscplina.length() >= 3)
       this. nomeDaDiscplina = nomeDaDiscplina ;
        }
    public String getNomeDaDisciplina(){ //getter ->obter 
        return nomeDaDiscplina;
    } 
    public void exibirMensagem(){ // public -> interface publica 
        System.out.printf("Bem vida ao livro de notas de %s\n", nomeDaDiscplina);
    }
}