package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.interfaces.IpersonaDAO;
import it.miaBanca.sportello.model.ContoCorrente;
import it.miaBanca.sportello.model.Persona;

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


    public Persona findById(int id) {
        Persona p = null;

        String sql = "SELECT * FROM persona WHERE idpersona="+id+";";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        if(result.size()!=0) {
            String[] riga = result.get(0);
            p=new Persona();
            p.setNome(riga[1]);
            p.setCognome(riga[2]);
            p.setEmail(riga[3]);
        }

        return p;
    }

    public ArrayList<Persona> findAll() {

        ArrayList<Persona> items = new ArrayList<Persona>();

        String sql = "SELECT * FROM persona;";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        Iterator<String[]> i = result.iterator();

        while(i.hasNext()) {
            String[] riga = i.next();

            Persona p = new Persona();

            p.setNome(riga[1]);
            p.setCognome(riga[2]);

            items.add(p);
        }
        return items;
    }
    //mi creo un array nel quale, in ogni cella, ho un oggetto di tipo persona (che possiede tutti gli attributi e metodi di persona)

    public static void setInstance(it.miaBanca.sportello.dao.PersonaDAO instance) {
    }

    public int verificaUtente(Persona p){
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

    public boolean carica(Persona p) {

        String sql = "SELECT * FROM persona WHERE idpersona="+p.getUsername()+";";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        if (result.size() != 0) {
            String[] riga = result.get(0);
            p = new Persona();
            p.setNome(riga[1]);
            p.setCognome(riga[2]);
            return true;
        }
        return false;
    }
    public ArrayList<ContoCorrente> findByContoCorrente(ContoCorrente cc) {
        ArrayList<ContoCorrente> c = null;
        return c;
    }



    public int InserisciPersona (Persona p)
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
        String sql = "SELECT * from persona where persona.accetato=1;";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
        return result;
    }
}