
package verdoce;

import DAO.DaoVerdoce;
import View.ViewIndex;

public class Verdoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoVerdoce.carregarNotas();
        DaoVerdoce.carregarProduto();
        DaoVerdoce.carregarCliente();
        ViewIndex vi = new ViewIndex();
        vi.setVisible(true);
        vi.setLocationRelativeTo(null);
    }
    
}
