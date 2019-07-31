package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.model.ClienteModel;
import java.util.ArrayList;

public class ClienteDAO {

    private static ClienteDAO instance;

    public static ClienteDAO getInstance() {
        if (instance == null)
            instance = new ClienteDAO();
        return instance;
    }

    public ClienteModel findById (int id) {

        ClienteModel cliente = null;

        String sql = "SELECT * FROM amministratore, persona where amministratore.idamministratore= "+id+" and persona.idpersona= persona_idpersona";

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        if (result.size() != 0) {
            String[] riga = result.get(0);
            cliente = new ClienteModel();
            cliente.setIdcliente(riga[1]);
            cliente.setData_registrazione(riga[2]);

        }
        return cliente;
    }
}
