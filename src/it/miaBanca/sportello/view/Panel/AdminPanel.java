package it.miaBanca.sportello.view.Panel;

import it.miaBanca.sportello.business.PersonaBusiness;

import javax.swing.*;
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton LogOutButtonAdmin;
    private JPanel nuovaBancaPanel;
    private JButton registraBancaButton;
    private JButton eliminaDatiBancaButton;
    private JTextField textField4;
    private JTextField textField5;
    private JButton eliminaBancaButton;
    private JTextField textField6;
    private JTextField textField7;
    private ArrayList<String[]> richieste;


    private JComboBox utentiAccettare;


    private JTextArea infoRichieste;

    public AdminPanel() {
        AdminPanel.getUI();
        AdminPanel.setVisible(false);
        nuovaBancaPanel.setVisible(false);
        this.infoRichieste.setEditable(false);

        this.updateRichieste();

       // int id =  Integer.parseInt(this.richieste.get(1)[1]);
    }

    public void updateRichieste(){
        Vector<String> username = new Vector<String>();
        this.richieste = PersonaBusiness.getInstance().Richieste();

       utentiAccettare.removeAllItems();

        Iterator<String[]> i = richieste.iterator();

        while (i.hasNext()) {
            String[] riga = i.next();
            this.utentiAccettare.addItem(riga[1]+" "+riga[2]);
        }
    }

    public JButton getRegistraBancaButton() {
        return registraBancaButton;
    }

    public void setRegistraBancaButton(JButton registraBancaButton) {
        this.registraBancaButton = registraBancaButton;
    }

    public JButton getEliminaDatiBancaButton() {
        return eliminaDatiBancaButton;
    }

    public void setEliminaDatiBancaButton(JButton eliminaDatiBancaButton) {
        this.eliminaDatiBancaButton = eliminaDatiBancaButton;
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

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JButton getLogOutButtonAdmin() {
        return LogOutButtonAdmin;
    }

    public void setLogOutButtonAdmin(JButton logOutButton) {
        LogOutButtonAdmin = logOutButton;
    }

    public JPanel getNuovaBancaPanel() {
        return nuovaBancaPanel;
    }

    public void setNuovaBancaPanel(JPanel nuovaBancaPanel) {
        this.nuovaBancaPanel = nuovaBancaPanel;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public void setTextField5(JTextField textField5) {
        this.textField5 = textField5;
    }

    public void setEliminaBancaButton(JButton eliminaBancaButton) {
        this.eliminaBancaButton = eliminaBancaButton;
    }

    public void setTextField6(JTextField textField6) {
        this.textField6 = textField6;
    }

    public void setTextField7(JTextField textField7) {
        this.textField7 = textField7;
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

    public void setRichieste(ArrayList<String[]> richieste) {
        this.richieste = richieste;
    }

}