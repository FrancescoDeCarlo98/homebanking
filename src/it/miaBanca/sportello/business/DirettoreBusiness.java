package it.miaBanca.sportello.business;

import it.miaBanca.sportello.dao.DirettoreDAO;
import it.miaBanca.sportello.model.Persona;

public class DirettoreBusiness {

    private static DirettoreBusiness instance;

    public static synchronized DirettoreBusiness  getInstance(){
        if(instance == null)
            instance = new DirettoreBusiness();
        return instance;
    }

    public Persona findById(int id){
        Persona p = new Persona();
        p = DirettoreDAO.getInstance().findById(id);
        return p;
    }

    public boolean aggiungiDirettore(Persona p){
        return DirettoreDAO.getInstance().aggiungiDirettore(p);
    }
}
