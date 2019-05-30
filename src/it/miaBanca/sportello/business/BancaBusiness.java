package it.miaBanca.sportello.business;

import it.miaBanca.sportello.dao.BancaDAO;
import it.miaBanca.sportello.model.Banca;

public class BancaBusiness {

    private static BancaBusiness instance;

    public static synchronized BancaBusiness  getInstance(){
        if(instance == null)
            instance = new BancaBusiness();
        return instance;
    }


    public Banca findById(int id){
        Banca b = new Banca();
        b = BancaDAO.getInstance().findById(id);
        return b;
    }

}
