package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.model.PersonaModel;
import it.miaBanca.sportello.view.Banca;

import java.util.ArrayList;
import java.util.Iterator;

public class BancaDAO {
    private static BancaDAO instance;

    public static BancaDAO getInstance() {
        if (instance == null)
            instance = new BancaDAO();
        return instance;
    }
    public BancaModel findById(int id) {
        BancaModel b = new BancaModel();
        String sql = "SELECT * FROM banca WHERE id='"+ id +"'";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        if(result.size()!=0) {
            String[] riga = result.get(0);
            b.setId(Integer.parseInt(riga[0]));
            b.setNome(riga[1]);
        }
        return b;
    }

//    public BancaModel findById(int id){
//        BancaModel b = new BancaModel();
//        String sql = "SELECT * from banca where id="+id+";";
//        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery(sql);
//
//        if(ris.size()!=0){
//            String[] riga = ris.get(0);
//            b.setNome(riga[1]);
//            return b;
//        }
//        return null;
//    }

    public boolean aggiungiBanca(BancaModel b){

        ArrayList<String[]> verifica = DbConnection.getInstance().eseguiQuery("select * from banca where nome='"+b.getNome()+"';");
        if(verifica.size()!=0)//esiste già una banca con lo stesso nome
            return false;
        String sql = "INSERT INTO banca(nome) VALUES('"+b.getNome()+"');";
        DbConnection.getInstance().insertQuery(sql);
        return true;
    }

    public boolean FindNomeBanca(String nomeBanca){
        String sql="select count(*) from banca where nome='"+nomeBanca+"';";
        if(Integer.parseInt(DbConnection.getInstance().eseguiQuery(sql).get(0)[0])==1)
            return true;
        else
            return false;
    }

    public ArrayList<String[]>  FindGeneralitàBanche(ArrayList<BancaModel> banche, int i){
        ArrayList <String[]> array= DbConnection.getInstance().eseguiQuery("select banca.nome, filiale.nome, filiale.indirizzo," +
                    "filiale.orari, filiale.descrizione, persona.username from banca inner join filiale on banca.idbanca=" +
                    "filiale.banca_idbanca inner join direttore on direttore.banca_idbanca=banca.idbanca inner join " +
                    "persona on direttore.persona_idpersona=persona.idpersona where banca.nome='" + banche.get(i).getNome() + "';");
        //System.out.println(array.size());
        return array;
    }

    public void EliminaBancaByName(String nome){
        String sql2="select idbanca from banca where nome='"+nome+"';";
        int idBanca=Integer.parseInt(DbConnection.getInstance().eseguiQuery(sql2).get(0)[0]);

        String sql3="select idfiliale from filiale where filiale.banca_idbanca="+idBanca+";";
        int idFiliale=Integer.parseInt(DbConnection.getInstance().eseguiQuery(sql3).get(0)[0]);

        String sql4="delete from cassiere where filiale_idfiliale="+idFiliale+";";
        DbConnection.getInstance().deleteQuery(sql4);

        String sql5="delete from filiale where banca_idbanca="+idBanca+";";
        DbConnection.getInstance().deleteQuery(sql5);

        String sql6="delete from cliente where banca_idbanca="+idBanca+";";
        DbConnection.getInstance().deleteQuery(sql6);

        String sql7="delete from banca where nome='"+nome+"';";
        DbConnection.getInstance().deleteQuery(sql7);

        //DbConnection.getInstance().eseguiQuery("alter table banca auto_increment=1;");
        //DbConnection.getInstance().eseguiQuery("alter table filiale auto_increment=1;");
    }

    public ArrayList<BancaModel> findAll() {

        ArrayList<BancaModel> items = new ArrayList<BancaModel>();

        String sql = "SELECT * FROM banca;";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        Iterator<String[]> i = result.iterator();

        while(i.hasNext()) {
            String[] riga = i.next();

            BancaModel b = new BancaModel();

            b.setId(Integer.parseInt(riga[0]));
            b.setNome(riga[1]);
            items.add(b);
        }
        return items;
    }



}