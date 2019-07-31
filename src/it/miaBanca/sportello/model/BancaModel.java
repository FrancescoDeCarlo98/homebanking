package it.miaBanca.sportello.model;

import it.miaBanca.sportello.dao.BancaDAO;

public class BancaModel {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nome;

    public BancaModel() {
    }

    public BancaModel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public BancaModel findByName(String banca){
//        return BancaDAO.getInstance().findByName(banca);
//    }

        //TODO: VAI NEL DAO E PRENDI L'OGGETTO BANCA DALLA TABELLA BANCA AVENTE IL NOME REQUEST

}
