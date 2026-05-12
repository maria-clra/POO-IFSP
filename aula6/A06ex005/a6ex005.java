package aula6.A06ex005;

import javax.swing.JOptionPane;
//Maria Clara Novaes Barbosa
//5. Crie uma sobrecarga para cada método do exercício anterior, para receber também o tipo
//da mensagem que será exibida: 1 para mensagem em texto e 2 para mensagem gráfica;

public class a6ex005 {
    public static void main(String[] args) {
        dias(2, 1);
        dias(3, 2);
    }

    private static String dias(int dia) {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Dia inválido";
        }
    }

    private static void dias(int dia, int tipo) {
        String mensagem = dias(dia);

        if (tipo == 1) {
            System.out.println(mensagem);
        } else if (tipo == 2) {
            String caixa = "* " + mensagem + " *";
            JOptionPane.showMessageDialog(null, caixa);
        }
    }
}