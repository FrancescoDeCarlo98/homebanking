package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.model.CassiereModel;
import it.miaBanca.sportello.model.PersonaModel;

import java.util.ArrayList;

public class CassiereDAO {

    private static CassiereDAO instance;
    public static CassiereDAO getInstance() {
        if(instance == null)
            instance = new CassiereDAO();
        return instance;
    }

    public CassiereModel findById (int id) {

        CassiereModel c = null;

        String sql = "SELECT * FROM cassiere, persona where cassiere.idcassiere= "+id+" and persona.idpersona= persona_idpersona";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        if (result.size() != 0) {
            String[] riga = result.get(0);
            c = new CassiereModel();
            c.setIdcassiere(riga[1]);
            c.setSalario(riga[2]);

        }
        return c;
    }

    public void InsertCassiere(PersonaModel personaModel, String  nomeFiliale){
        String sql="insert into persona (nome, cognome, indirizzo, email, username, password, accettato) values ('" +
                personaModel.getNome()+"', '"+personaModel.getCognome()+"', '"+personaModel.getIndirizzo()+"', '"+
                personaModel.getNome()+"."+personaModel.getCognome()+ "@studenti.unisalento.it', '"+
                personaModel.getUsername()+"', '"+personaModel.getPassword()+"', '0')";
        DbConnection.getInstance().insertQuery(sql);

        int idPersona=Integer.parseInt(DbConnection.getInstance().eseguiQuery("select " +
                "idpersona from persona where username='"+personaModel.getUsername()+"';").get(0)[0]);
        int idfiliale=Integer.parseInt(DbConnection.getInstance().eseguiQuery("select idifiale from filiale where " +
                "nome='"+nomeFiliale+"'").get(0)[0]);

        String sql2="insert into cassiere (persona_idpersona, filiale_idfiliale) values ('"+idPersona+"', '"+idfiliale+"');";
        DbConnection.getInstance().insertQuery(sql2);
    }

}


