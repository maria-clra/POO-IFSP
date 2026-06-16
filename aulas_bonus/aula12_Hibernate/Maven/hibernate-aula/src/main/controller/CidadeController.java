/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cidade;

/**
 *
 * @author jpescola
 */
public class CidadeController extends Controller<Cidade>{

    @Override
    public boolean salvar(Cidade t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Cidade t) {
        return super.excluir(t); 
    }
    
    public List<Cidade> buscar(String campo, String valor) {
        return super.listar(Cidade.class, campo, valor); 
    }

    public Cidade get(int id) {
        return super.get(Cidade.class, id); 
    }
    
    public List<Cidade> listar() {
        return super.listar(Cidade.class, "nome", ""); 
    }

    
    
    
}
