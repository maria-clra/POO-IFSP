package aula6.A06ex004;

// 4. Crie um método que receba como parâmetro o dia da semana em formato inteiro e
// retorne o nome do dia (segunda-feira, terça-feira etc);
// Maria Clara Novaes Barbosa
public class a06ex004 {
    public static void main(String[] args) {
        System.out.println(dias(2));
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
}