package it.miaBanca.sportello.view;

import it.miaBanca.sportello.dao.ContoCorrenteDAO;
import it.miaBanca.sportello.dao.PersonaDAO;
import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.helpers.MailHelper;
import it.miaBanca.sportello.model.ContoCorrente;
import it.miaBanca.sportello.model.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Banca {

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setLocationRelativeTo(null);
    }


//        Persona p= new Persona();
//        p.setIdpersona("1");

       /* boolean esito;
        esito= p.login("Renna", "Renna");
        System.out.println(esito);

        if (esito==true)
            System.out.println("OTTIMISSIMO");
        else
            System.out.println("Mi Dispiace Samuele :( "); */

       //RegistrationFrame r = new RegistrationFrame();
//        ContoCorrenteDAO cc = new ContoCorrenteDAO();
//        cc.findByPersona(p);



//        w.setLocationRelativeTo(null);



      /*  String sql = "SELECT * FROM persona;";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        int numPersone = result.size();

        System.out.println("Ci sono "+numPersone+" persone nel DB");

        Iterator<String[]> i = result.iterator();

        while(i.hasNext()) {
            String[] riga = i.next();
            System.out.println("ID: "+riga[0]);
            System.out.println("Nome: "+riga[1]);
            System.out.println("Cognome: "+riga[2]);
            System.out.println("Email: "+riga[3]);
            System.out.println("---------");
        }

        ArrayList<Persona> persone = PersonaDAO.getInstance().findAll();

        Iterator<Persona> j = persone.iterator();

        while(j.hasNext()) {
            Persona p=j.next();
            System.out.println(p.toString());
        }

       Persona p1 = PersonaDAO.getInstance().findById(15);
        if(p1!=null)
            System.out.println(p1.toString());
        else
            System.out.println("NON ESISTE!!!");

           MailHelper.getInstance().send("francescodc@hotmail.com", "SUCA", "ciao");
           System.out.println("PROVA MAIL: mail inviata");
*/

    }
