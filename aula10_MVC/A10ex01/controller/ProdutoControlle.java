package aula10_MVC.controller;

import dao.ProdutoDao;
import model.Produto;

public class ProdutoControlle {
    public boolean salvar(Produto produto) {
        ProdutoDao dao = new ProdutoDao();
        return dao.salvar(produto);
    }

    public boolean excluir(int id) {
        ProdutoDao dao = new ProdutoDao();
        return dao.excluir(id);
    }
}
