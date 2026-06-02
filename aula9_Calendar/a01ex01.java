import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

//Crie um programa que, utilizando JOptionPane, solicite a data de início e data de término
//do período de férias de um funcionário, mostrando uma lista com o número do dia e a
//data para todo o período de férias do funcionário.
//Maria Clara Novaes Barbosa

public class a01ex01 {

    public static void main(String[] args) {

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            String inicioStr = JOptionPane.showInputDialog(
                    "Digite a data de início das férias (dd/MM/yyyy):");

            String fimStr = JOptionPane.showInputDialog(
                    "Digite a data de término das férias (dd/MM/yyyy):");

            Date inicio = sdf.parse(inicioStr);
            Date fim = sdf.parse(fimStr);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(inicio);

            String mensagem = "";
            int dia = 1;

            while (!calendario.getTime().after(fim)) {

                mensagem += "Dia " + dia + " - "
                        + sdf.format(calendario.getTime()) + "\n";

                calendario.add(Calendar.DAY_OF_MONTH, 1);
                dia++;
            }

            JOptionPane.showMessageDialog(null, mensagem, "Lista de Férias",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Data inválida! Utilize o formato dd/MM/yyyy.");
        }
    }
}