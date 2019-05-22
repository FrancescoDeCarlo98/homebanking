package it.miaBanca.sportello.interfaces;

import java.util.ArrayList;

public interface IBaseDAO<T>{
    public T findById(int id);
    public ArrayList<T> findAll();
}