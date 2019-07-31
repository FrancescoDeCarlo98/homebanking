package it.miaBanca.sportello.business;


import it.miaBanca.sportello.dao.FilialeDAO;
import it.miaBanca.sportello.model.FilialeModel;

import java.util.ArrayList;

public class FilialeBusiness {

    public ArrayList<FilialeModel> findFiliale(int id)
    {
        ArrayList<FilialeModel> result;
        result = FilialeDAO.getInstance().findFiliale(id);
        return result;

    }

}
