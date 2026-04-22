package aula3.a3ex003;

import javax.swing.JOptionPane;

public class a3ex003 {
    public static void main(String[] args) {

        String larguraStr = JOptionPane.showInputDialog(null, "Largura da parede:", "Maria Clara N Barbosa",
                JOptionPane.QUESTION_MESSAGE);
        String alturaStr = JOptionPane.showInputDialog(null, "Altura da parede:", "Maria Clara N Barbosa",
                JOptionPane.QUESTION_MESSAGE);

        double largura = Double.parseDouble(larguraStr);
        double altura = Double.parseDouble(alturaStr);

        double area = largura * altura;
        int tijolos = (int) (area * 20);

        String classificacao;

        if (altura < 3) {
            classificacao = "Baixa";
        } else if (altura <= 3.5) {
            classificacao = "Média";
        } else {
            classificacao = "Alta";
        }

        JOptionPane.showMessageDialog(
                null,
                "Tijolos: " + tijolos + "\nParede: " + classificacao,
                "Maria",
                JOptionPane.INFORMATION_MESSAGE);
    }
}