package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.model.FilialeModel;
import it.miaBanca.sportello.model.PersonaModel;

import java.util.ArrayList;
import java.util.Iterator;

public class FilialeDAO {
    private static FilialeDAO instance;

    public static FilialeDAO getInstance() {
        if (instance == null)
            instance = new FilialeDAO();
        return instance;
    }

    public ArrayList<FilialeModel> findFiliale(int id)
    {
        ArrayList<FilialeModel> items = new ArrayList<FilialeModel>();
        String sql = "SELECT * FROM filiale where banca_idbanca= '"+id+"';";//+"' and banca.idbanca=filiale.banca_idbanca ;";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);
        Iterator<String[]> i = result.iterator();

        while(i.hasNext()) {
            String[] riga = i.next();

            FilialeModel f = new FilialeModel();

            f.setNome(riga[1]);
            f.setIndirizzo(riga[2]);
            f.setOrari(riga[3]);
            f.setDescrizione(riga[4]);

            items.add(f);
        }
        return items;
    }

    public  int FindNumberFililiByIdBanca(int idBanca){
        return Integer.parseInt(DbConnection.getInstance().eseguiQuery("select " +
                "count(*) from filiale where banca_idbanca="+idBanca+";").get(0)[0]);
    }

    public boolean FindNomeFiliale( String nomeFiliale){
        String sql="select count(*) from banca where nome='"+nomeFiliale+"';";
        if(Integer.parseInt(DbConnection.getInstance().eseguiQuery(sql).get(0)[0])==1)
            return true;
        else
            return false;
    }

    public boolean aggiungiFiliale(FilialeModel f){

        ArrayList<String[]> verifica = DbConnection.getInstance().eseguiQuery("select * from filiale where nome='"+f.getNome()+"' and '"+f.getIndirizzo()+"' and '"+f.getOrari()+"' and '"+f.getDescrizione()+"';");
        if(verifica.size()!=0)//esiste già una banca con lo stesso nome
            return false;
        String sql = "INSERT INTO banca(nome) VALUES('"+f.getNome()+"', '"+f.getIndirizzo()+"', '"+f.getOrari()+"','"+f.getOrari()+"','"+f.getDescrizione()+"');";
        DbConnection.getInstance().insertQuery(sql);
        return true;
    }
}
