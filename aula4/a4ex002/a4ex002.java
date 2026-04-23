package aula4.a4ex002;

import java.text.DecimalFormat;
import java.util.Scanner;

//2. Crie um programa que solicite a operação (soma, subtração, multiplicação, divisão, resto
// da divisão, potência), e dois valores a calcular e retorne o resultado formatado com
// DecimalFormat;

// Maria Clara Novaes Barbosa
public class a4ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual operação você deseja realizar?");
        System.out
                .print("1 = soma; 2 = subtração; 3 = multiplicação;\n 4 = divisão; 5 = resto da divisão; 6 = potência");
        int operacao = sc.nextInt();

        System.out.print("Primeiro número: ");
        int valor1 = sc.nextInt();

        System.out.print("Segundo número: ");
        int valor2 = sc.nextInt();

        double n = 0;

        if (operacao == 1) {
            n = valor1 + valor2;
        }
        if (operacao == 2) {
            n = valor1 - valor2;
        }
        if (operacao == 3) {
            n = valor1 * valor2;
        }
        if (operacao == 4) {
            n = (double) valor1 / valor2;
        }
        if (operacao == 5) {
            n = valor1 % valor2;
        }
        if (operacao == 6) {
            n = Math.pow(valor1, valor2);
        }

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Resultado: " + df.format(n));

        sc.close();
    }

}
