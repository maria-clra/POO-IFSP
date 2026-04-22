package aula4.a4ex001;

import java.util.Scanner;

// 1. Crie um programa que solicite o valor inicial e o valor final e mostre um contador progressivo;
// Maria Clara Novaes Barbosa
public class a4ex001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inicial: ");
        int valor_inicial = sc.nextInt();

        System.out.print("Valor final: ");
        int valor_final = sc.nextInt();

        for (int i = valor_inicial; i <= valor_final; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
