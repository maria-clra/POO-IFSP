package aula10_MVC.view;

import aula10_MVC.controller.ProdutoControlle;
import model.Produto;

public class A10ex01 {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome('Teclado');
        p.setPreco(10f);

        ProdutoControlle pc = new ProdutoControlle();
        if (pc.salvar(p))
            System.out.println("Produto criado com sucesso");
        else
            System.out.println("Erro ao cadastrar");
    }

}
