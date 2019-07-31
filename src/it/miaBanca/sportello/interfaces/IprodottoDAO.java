package it.miaBanca.sportello.interfaces;

import it.miaBanca.sportello.model.ProdottoModel;

import java.util.ArrayList;

public interface IprodottoDAO extends IBaseDAO<ProdottoModel> {

    @Override

    public ProdottoModel findById(int id);

    @Override
    public ArrayList<ProdottoModel> findAll();
}