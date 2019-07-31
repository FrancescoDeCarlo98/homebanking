package it.miaBanca.sportello.model;

import it.miaBanca.sportello.interfaces.MetodoDiPagamento;

public class PagamentoViaBonificoModel implements MetodoDiPagamento {

    public ContoCorrenteModel origine;
    public ContoCorrenteModel beneficiario;
    public float importo;

    public PagamentoViaBonificoModel(ContoCorrenteModel origine, ContoCorrenteModel beneficiario, float importo)
    {
        this.origine = origine;
        this.beneficiario = beneficiario;
        this.importo = importo;

    }

    public boolean avviaTransazione() {
        //....
        return true;
    }

    public boolean paga() {
        //....
        origine.preleva(importo);
        beneficiario.deposita(importo);
        return true;
    }

    public boolean concludiTransazione() {
        //....
        return true;
    }

}