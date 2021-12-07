import poo.Veiculo;

public class TestaVeiculo {

    public static void main(String[] args){
        Veiculo a = new Veiculo();
        Veiculo b = new Veiculo();

        a.setModelo("Fiesta");
        a.setCor("Branco");
        a.setAno(2000);
        b.setModelo("Corsa");
        b.setCor("Rosa");
        b.setAno(2010);

        a.exibe();
        b.exibe();
    }
}

//        a.modelo = "Fiesta";
//        a.cor = "Branco";
//        a.ano = 2000;
//        b.modelo = "Corsa";
//        b.cor = "Rosa";
//        b.ano = 2010;

//        System.out.println("O carro a é um " + a.getModelo() + " cor " + a.getCor() + " do ano de " + a.getAno());
//        System.out.println("O carro b é um " + b.getModelo() + " cor " + b.getCor() + " do ano de " + b.getAno());
//
//        String Modelo = a.getModelo();
//        System.out.println(modelo);
//
//        a.setModelo(a.modelo);
//        modelo = a.getModelo();
//        System.out.println(modelo);

