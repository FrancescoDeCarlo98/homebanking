package it.miaBanca.sportello.business;
import it.miaBanca.sportello.dao.CassiereDAO;
import it.miaBanca.sportello.model.CassiereModel;


public class CassiereBusiness {

    private static CassiereBusiness instance;

    public static synchronized CassiereBusiness  getInstance(){
        if(instance == null)
            instance = new CassiereBusiness();
        return instance;
    }

    public CassiereModel findById(int id){
        CassiereModel c = new CassiereModel();
        c = CassiereDAO.getInstance().findById(id);
        return c;
    }
}
