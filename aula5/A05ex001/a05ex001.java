package A05ex001;

import java.util.Scanner;
//1. Crie um programa que apresente uma matriz de 8 linhas e 8 colunas. 
// Em seguida, solicite ao usuário um inteiro e substitua todas as posições pares da matriz pelo valor informado;
// Maria Clara Novaes Barbosa

public class a05ex001 {
    public static void main(String[] args) {
        int[][] atividade = new int[8][8];

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valor = s.nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if ((i + j) % 2 == 0) {
                    atividade[i][j] = valor;
                } else {
                    atividade[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(atividade[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}