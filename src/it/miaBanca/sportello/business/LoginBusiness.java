package it.miaBanca.sportello.business;

import it.miaBanca.sportello.model.PersonaModel;
import it.miaBanca.sportello.view.Frame;

import javax.swing.*;

public class LoginBusiness {

    // Inserisci le funzioni che userà la View
    private PersonaModel p;

    public int login(String username, String password) {

         this.p = new PersonaModel(username, password);
        return p.login();

    }

    public PersonaModel getP() { return p; }

    public void setP(PersonaModel p) { this.p = p; }
}
