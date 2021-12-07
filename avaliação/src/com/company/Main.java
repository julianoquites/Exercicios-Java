package com.company;
import java.util.Scanner; //classe para ler do teclado a partir do cmd
public class Main {

    public static void main(String[] args) {

    Casa c; //objeto
        int senha;

        Scanner ler = new Scanner(System.in); //objeto de leitura

        System.out.println("Digite a senha para abrir o portão:");
        senha = Integer.parseInt (ler.nextLine());
        //instanciação
    c = new Casa();

c.abrirPortao(senha); //invocando o metodo abrirPortao da classe Casa
c.quartos = 4;
c.cozinha = "padrão";
    }
}
