package it.miaBanca.sportello.model;

import it.miaBanca.sportello.interfaces.MetodoDiPagamento;

public class PagamentoViaBonifico implements MetodoDiPagamento {

    public ContoCorrente origine;
    public ContoCorrente beneficiario;
    public float importo;

    public PagamentoViaBonifico(ContoCorrente origine, ContoCorrente beneficiario, float importo)
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