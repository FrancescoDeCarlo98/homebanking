package it.miaBanca.sportello.business;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import it.miaBanca.sportello.dao.PersonaDAO;
import it.miaBanca.sportello.model.PersonaModel;
import it.miaBanca.sportello.view.Frame;


public class RegistrationBusiness {

    private static PersonaModel p;

   public static  int Registration (String nome, String cognome, String indirizzo, String username, String password, String mail){

      p = new PersonaModel(nome, cognome, indirizzo, mail, username, password);

       return PersonaDAO.getInstance().InserisciPersona(p);

    }



    public PersonaModel getP() { return p; }

    public void setP(PersonaModel p) { this.p = p; }
}
