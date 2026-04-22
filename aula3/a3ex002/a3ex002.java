package aula3.a3ex002;

import javax.swing.JOptionPane;

public class a3ex002 {
        public static void main(String[] args) {

                String larguraStr = JOptionPane.showInputDialog(null, "Largura da parede:", "Maria Clara N Barbosa",
                                JOptionPane.QUESTION_MESSAGE);
                String alturaStr = JOptionPane.showInputDialog(null, "Altura da parede:", "Maria Clara N Barbosa",
                                JOptionPane.QUESTION_MESSAGE);

                double largura = Double.parseDouble(larguraStr);
                double altura = Double.parseDouble(alturaStr);

                double area = largura * altura;
                int tijolos = (int) (area * 20);

                JOptionPane.showMessageDialog(null, "Quantidade de tijolos: " + tijolos, "Maria",
                                JOptionPane.INFORMATION_MESSAGE);
        }
}
