package aula6.A06ex003;

import javax.swing.JOptionPane;

// 3. Crie um método chamado 'imprimir' que mostre uma mensagem gráfica 
// com o texto passado por parâmetro;
// Maria Clara Novaes Barbosa
public class a06ex003 {
    public static void main(String[] args) {
        imprimir("Olá, Mundo!");
    }

    public static void imprimir(String texto) {
        String mensagem = "* " + texto + " *";

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
