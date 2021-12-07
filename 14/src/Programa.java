import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Contato> contatos = new ArrayList<>();
        String opcao = null;

      //  for(int i = 0; i<10;i++){

   //     }

        do {
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do contato");
            String telefone = JOptionPane.showInputDialog(null, "Informe o telefone do contato");
            String email = JOptionPane.showInputDialog(null, "informe o email do contato:");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);
            contatos.add(contato);
            opcao = JOptionPane.showInputDialog(null, "Digite N para criar um novo contato" + " ou qualquer outra letra para terminar.");
        }
        while (opcao.toLowerCase().equals("n"));
    }

}
