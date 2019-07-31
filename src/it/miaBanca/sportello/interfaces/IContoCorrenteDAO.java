
package it.miaBanca.sportello.interfaces;

import it.miaBanca.sportello.model.*;

import java.util.ArrayList;

public interface IContoCorrenteDAO extends IBaseDAO<ContoCorrenteModel>
{
    public ContoCorrenteModel findById(int id);

    public ArrayList<ContoCorrenteModel> findAll();

    public ArrayList<ContoCorrenteModel> findByPersona(PersonaModel p);
}