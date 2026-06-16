/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.CidadeController;
import controller.EstadoController;
import model.Cidade;
import model.Estado;

/**
 *
 * @author JP
 */
public class A12ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstadoController ec = new EstadoController();
        CidadeController cc = new CidadeController();
        
        Estado sp = ec.buscar("sigla", "sp").get(0);
        
        
        
        
        for (Cidade c : sp.getCidades())
            System.out.println(c.getNome());
        
        System.exit(0);
    }
    
}
