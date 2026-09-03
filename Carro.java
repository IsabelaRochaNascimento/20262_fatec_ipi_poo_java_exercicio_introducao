public class Carro {

    private String marca;
    private String veiculo; 

    //METODO ACELERAR
    public void acelerar(){
        System.out.println("carro esta acelerrando!");
    }
    //METODO FREAR
    public void frear(){
        System.out.println("carro esta freando!");
    }
    //GETTER
    public String getMarca(){
        return marca;
    }

    //SETTER
    public void setMarca(String marca){
        this. marca = marca ; //operador de alta referancia 
    }

    public String getveiculo(){
        return veiculo;
    }

    public void setVeiculo(String veiculo){
        this. veiculo = veiculo;
    }
}