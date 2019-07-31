package it.miaBanca.sportello.business;

import it.miaBanca.sportello.dao.BancaDAO;
import it.miaBanca.sportello.model.BancaModel;

public class BancaBusiness {

    private static BancaBusiness instance;

    public static synchronized BancaBusiness getInstance() {
        if (instance == null)
            instance = new BancaBusiness();
        return instance;
    }


    public BancaModel findById(int id) {
        BancaModel b = new BancaModel();
        b = BancaDAO.getInstance().findById(id);
        return b;
    }


    public boolean aggiungiBanca(BancaModel b) { return BancaDAO.getInstance().aggiungiBanca(b); }

}
