package it.miaBanca.sportello.helpers;

import java.util.HashMap;

public class SessionHelper{
    private static SessionHelper instance;
    private HashMap<String,Object> session = new HashMap<String,Object>();
    public static String UTENTE_LOGGATO = "utente loggato";
    public static synchronized SessionHelper getInstance(){
        if(instance == null)
            instance = new SessionHelper();
        return instance;
    }
    public HashMap<String,Object> getSession(){
        return session;
    }
}