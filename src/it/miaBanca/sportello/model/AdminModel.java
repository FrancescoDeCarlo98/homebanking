package it.miaBanca.sportello.model;
import it.miaBanca.sportello.dao.AdminDAO;

public class AdminModel {
    private String idamministratore;

    public String getIdamministratore() {
        return idamministratore;
    }

    public void setIdamministratore(String idamministratore) {
        this.idamministratore = idamministratore;
    }

    public AdminModel(){}

    public AdminModel(String idamministratore) {
        this.idamministratore = idamministratore;
    }


}
