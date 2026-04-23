package aula4.a4ex004;

import java.util.Scanner;

//Maria Clara Novaes Barbosa 

public class a4ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual sua comida favorita?");
        String comida = sc.nextLine();

        System.out.print("Qual seu país favorito?");
        String pais = sc.nextLine();

        System.out.print("Qual sua flor favorita?");
        String flor = sc.nextLine();

        if (comida.matches("lasanha|pizza|churrasco")) {
            System.out.println("Eu adoro" + comida);
        } else {
            System.out.println("Disso não gosto muito");
        }

        if (pais.matches("brasil|mexico|colombia")) {
            System.out.println("Eu adoro " + pais);
        } else {
            System.out.println("Disso não gosto muito");
        }

        if (flor.matches("margarida|girassol|orquidea")) {
            System.out.println("Eu adoro" + flor);
        } else {
            System.out.println("Disso não gosto muito");
        }

        sc.close();
    }

}
