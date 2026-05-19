//Crie as classes Fabricante (nome), Produto(nome, modelo e Fabricante) 
// e instancie os objetos logitech, dell e samsung. 
// Instancie também os objetos hd, mouse e teclado. 
// Mostre, a partir do objeto hd, o seu nome, modelo e a nome do seu fabricante. 
// Os construtores vazio e completo devem ser adicionados nas classes.
// Maria Clara Novaes Barbosa

public class a07ex01 {
    public static void main(String[] args) {
        Fabricante logitech = new Fabricante("Logitech");
        Fabricante dell = new Fabricante("Dell");
        Fabricante samsung = new Fabricante("Samsung");

        Produto hdDell = new Produto("HD", "G2g54", dell);
        Produto mouseSamsung = new Produto("Mouse", "slim Bluetooth e recarregável", samsung);
        Produto tecladoLogitech = new Produto("Teclado", "920-004423", logitech);

        System.out.println(hdDell.getNome() + " " + hdDell.getModelo() + " " + hdDell.getFabricante().getNome());
        System.out.println(
                mouseSamsung.getNome() + " " + mouseSamsung.getModelo() + " " + mouseSamsung.getFabricante().getNome());
        System.out.println(tecladoLogitech.getNome() + " " + tecladoLogitech.getModelo() + " "
                + tecladoLogitech.getFabricante().getNome());
    }

}