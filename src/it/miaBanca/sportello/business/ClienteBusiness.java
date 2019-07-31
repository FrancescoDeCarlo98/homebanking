package it.miaBanca.sportello.business;
import it.miaBanca.sportello.dao.ClienteDAO;
import it.miaBanca.sportello.model.ClienteModel;
import java.util.ArrayList;


public class ClienteBusiness {

    private static ClienteBusiness instance;

    public static synchronized ClienteBusiness  getInstance(){
        if(instance == null)
            instance = new ClienteBusiness();
        return instance;
    }

    public ClienteModel findById(int id){
        ClienteModel cliente = new ClienteModel();
        cliente = ClienteDAO.getInstance().findById(id);
        return cliente;
    }
}
