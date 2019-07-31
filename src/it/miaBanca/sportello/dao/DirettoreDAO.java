package it.miaBanca.sportello.dao;
import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.model.DirettoreModel;
import it.miaBanca.sportello.model.PersonaModel;

import java.util.ArrayList;

public class DirettoreDAO {

    private static DirettoreDAO instance;

    public static DirettoreDAO getInstance() {
        if (instance == null)
            instance = new DirettoreDAO();
        return instance;
    }

    public void InsertDirettoreNuovaBanca(PersonaModel personaModel, String  nomeBanca){
        String sql="insert into persona (nome, cognome, indirizzo, email, username, password, accettato) values ('" +
                personaModel.getNome()+"', '"+personaModel.getCognome()+"', '"+personaModel.getIndirizzo()+"', '"+
                personaModel.getNome()+"."+personaModel.getCognome()+ "@studenti.unisalento.it', '"+
                personaModel.getUsername()+"', '"+personaModel.getPassword()+"', '1')";
        DbConnection.getInstance().insertQuery(sql);

        int idPersona=Integer.parseInt(DbConnection.getInstance().eseguiQuery("select " +
                "idpersona from persona where username='"+personaModel.getUsername()+"';").get(0)[0]);
        int idBanca=Integer.parseInt(DbConnection.getInstance().eseguiQuery("select idbanca from banca where " +
                "nome='"+nomeBanca+"'").get(0)[0]);

        String sql2="insert into direttore (persona_idpersona, banca_idbanca) values ('"+idPersona+"', '"+idBanca+"');";
        DbConnection.getInstance().insertQuery(sql2);
    }

    public void EliminaDirettoreByUsername(String username){
        String sql="select idpersona from persona where username='"+username+"';";
        int idPersona=Integer.parseInt(DbConnection.getInstance().eseguiQuery(sql).get(0)[0]);

        String sql2="delete from direttore where persona_idpersona="+idPersona+";";
        DbConnection.getInstance().deleteQuery(sql2);

        String sql3="delete from persona where username='"+username+"';";
        DbConnection.getInstance().deleteQuery(sql3);

        //DbConnection.getInstance().eseguiQuery("alter table direttore auto_increment=1;");
        //DbConnection.getInstance().eseguiQuery("alter table persona auto_increment=1;");
    }

//    public DirettoreModel findById (int id) {
//
//        DirettoreModel d = null;
//
//        String sql = "SELECT * FROM direttore, persona where direttore.iddirettore= "+id+" and persona.idpersona= persona_idpersona";
//
//        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
//
//        if (result.size() != 0) {
//            String[] riga = result.get(0);
//            d = new DirettoreModel();
//            d.(riga[1]);
//
//        }
//        return d;
//    }
}
