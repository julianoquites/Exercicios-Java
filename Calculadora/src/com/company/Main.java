package com.company;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        CalculadoraDeFuncoes calculadoraDeFuncoes = new CalculadoraDeFuncoes();
      //  Calculadora calculadora = calculadoraDeFuncoes.getCalculadora();

       // calculadoraDeFuncoes.getCalculadora();

         System.out.println("O resultado da soma é " + calculadora.soma(10,10));
      //   System.out.println("O resultado 2 é " + calculadoraDeFuncoes.getCalculadora().soma(20,20));
         System.out.println("O resultado da subtração é " + calculadora.sub(10,10));
         System.out.println("O resultado da multiplicação é " + calculadora.mult(10,10));
         System.out.println("O resultado da divisão é " + calculadora.div(10,10));

        calculadoraDeFuncoes.ImpressaodeValores();


    }
}
