package view;

import controller.CidadeController;
import controller.EstadoController;
import model.Cidade;
import model.Estado;

/**
 *
 * @author JP
 */
public class Maven {

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
