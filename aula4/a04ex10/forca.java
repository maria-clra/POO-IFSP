package aula4.a04ex10;

import java.util.Scanner;

public class forca {
    public static void main(String[] args) {
        int vidas = 7;
        String p = args[0];
        String r = "";
        boolean gameOver;
        Scanner s = new Scanner(System.in);
        while (vidas > 0) {
            gameOver = true;
            for (int i = 0; i < p.length(); i++) {
                char x = p.charAt(i);
                if (r.matches(".*" + x + ".*"))
                    System.out.println(x);
                else {
                    System.out.println("-");
                    gameOver = false;
                }
            }

            if (gameOver) {
                System.out.println("\nParabéns, você venceu!");
                break;
            }

            System.out.print("Vidas = " + vidas + " Digite uma letra: ");
            String l = s.next();
            if (!l.matches("[a-z]|[A-Z]"))
                continue;

            if (r.matches(".*" + l + ".*")) {
                System.out.println("Você já digitou essa letra");
                continue;
            }

            if (p.matches(".*" + l + ".*")) {
                System.out.println("correto");
            } else {
                System.out.println("errou");
                vidas--;
            }
            r += l;
        }
        System.out.println("Game Over");
    }

}

// javac aula4\a04ex10\forca.java
// java aula4.a04ex10.forca banana