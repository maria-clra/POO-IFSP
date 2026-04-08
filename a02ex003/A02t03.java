package a02ex003;

//3. Crie um programa que receba como argumento dois valores (utilize o vetor args[]) e
//mostre o resto da divisão, produto e média entre esses valores (A02t03.java);
//Maria Clara Novaes Barbosa

public class A02t03 {
    public static void main(String[] args) {
        double valor1 = Double.parseDouble(args[0]);
        double valor2 = Double.parseDouble(args[1]);

        double resto = valor1 % valor2;
        double produto = valor1 * valor2;
        double media = (valor1 + valor2) / 2;

        System.out.println("Resto da divisão: " + resto);
        System.out.println("Produto: " + produto);
        System.out.println("Média: " + media);
    }

}
