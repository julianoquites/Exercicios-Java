package com.company;

public class CalculadoraDeFuncoes {
    private Calculadora calculadora;

//   public Calculadora getCalculadora(){
//       return this.calculadora;
//     }

    CalculadoraDeFuncoes (){
       calculadora = new Calculadora ();
    }
    public float funcaoA (float x, float y) {

        float parteUm = calculadora.mult(x, x); //x ao quadrado
        float parteDois = calculadora.mult(2, y); // 2y
        return parteUm + parteDois - 1; // função inteira
    }

    public float funcaoB (float x) {

        float parteUm = calculadora.mult(x,x); // x ao quadrado
        float parteDois = (calculadora.mult(parteUm,x) - 2)/3; // x ao quadrado vezes x -2 / 3
        return parteDois + calculadora.mult(5, parteUm);
    }

    public void ImpressaodeValores () {
        System.out.println("O resultado da função A é: " + funcaoA(1,1));
        System.out.println("O resultado da função B é: " + funcaoB(1));
    }

    //public Calculadora getCalculadora() {
    //    return calculadora;
    //}
}
