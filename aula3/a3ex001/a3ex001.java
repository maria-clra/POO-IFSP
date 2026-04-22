package aula3.a3ex001;

import java.util.Scanner;

public class a3ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Largura da parede (m): ");
        double largura = sc.nextDouble();

        System.out.print("Altura da parede (m): ");
        double altura = sc.nextDouble();

        double area = largura * altura;
        int tijolos = (int) (area * 20);

        System.out.println("Quantidade de tijolos: " + tijolos);

        sc.close();
    }
}