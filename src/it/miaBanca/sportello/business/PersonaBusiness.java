package it.miaBanca.sportello.business;

import it.miaBanca.sportello.helpers.MailHelper;
import it.miaBanca.sportello.helpers.SessionHelper;
import it.miaBanca.sportello.dao.PersonaDAO;
import it.miaBanca.sportello.model.PersonaModel;

import java.util.ArrayList;

public class PersonaBusiness
{
    private static PersonaBusiness instance;

    public static synchronized PersonaBusiness  getInstance(){
        if(instance == null)
            instance = new PersonaBusiness();
        return instance;
    }

    public PersonaModel findById(int id){
        PersonaModel p = new PersonaModel();
        p = PersonaDAO.getInstance().findById(id);
        return p;
    }

    public ArrayList<String[]> Richieste(){
        ArrayList<String[]> result;
        result = PersonaDAO.getInstance().RichiesteSospese();
        return result;

    }

    public PersonaModel findByUser(String user){
        PersonaModel p = new PersonaModel();
        return p = PersonaDAO.getInstance().findByUser(user);
    }

    public boolean AccettaRichiesta(int id){
        boolean esito = PersonaDAO.getInstance().AccettaRichiesta(id);
        return esito;
    }

    public boolean rifiutaRichiesta(int id){
        return PersonaDAO.getInstance().rifiutaRichiesta(id);
    }
//                MailHelper.getInstance().send(p.getEmail(),"","");

//                SessionHelper.getInstance().getSession().put("utente loggato",p);
}