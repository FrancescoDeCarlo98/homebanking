package it.miaBanca.sportello.business;

import it.miaBanca.sportello.helpers.MailHelper;
import it.miaBanca.sportello.helpers.SessionHelper;
import it.miaBanca.sportello.dao.PersonaDAO;
import it.miaBanca.sportello.model.Persona;

public class PersonaBusiness
{
    private static PersonaBusiness instance;

    public static synchronized PersonaBusiness  getInstance(){
        if(instance == null)
            instance = new PersonaBusiness();
        return instance;
    }
/* bla bla bla bla bal bla*/

//                MailHelper.getInstance().send(p.getEmail(),"","");

//                SessionHelper.getInstance().getSession().put("utente loggato",p);
}
