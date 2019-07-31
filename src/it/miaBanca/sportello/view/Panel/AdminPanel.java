package it.miaBanca.sportello.view.Panel;

import it.miaBanca.sportello.business.PersonaBusiness;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class AdminPanel {
    public JPanel getAdminPanel() {
        return AdminPanel;
    }

    private JPanel AdminPanel;
    private JButton creaNuovaBancaButton;
    private JButton accettaRichiestaButton;
    private JButton rifiutaRichiestaButton;
    private JButton LogOutButtonAdmin;
    private JButton registraBancaButton;
    private JButton eliminaBancaButton;
    private ArrayList<String[]> richieste;

    private JComboBox utentiAccettare = new JComboBox();
    private JTextArea infoRichieste = new JTextArea();

    public AdminPanel() {
        AdminPanel.getUI();
        AdminPanel.setVisible(false);
        this.infoRichieste.setEditable(false);
        this.updateRichieste();
        // int id =  Integer.parseInt(this.richieste.get(1)[1]);
    }

    public void updateRichieste() {
        Vector<String> username = new Vector<String>();
        this.richieste = PersonaBusiness.getInstance().Richieste();
        utentiAccettare.removeAllItems();
        Iterator<String[]> i = richieste.iterator();
        while (i.hasNext()) {
            String[] riga = i.next();
            this.utentiAccettare.addItem(riga[1] + " " + riga[2]);
        }
    }

    public JButton getRegistraBancaButton() {
        return registraBancaButton;
    }

    public void setRegistraBancaButton(JButton registraBancaButton) {
        this.registraBancaButton = registraBancaButton;
    }

    public void setAdminPanel(JPanel AdminPanel) {
        this.AdminPanel = AdminPanel;
    }

    public JButton getCreaNuovaBancaButton() {
        return creaNuovaBancaButton;
    }

    public void setCreaNuovaBancaButton(JButton creaNuovaBancaButton) {
        this.creaNuovaBancaButton = creaNuovaBancaButton;
    }

    public JButton getAccettaRichiestaButton() {
        return accettaRichiestaButton;
    }

    public void setAccettaRichiestaButton(JButton accettaRichiestaButton) {
        this.accettaRichiestaButton = accettaRichiestaButton;
    }

    public JButton getRifiutaRichiestaButton() {
        return rifiutaRichiestaButton;
    }

    public void setRifiutaRichiestaButton(JButton rifiutaRichiestaButton) {
        this.rifiutaRichiestaButton = rifiutaRichiestaButton;
    }

    public JButton getLogOutButtonAdmin() {
        return LogOutButtonAdmin;
    }

    public void setLogOutButtonAdmin(JButton logOutButton) {
        LogOutButtonAdmin = logOutButton;
    }

//    public JPanel getNuovaBancaPanel() {
//        return nuovaBancaPanel;
//    }
//
//    public void setNuovaBancaPanel(JPanel nuovaBancaPanel) {
//        this.nuovaBancaPanel = nuovaBancaPanel;
//    }

    public void setEliminaBancaButton(JButton eliminaBancaButton) {
        this.eliminaBancaButton = eliminaBancaButton;
    }

    public JComboBox getUtentiAccettare() {
        return utentiAccettare;
    }

    public void setUtentiAccettare(JComboBox utentiAccettare) {
        this.utentiAccettare = utentiAccettare;
    }

    public JTextArea getInfoRichieste() {
        return infoRichieste;
    }

    public void setInfoRichieste(JTextArea infoRichieste) {
        this.infoRichieste = infoRichieste;
    }

    public ArrayList<String[]> getRichieste() {
        return richieste;
    }

    public JButton getEliminaBancaButton() {
        return eliminaBancaButton;
    }

    public void setRichieste(ArrayList<String[]> richieste) {
        this.richieste = richieste;
    }
}