package it.miaBanca.sportello.view.ActionListener;
<<<<<<< HEAD

=======
>>>>>>> Deca
import it.miaBanca.sportello.business.PersonaBusiness;
import it.miaBanca.sportello.dao.PersonaDAO;
import it.miaBanca.sportello.model.Persona;
import it.miaBanca.sportello.view.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

<<<<<<< HEAD
public class AdminComboListener implements ActionListener {
    Frame frame;
    public AdminComboListener(Frame frame){this.frame = frame;}
    public void actionPerformed(ActionEvent e) {
        Persona p = new Persona();
        String username = (String)this.frame.getAdminPanel().getUtentiAccettare().getSelectedItem();
        int id = Integer.parseInt(frame.getAdminPanel().getRichieste().get(this.frame.getAdminPanel().getUtentiAccettare().getSelectedIndex())[0]);
        p = PersonaBusiness.getInstance().findById(id);
        frame.getAdminPanel().getInfoRichieste().setText("Nome: "+p.getNome()+"\nCognome: "+p.getCognome()+"\nIndirizzo: "+p.getIndirizzo()+"\nE-mail: "+p.getEmail()+"\nUsername: "+p.getUsername()+"\nPassword: "+p.getPassword());

    }
}
=======
    public class AdminComboListener implements ActionListener {
        Frame frame;
        public AdminComboListener(Frame frame){this.frame = frame;}
        public void actionPerformed(ActionEvent e) {
            Persona p = new Persona();
            String username = (String)this.frame.getAdminPanel().getUtentiAccettare().getSelectedItem();
            p = PersonaBusiness.getInstance().findById(Integer.parseInt(frame.getAdminPanel().getRichieste().get(this.frame.getAdminPanel().getUtentiAccettare().getSelectedIndex())[0]));
            frame.getAdminPanel().getInfoRichieste().setText("Nome: "+p.getNome()+"\nCognome: "+p.getCognome()+"\nIndirizzo: "+p.getIndirizzo()+"\nE-mail: "+p.getEmail()+"\nUsername: "+p.getUsername()+"\nPassword: "+p.getPassword());

        }
    }

>>>>>>> Deca
