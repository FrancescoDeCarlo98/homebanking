package it.miaBanca.sportello.model;

public class CassiereModel extends PersonaModel {

    private String idcassiere;
    private String salario;

    public String getIdcassiere() {
        return idcassiere;
    }
    public void setIdcassiere(String idcassiere) {
        this.idcassiere = idcassiere;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) { this.salario = salario; }

    public CassiereModel(){}

    public CassiereModel(String idcassiere, String salario) {
        this.idcassiere = idcassiere;
        this.salario= salario;
    }




//    public float getTassoDiInteresse() {
//        return 0.03F;
//    }

}