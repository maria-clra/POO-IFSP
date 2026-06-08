package aula10_MVC.dao;

import java.util.List;
import java.util.ArrayList;
import model.Produto;

public class ProdutoDao {
    public boolean salvar(Produto produto) {
        return true;
    }

    public boolean excluir(int id) {
        return true;
    }

    public boolean alterar(Produto produto) {
        return produto;
    }

    public List<Produto> buscar(String filtro) {
        return new ArrayList<Produto>();
    }
}
