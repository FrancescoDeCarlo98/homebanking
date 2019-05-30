package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.model.Banca;

import java.util.ArrayList;

public class BancaDAO {

    //DESIGN PATTERN SINGLETON da implementare per ogni classe dao
    private static BancaDAO instance;
    public static BancaDAO getInstance() {
        if(instance == null)
            instance = new BancaDAO();
        return instance;
    }
    //pattern singleton

    public Banca findById(int id){
        Banca b = new Banca();
        String sql = "SELECT * from banca where id="+id+";";
        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery(sql);

        if(ris.size()!=0){
            String[] riga = ris.get(0);
            b.setNome(riga[1]);
            b.setIndirizzo(riga[2]);
            return b;
        }
        return null;
    }

    public boolean aggiungiBanca(Banca b){

        ArrayList<String[]> verifica = DbConnection.getInstance().eseguiQuery("select * from banca where nome='"+b.getNome()+"';");
        if(verifica.size()!=0)
            return false;
        String sql = "INSERT INTO banca(nome, indirizzo) VALUES('"+b.getNome()+"','"+b.getIndirizzo()+"');";
        DbConnection.getInstance().insertQuery(sql);
        return true;
    }

}
