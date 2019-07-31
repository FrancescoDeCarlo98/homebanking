package it.miaBanca.sportello.business;
import it.miaBanca.sportello.dao.AdminDAO;
import it.miaBanca.sportello.model.AdminModel;
import java.util.ArrayList;


public class AdminBusiness {

    private static AdminBusiness instance;

    public static synchronized AdminBusiness  getInstance(){
        if(instance == null)
            instance = new AdminBusiness();
        return instance;
    }

    public AdminModel findById(int id){
        AdminModel a = new AdminModel();
        a = AdminDAO.getInstance().findById(id);
        return a;
    }
}
