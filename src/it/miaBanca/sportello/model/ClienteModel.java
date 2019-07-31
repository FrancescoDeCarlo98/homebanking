package it.miaBanca.sportello.model;
import it.miaBanca.sportello.dao.ClienteDAO;

public class ClienteModel {

    private String idcliente;
    private  String data_registrazione;

    public String getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }
    public String getData_registrazione() {
        return data_registrazione;
    }
    public void setData_registrazione(String data_registrazione) {
        this.data_registrazione = data_registrazione;
    }

    public ClienteModel(){}

    public ClienteModel (String idcliente, String data_registrazione){
        this.idcliente= idcliente;
        this.data_registrazione= data_registrazione;
    }

}
