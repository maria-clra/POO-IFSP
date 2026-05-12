package aula6.A06ex002;

// 2. Crie um método que receba dois números e mostre o maior deles;
//Maria Clara Novaes Barbosa
public class a06ex002 {
    public static void main(String[] args) {
        System.out.println(getResultado(5, 0));
    }

    public static String getResultado(int numero1, int numero2) {
        String resultado;
        if (numero1 > numero2)
            resultado = numero1 + " é maior que " + numero2;
        else
            resultado = numero2 + " é maior que " + numero1;

        return resultado;
    }
}
