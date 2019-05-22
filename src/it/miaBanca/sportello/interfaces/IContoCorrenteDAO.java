
package it.miaBanca.sportello.interfaces;

import it.miaBanca.sportello.model.*;

import java.util.ArrayList;

public interface IContoCorrenteDAO extends IBaseDAO<ContoCorrente>
{
    public ContoCorrente findById(int id);

    public ArrayList<ContoCorrente> findAll();

    public ArrayList<ContoCorrente> findByPersona(Persona p);
}