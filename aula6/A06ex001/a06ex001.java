package aula6.A06ex001;

// 1. Crie um método que retorne o nome do indivíduo de acordo com o código inteiro
// passado por parâmetro;
// Maria Clara Novaes Barbosa

public class a06ex001 {
    public static void main(String[] args) {
        System.out.println(nome(1));
    }

    private static String nome(int numero) {
        if (numero == 1) {
            return "Maria Alice";
        } else if (numero == 2) {
            return "Maria Clara";
        } else if (numero == 3) {
            return "Maria Fernanda";
        } else {
            return "Código inválido";
        }
    }
}
