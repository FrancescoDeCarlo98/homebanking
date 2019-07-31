package it.miaBanca.sportello.interfaces;

import it.miaBanca.sportello.model.*;

import java.util.ArrayList;

public interface IpersonaDAO extends IBaseDAO<PersonaModel>
{
   PersonaModel findById(int id);

     ArrayList<PersonaModel> findAll();

     ArrayList<ContoCorrenteModel> findByContoCorrente(ContoCorrenteModel cc);
    int verificaUtente(PersonaModel p);
}