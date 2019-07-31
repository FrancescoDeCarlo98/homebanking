package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class DirettorePanel {
    public JPanel getDirettorePanel() {
        return DirettorePanel;
    }

    private JButton creaNuovaFiliareButton;
    private JButton salvaNuovaFiliareButton;
    private JTextField NomeFilialeField;
    private JTextField OrariFilialeField;
    private JTextField IndirizzoFilialeField;
    private JPanel RegistrazioneFiliale;
    private JTextField Password1Field;
    private JButton creaNuovoCassiereButton;
    private JPanel DirettorePanel;
    private JPasswordField PassCassiereField;
    private JTextField UsernameCassiereField;
    private JTextField EmailCassiereField;
    private JTextField IndirizzoCassiereField;
    private JTextField CognomeCassiereField;
    private JTextField NomeCassiereField;
    private JTextField NewNomeCassiereField;
    private JPanel NewCassierePanel;
    private JTextField NewCognomeCassiereField;
    private JLabel Nome1;
    private JLabel Cognome1;
    private JLabel Indirizzo1;
    private JLabel Email1;
    private JLabel Username1;
    private JLabel Password1;
    private JLabel NomeFiliale;
    private JLabel IndirizzoFiliale;
    private JLabel Orari;
    private JLabel NomeCassiere1;
    private JLabel CognomeCassiere1;
    private JLabel IndirizzoCassiere1;
    private JLabel EmailCassiere1;
    private JLabel UsernameCass1;
    private JLabel PassCassiere1;
    private JTextField Indirizzo1Field;
    private JTextField Email1Field;
    private JTextField Username1Field;
    private JButton AGGIUNGICASSIEREButton;
    private JButton LOGOUTDIRETTORE_btn;

    public DirettorePanel() {
        DirettorePanel.getUI();
        DirettorePanel.setVisible(false);
    }

    public JButton getCreaNuovaFiliareButton() {
        return creaNuovaFiliareButton;
    }

    public void setCreaNuovaFiliareButton(JButton creaNuovaFiliareButton) {
        this.creaNuovaFiliareButton = creaNuovaFiliareButton;
    }

    public JButton getSalvaNuovaFiliareButton() {
        return salvaNuovaFiliareButton;
    }

    public void setSalvaNuovaFiliareButton(JButton salvaNuovaFiliareButton) {
        this.salvaNuovaFiliareButton = salvaNuovaFiliareButton;
    }

    public JTextField getNomeFilialeField() {
        return NomeFilialeField;
    }

    public void setNomeFilialeField(JTextField nomeFilialeField) {
        this.NomeFilialeField = nomeFilialeField;
    }

    public JTextField getOrariFilialeField() {
        return OrariFilialeField;
    }

    public void setOrariFilialeField(JTextField orariFilialeField) {
        this.OrariFilialeField = orariFilialeField;
    }

    public JTextField getIndirizzoFilialeField() {
        return IndirizzoFilialeField;
    }

    public void setIndirizzoFilialeField(JTextField indirizzoFilialeField) {
        this.IndirizzoFilialeField = indirizzoFilialeField;
    }

    public JPanel getRegistrazioneFiliale() {
        return RegistrazioneFiliale;
    }

    public void setRegistrazioneFiliale(JPanel registrazioneFiliale) {
        RegistrazioneFiliale = registrazioneFiliale;
    }

    public JTextField getPassword1Field() {
        return Password1Field;
    }

    public void setPassword1Field(JTextField password1Field) {
        this.Password1Field = password1Field;
    }

    public JButton getCreaNuovoCassiereButton() {
        return creaNuovoCassiereButton;
    }

    public void setCreaNuovoCassiereButton(JButton creaNuovoCassiereButton) {
        this.creaNuovoCassiereButton = creaNuovoCassiereButton;
    }

    public JPasswordField getPassCassiereField() {
        return PassCassiereField;
    }

    public void setPassCassiereField(JPasswordField passCassiereField) {
        PassCassiereField = passCassiereField;
    }

    public JTextField getUsernameCassiereField() {
        return UsernameCassiereField;
    }

    public void setUsernameCassiereField(JTextField usernameCassiereField) {
        UsernameCassiereField = usernameCassiereField;
    }

    public JTextField getEmailCassiereField() {
        return EmailCassiereField;
    }

    public void setEmailCassiereField(JTextField emailCassiereField) {
        EmailCassiereField = emailCassiereField;
    }

    public JTextField getIndirizzoCassiereField() {
        return IndirizzoCassiereField;
    }

    public void setIndirizzoCassiereField(JTextField indirizzoCassiereField) {
        IndirizzoCassiereField = indirizzoCassiereField;
    }

    public JTextField getCognomeCassiereField() {
        return CognomeCassiereField;
    }

    public void setCognomeCassiereField(JTextField cognomeCassiereField) {
        CognomeCassiereField = cognomeCassiereField;
    }

    public JTextField getNomeCassiereField() {
        return NomeCassiereField;
    }

    public void setNomeCassiereField(JTextField nomeCassiereField) {
        NomeCassiereField = nomeCassiereField;
    }

    public JTextField getNewNomeCassiereField() {
        return NewNomeCassiereField;
    }

    public void setNewNomeCassiereField(JTextField newNomeCassiereField) {
        NewNomeCassiereField = newNomeCassiereField;
    }

    public JPanel getNewCassierePanel() {
        return NewCassierePanel;
    }

    public void setNewCassierePanel(JPanel newCassierePanel) {
        NewCassierePanel = newCassierePanel;
    }

    public JTextField getNewCognomeCassiereField() {
        return NewCognomeCassiereField;
    }

    public void setNewCognomeCassiereField(JTextField newCognomeCassiereField) {
        NewCognomeCassiereField = newCognomeCassiereField;
    }

    public JLabel getNome1() {
        return Nome1;
    }

    public void setNome1(JLabel nome1) {
        Nome1 = nome1;
    }

    public JLabel getCognome1() {
        return Cognome1;
    }

    public void setCognome1(JLabel cognome1) {
        Cognome1 = cognome1;
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

    public void setDirettorePanel(JPanel direttorePanel) {
        DirettorePanel = direttorePanel;
    }

    public JLabel getNomeFiliale() {
        return NomeFiliale;
    }

    public void setNomeFiliale(JLabel nomeFiliale) {
        NomeFiliale = nomeFiliale;
    }

    public JLabel getIndirizzoFiliale() {
        return IndirizzoFiliale;
    }

    public void setIndirizzoFiliale(JLabel indirizzoFiliale) {
        IndirizzoFiliale = indirizzoFiliale;
    }

    public JLabel getOrari() {
        return Orari;
    }

    public void setOrari(JLabel orari) {
        Orari = orari;
    }

    public JLabel getNomeCassiere1() {
        return NomeCassiere1;
    }

    public void setNomeCassiere1(JLabel nomeCassiere1) {
        NomeCassiere1 = nomeCassiere1;
    }

    public JLabel getCognomeCassiere1() {
        return CognomeCassiere1;
    }

    public void setCognomeCassiere1(JLabel cognomeCassiere1) {
        CognomeCassiere1 = cognomeCassiere1;
    }

    public JLabel getIndirizzoCassiere1() {
        return IndirizzoCassiere1;
    }

    public void setIndirizzoCassiere1(JLabel indirizzoCassiere1) {
        IndirizzoCassiere1 = indirizzoCassiere1;
    }

    public JLabel getEmailCassiere1() {
        return EmailCassiere1;
    }

    public void setEmailCassiere1(JLabel emailCassiere1) {
        EmailCassiere1 = emailCassiere1;
    }

    public JLabel getUsernameCass1() {
        return UsernameCass1;
    }

    public void setUsernameCass1(JLabel usernameCass1) {
        UsernameCass1 = usernameCass1;
    }

    public JLabel getPassCassiere1() {
        return PassCassiere1;
    }

    public void setPassCassiere1(JLabel passCassiere1) {
        PassCassiere1 = passCassiere1;
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

    public JButton getAGGIUNGICASSIEREButton() {
        return AGGIUNGICASSIEREButton;
    }

    public void setAGGIUNGICASSIEREButton(JButton AGGIUNGICASSIEREButton) {
        this.AGGIUNGICASSIEREButton = AGGIUNGICASSIEREButton;
    }

    public JButton getLOGOUTDIRETTORE_btn() {
        return LOGOUTDIRETTORE_btn;
    }

    public void setLOGOUTDIRETTORE_btn(JButton LOGOUTDIRETTORE_btn) {
        this.LOGOUTDIRETTORE_btn = LOGOUTDIRETTORE_btn;
    }
}
