package it.miaBanca.sportello.model;

import it.miaBanca.sportello.exceptions.LoginFailedException;
import it.miaBanca.sportello.dao.PersonaDAO;

public class PersonaModel {
    private String idpersona;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String email;
    private String username;
    private String password;
    private ContoCorrenteModel contoCorrente;

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return this.nome;
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

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonaModel(){}

    public PersonaModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public PersonaModel(String nome, String cognome, String indirizzo, String email, String username, String password ) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int login()
    {
        return PersonaDAO.getInstance().verificaUtente(this);
    }

    @Override
    public String toString()
    {
        return this.nome+" "+this.cognome;
    }

    public float getTassoDiInteresse()
    {
        return 0.05F;
    }

}

