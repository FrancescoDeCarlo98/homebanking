package it.miaBanca.sportello.model;

import it.miaBanca.sportello.view.Banca;

public class FilialeModel {
    private String nome;
    private String indirizzo;
    private String orari;
    private String descrizione;
    private BancaModel banca;

    public FilialeModel() { }
    public FilialeModel(String nome, String indirizzo, String orari, String descrizione, String filialecol, BancaModel banca)
    {
        this.nome= nome;
        this.indirizzo= indirizzo;
        this.orari= orari;
        this.descrizione= descrizione;
        this.banca = banca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getOrari() {
        return orari;
    }

    public void setOrari(String orari) {
        this.orari = orari;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    

    public BancaModel getBanca() {
        return banca;
    }

    public void setBanca(BancaModel banca) {
        this.banca = banca;
    }


}
