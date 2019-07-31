package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.interfaces.IContoCorrenteDAO;
import it.miaBanca.sportello.model.*;

import java.util.ArrayList;
import java.util.Iterator;

public class ContoCorrenteDAO implements IContoCorrenteDAO {

    private static ContoCorrenteDAO instance ;

    public static ContoCorrenteDAO getInstance() {
        if (instance == null)
            instance = new ContoCorrenteDAO();
        return instance;
    }

    //Viene applicato il pattern singleton. Serve per non avere più istanze (oggetti) uguali.

    public ContoCorrenteModel findById(int id) {
        ContoCorrenteModel cc = null;

        String sql = "SELECT * FROM Conto_Corrente WHERE idConto_corrente=" + id + ";";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);//arraylist di vettori di stringhe, ogni vettore è una riga della tabella risultato

        if (result.size() != 0)
        {
            String[] riga = result.get(0); //ogni elemento di riga contiene un campo della riga result
            cc = new ContoCorrenteModel();
            cc.setCodice(riga[1]);
            cc.setSaldo(Float.valueOf(riga[2]));
            cc.setFido(Float.valueOf(riga[3]));
            cc.setPersona(PersonaDAO.getInstance().findById(Integer.valueOf(riga[4])));//cerchiamo nel database la persona a cui è associato il contocorrente
        }

        return cc;

    }
    public ArrayList<ContoCorrenteModel> findByPersona(PersonaModel p)
    {
        String sql = "SELECT * FROM Conto_Corrente WHERE persona_idpersona = " + p.getIdpersona() + " ";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        ArrayList<ContoCorrenteModel> contipersona = null;

        if (result.size() != 0)
        {
            Iterator<String[]> i = result.iterator();

            while(i.hasNext()) {
                String[] riga = i.next(); //ogni elemento di riga contiene un campo della riga result
                ContoCorrenteModel cc = new ContoCorrenteModel();
                cc.setCodice(riga[1]);
                cc.setSaldo(Float.parseFloat(riga[2]));
                cc.setFido(Float.parseFloat(riga[3]));
                //contipersona.add(cc);
                System.out.println(cc.getCodice());
                System.out.println(cc.getSaldo());
                System.out.println(cc.getFido());
            }
        }

        return null;
    }
    public ArrayList<ContoCorrenteModel> findAll(){
        ArrayList<ContoCorrenteModel> cc = null;
        return cc;
    }
}

