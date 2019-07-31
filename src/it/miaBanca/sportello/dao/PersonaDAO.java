package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.interfaces.IpersonaDAO;
import it.miaBanca.sportello.model.ContoCorrenteModel;
import it.miaBanca.sportello.model.PersonaModel;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonaDAO implements IpersonaDAO {

    //DESIGN PATTERN SINGLETON da implementare per ogni classe dao
    private static PersonaDAO instance;
    public static PersonaDAO getInstance() {
        if(instance == null)
            instance = new PersonaDAO();
        return instance;
    }
    //pattern singleton

    public boolean FindUsername(String username){
        System.out.println(username);
        String sql="select count(*) from persona where username='"+username+"';";
        if (Integer.parseInt(DbConnection.getInstance().eseguiQuery(sql).get(0)[0]) == 1)
            return true;
        else
            return false;
    }

    public PersonaModel findById(int id) {
        PersonaModel p = null;

        String sql = "SELECT * FROM persona WHERE idpersona="+id+";";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        if(result.size()!=0) {
            String[] riga = result.get(0);
            p = new PersonaModel();
            p.setNome(riga[1]);
            p.setCognome(riga[2]);
            p.setEmail(riga[4]);
            p.setIndirizzo(riga[3]);
            p.setUsername(riga[5]);
            p.setPassword(riga[6]);
        }

        return p;
    }

    public PersonaModel findByUser(String user) {
        PersonaModel p = null;

        String sql = "SELECT * FROM persona WHERE username='"+user+"';";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        if (result.size() != 0) {
            String[] riga = result.get(0);
            p = new PersonaModel();
            p.setNome(riga[1]);
            p.setCognome(riga[2]);
            p.setEmail(riga[4]);
            p.setIndirizzo(riga[3]);
            p.setUsername(riga[5]);
            p.setPassword(riga[6]);

        }
        return p;
    }

    public ArrayList<PersonaModel> findAll() {

        ArrayList<PersonaModel> items = new ArrayList<PersonaModel>();

        String sql = "SELECT * FROM persona;";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        Iterator<String[]> i = result.iterator();

        while(i.hasNext()) {
            String[] riga = i.next();

            PersonaModel p = new PersonaModel();

            p.setNome(riga[1]);
            p.setCognome(riga[2]);

            items.add(p);
        }
        return items;
    }
    //mi creo un array nel quale, in ogni cella, ho un oggetto di tipo persona (che possiede tutti gli attributi e metodi di persona)

    public static void setInstance(it.miaBanca.sportello.dao.PersonaDAO instance) {
    }

    public int verificaUtente(PersonaModel p){
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("select * from persona where username = '"+p.getUsername()+"'"+"and password = '"+p.getPassword()+"';");

        int esito;

        if(result.size()!=0){
            int id = Integer.parseInt(result.get(0)[0]);
            ArrayList<String[]> result1 = DbConnection.getInstance().eseguiQuery("select * from persona,cliente where persona.idpersona=cliente.persona_idpersona and persona.idpersona="+id+";");
            if(result1.size()!=0)
                return esito = 1;

            result1= DbConnection.getInstance().eseguiQuery("select * from persona,cassiere where persona.idpersona=cassiere.persona_idpersona and persona.idpersona="+id+";");
            if(result1.size()!=0)
                return esito = 2;

            result1 = DbConnection.getInstance().eseguiQuery("select * from persona,direttore where persona.idpersona=direttore.persona_idpersona and persona.idpersona="+id+";");
            if(result1.size()!=0)
                return esito = 3;

            result1 = DbConnection.getInstance().eseguiQuery("select * from persona,amministratore where persona.idpersona=amministratore.persona_idpersona  and persona.idpersona="+id+";");
            if(result1.size()!=0)
                return esito = 4;

        }

        return esito = -1;
    }

    public boolean carica(PersonaModel p) {

        String sql = "SELECT * FROM persona WHERE idpersona="+p.getUsername()+";";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        if (result.size() != 0) {
            String[] riga = result.get(0);
            p = new PersonaModel();
            p.setNome(riga[1]);
            p.setCognome(riga[2]);
            return true;
        }
        return false;
    }
    public ArrayList<ContoCorrenteModel> findByContoCorrente(ContoCorrenteModel cc) {
        ArrayList<ContoCorrenteModel> c = null;
        return c;
    }



    public int InserisciPersona (PersonaModel p)
    {

        String sql= "SELECT * FROM persona WHERE username='"+p.getUsername()+"';";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
        System.out.println(1);
        if (result.size() != 0)
            return 1;
        sql = "INSERT INTO persona (nome, cognome, indirizzo, email, username, password, accettato) VALUES('"+p.getNome()+"','"+p.getCognome()+"','"+p.getIndirizzo()+"','"+p.getEmail()+"','" +p.getUsername()+"','"+p.getPassword()+"',1);";
        DbConnection.getInstance().insertQuery(sql);
        System.out.println(result.size());

        return 0;
    }

    public ArrayList<String[]> RichiesteSospese(){
        String sql = "SELECT * from persona where persona.accettato=1;";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
        return result;
    }

    public boolean AccettaRichiesta(int id){
        String sql = "UPDATE persona SET accettato=0 where idpersona="+id+";";
        return DbConnection.getInstance().eseguiAggiornamento(sql);
    }

    public boolean rifiutaRichiesta(int id){
        String sql = "DELETE FROM `bankappdb`.`persona` WHERE idpersona="+id+";";
        return DbConnection.getInstance().eseguiAggiornamento(sql);
    }



    // public boolean


}