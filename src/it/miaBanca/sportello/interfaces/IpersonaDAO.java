package it.miaBanca.sportello.interfaces;

import it.miaBanca.sportello.model.*;

import java.util.ArrayList;

public interface IpersonaDAO extends IBaseDAO<Persona>
{
   Persona findById(int id);

     ArrayList<Persona> findAll();

     ArrayList<ContoCorrente> findByContoCorrente(ContoCorrente cc);
    int verificaUtente(Persona p);
}