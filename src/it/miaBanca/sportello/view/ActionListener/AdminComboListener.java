package it.miaBanca.sportello.view.ActionListener;

import it.miaBanca.sportello.business.PersonaBusiness;
import it.miaBanca.sportello.dao.PersonaDAO;
import it.miaBanca.sportello.model.PersonaModel;
import it.miaBanca.sportello.model.PersonaModel;
import it.miaBanca.sportello.view.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminComboListener implements ActionListener {
    Frame frame;
    public AdminComboListener(Frame frame){this.frame = frame;}
    public void actionPerformed(ActionEvent e) {
        PersonaModel p = new PersonaModel();
        String username = (String)this.frame.getAdminPanel().getUtentiAccettare().getSelectedItem();
        int id = Integer.parseInt(frame.getAdminPanel().getRichieste().get(this.frame.getAdminPanel().getUtentiAccettare().getSelectedIndex())[0]);//prende l'id dal allaraylist di vettori di stringhe che ha come attributo la classe admin panel. sfrutta il fatto che ogni vettore di stringhe è una riga della tabella e esse sono nello stesso ordine in cui sono elencate nella combobox, quindi l'indice dell'elemento selezionato corrisponde con l'indice dell'elemento dell'arraylist
        p = PersonaBusiness.getInstance().findById(id);
        frame.getAdminPanel().getInfoRichieste().setText("Nome: "+p.getNome()+"\nCognome: "+p.getCognome()+"\nIndirizzo: "+p.getIndirizzo()+"\nE-mail: "+p.getEmail()+"\nUsername: "+p.getUsername()+"\nPassword: "+p.getPassword());

    }
}
