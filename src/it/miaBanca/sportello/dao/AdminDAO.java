package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.model.AdminModel;
import java.util.ArrayList;

public class AdminDAO {

    private static AdminDAO instance;

    public static AdminDAO getInstance() {
        if (instance == null)
            instance = new AdminDAO();
        return instance;
    }

    public AdminModel findById (int id) {

        AdminModel a = null;

        String sql = "SELECT * FROM amministratore, persona where amministratore.idamministratore= "+id+" and persona.idpersona= persona_idpersona";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        if (result.size() != 0) {
            String[] riga = result.get(0);
            a = new AdminModel();
            a.setIdamministratore(riga[1]);

        }
        return a;
    }
}
