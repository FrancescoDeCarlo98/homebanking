package it.miaBanca.sportello.model;

public class ContoCorrenteModel extends ProdottoModel{

    private String codice;
    private String titolare;
    private float saldo;
    private float fido;

    public PersonaModel getPersona()
    {
        return persona;
    }

    private PersonaModel persona;
    private static float massimalePrelievo;

    public ContoCorrenteModel() {}

    public ContoCorrenteModel(String titolare) {
        this.titolare = titolare;
    }

    public ContoCorrenteModel(String titolare, float saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public float getFido() {
        return fido;
    }

    public void setFido(float fido) {
        this.fido = fido;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void deposita(float somma) {
        this.saldo += somma;
    }

    public void preleva(float somma) {
        if(somma-this.saldo < fido)
            this.saldo -= somma;
    }

    public void stampaRiepilogo() {
        System.out.println("Titolare: "+this.titolare);
        System.out.println("Saldo: €"+this.saldo);
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
        this.titolare = persona.getNome()+" "+persona.getCognome();
    }

}
