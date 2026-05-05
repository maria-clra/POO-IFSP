package A05ex002;
// 2. Aprimore o programa anterior para que incremente o valor das posições pares e 

// decremente das posições ímpares, de acordo com o valor informado pelo usuário.
//Maria Clara Novaes Barbosa

import java.util.Scanner;

public class a05ex002 {
    public static void main(String[] args) {

        int[][] matriz = new int[8][8];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inicial: ");
        int valor = scanner.nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if ((i + j) % 2 == 0) {
                    valor++;
                } else {
                    valor--;
                }

                matriz[i][j] = valor;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
