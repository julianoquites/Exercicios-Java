package poo;

public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;

   public void exibe() {
 System.out.println("O carro é um " + getModelo() + ", cor " + getCor() + ", do ano de " + getAno());
   }
    public Veiculo() {}

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
}
