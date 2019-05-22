package it.miaBanca.sportello.interfaces;

import it.miaBanca.sportello.model.Prodotto;

import java.util.ArrayList;

public interface IprodottoDAO extends IBaseDAO<Prodotto> {

    @Override

    public Prodotto findById(int id);

    @Override
    public ArrayList<Prodotto> findAll();
}