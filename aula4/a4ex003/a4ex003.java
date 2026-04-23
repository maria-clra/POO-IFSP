package aula4.a4ex003;

import java.util.Scanner;

// Maria Clara Novaes Barbosa

//3. Crie um programa que solicite um texto como entrada e mostre como retorno o mesmo
//texto, sem as vogais. Exemplo: “Aprendendo Java” resulta em “prndnd Jv”;

public class a4ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua frase ");
        String frase = sc.nextLine();

        System.out.println(frase.replaceAll("[aeiouAEIOU]", ""));

        sc.close();
    }

}
