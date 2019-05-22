package it.miaBanca.sportello.business;

import it.miaBanca.sportello.model.Persona;
import it.miaBanca.sportello.view.Frame;

import javax.swing.*;

public class LoginBusiness {

    // Inserisci le funzioni che userà la View
    private Persona p;

    public int login(String username, String password) {

         this.p = new Persona(username, password);
        return p.login();

    }

    public Persona getP() { return p; }

    public void setP(Persona p) { this.p = p; }
}
