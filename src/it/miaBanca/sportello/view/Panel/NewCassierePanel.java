package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class NewCassierePanel {
    private JPanel NewCassierePanel;
    private JLabel Nome1;
    private JTextField NewNomeCassiereField;
    private JLabel Cognome1;
    private JTextField NewCognomeCassiereField;
    private JLabel Indirizzo1;
    private JLabel Email1;
    private JLabel Username1;
    private JLabel Password1;
    private JTextField Indirizzo1Field;
    private JTextField Email1Field;
    private JTextField Username1Field;
    private JButton AGGIUNGICASSIEREButton;
    private JButton IndietroNewCassiere_Btn;
    private JPasswordField passwordField1;

    public NewCassierePanel() {
        NewCassierePanel.getUI();
        NewCassierePanel.setVisible(false);
    }

    public JPanel getNewCassierePanel() {
        return NewCassierePanel;
    }

    public void setNewCassierePanel(JPanel newCassierePanel) {
        NewCassierePanel = newCassierePanel;
    }

    public JLabel getNome1() {
        return Nome1;
    }

    public void setNome1(JLabel nome1) {
        Nome1 = nome1;
    }

    public JTextField getNewNomeCassiereField() {
        return NewNomeCassiereField;
    }

    public void setNewNomeCassiereField(JTextField newNomeCassiereField) {
        NewNomeCassiereField = newNomeCassiereField;
    }

    public JLabel getCognome1() {
        return Cognome1;
    }

    public void setCognome1(JLabel cognome1) {
        Cognome1 = cognome1;
    }

    public JTextField getNewCognomeCassiereField() {
        return NewCognomeCassiereField;
    }

    public void setNewCognomeCassiereField(JTextField newCognomeCassiereField) {
        NewCognomeCassiereField = newCognomeCassiereField;
    }

    public JLabel getIndirizzo1() {
        return Indirizzo1;
    }

    public void setIndirizzo1(JLabel indirizzo1) {
        Indirizzo1 = indirizzo1;
    }

    public JLabel getEmail1() {
        return Email1;
    }

    public void setEmail1(JLabel email1) {
        Email1 = email1;
    }

    public JLabel getUsername1() {
        return Username1;
    }

    public void setUsername1(JLabel username1) {
        Username1 = username1;
    }

    public JLabel getPassword1() {
        return Password1;
    }

    public void setPassword1(JLabel password1) {
        Password1 = password1;
    }

    public JTextField getIndirizzo1Field() {
        return Indirizzo1Field;
    }

    public void setIndirizzo1Field(JTextField indirizzo1Field) {
        Indirizzo1Field = indirizzo1Field;
    }

    public JTextField getEmail1Field() {
        return Email1Field;
    }

    public void setEmail1Field(JTextField email1Field) {
        Email1Field = email1Field;
    }

    public JTextField getUsername1Field() {
        return Username1Field;
    }

    public void setUsername1Field(JTextField username1Field) {
        Username1Field = username1Field;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(JPasswordField passwordField1) {
        this.passwordField1 = passwordField1;
    }

    public JButton getAGGIUNGICASSIEREButton() {
        return AGGIUNGICASSIEREButton;
    }

    public void setAGGIUNGICASSIEREButton(JButton AGGIUNGICASSIEREButton) {
        this.AGGIUNGICASSIEREButton = AGGIUNGICASSIEREButton;
    }

    public JButton getIndietroNewCassiere_Btn() {
        return IndietroNewCassiere_Btn;
    }

    public void setIndietroNewCassiere_Btn(JButton indietroNewCassiere_Btn) {
        IndietroNewCassiere_Btn = indietroNewCassiere_Btn;
    }
}
