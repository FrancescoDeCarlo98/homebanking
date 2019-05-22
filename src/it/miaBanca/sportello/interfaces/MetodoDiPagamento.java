package it.miaBanca.sportello.interfaces;

public interface MetodoDiPagamento {

    public boolean avviaTransazione();
    public boolean paga();
    public boolean concludiTransazione();

}