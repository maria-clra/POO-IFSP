package aula6.A06ex006;

import javax.swing.JOptionPane;

public class Calendario {

    public static void main(String[] args) {
        dias(2, 1);
        dias(3, 2);
    }

    public static String dias(int dia) {
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

    public static void dias(int dia, int tipo) {
        String mensagem = dias(dia);

        if (tipo == 1) {
            System.out.println(mensagem);
        } else if (tipo == 2) {
            String caixa = "* " + mensagem + " *";
            JOptionPane.showMessageDialog(null, caixa);
        }
    }
}