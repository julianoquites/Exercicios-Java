package com.company;

public class Casa {
           //construtor
        public Casa(){
            //acoes do construtor
        }
        //ATRIBUTOS DA CLASSE
        //propriedades ou características
        public int quartos; //quantidade de quartos
        public int sala;
        public int banheiro;
        public int garagem; // quantidade de garagens
        public String cozinha; // tipo da cozinha: americana, padrão etc
        public boolean lavanderia; //tem ou não lavanderia?

        //Métodos da classe
        //capacidades ou ações
        public void abrirPortao(int senha) {
            //acoes do abrirPortao
            if (senha == 1234) {
                System.out.println("Abrindo portão...");
            } else {
                System.out.println("Senha inválida!");
            }
        }
        public void fecharPortao(){
            //acoes do fecharPortao
            System.out.println("Fechando portão...");
        }
    }
