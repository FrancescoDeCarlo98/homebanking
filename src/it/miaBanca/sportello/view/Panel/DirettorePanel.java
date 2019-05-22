package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class DirettorePanel {
    private JButton creaNuovaFiliareButton;
    private JButton salvaNuovaFiliareButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel RegistrazioneFiliale;
    private JTextField textField4;
    private JButton creaNuovoCassiereButton;
    private JPanel DirettorePanel;

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

    public JPanel getRegistrazioneFiliale() {
        return RegistrazioneFiliale;
    }

    public void setRegistrazioneFiliale(JPanel registrazioneFiliale) {
        RegistrazioneFiliale = registrazioneFiliale;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JButton getCreaNuovoCassiereButton() {
        return creaNuovoCassiereButton;
    }

    public void setCreaNuovoCassiereButton(JButton creaNuovoCassiereButton) {
        this.creaNuovoCassiereButton = creaNuovoCassiereButton;
    }

    public JPanel getDirettorePanel() {
        return DirettorePanel;
    }

    public void setDirettorePanel(JPanel direttorePanel) {
        DirettorePanel = direttorePanel;
    }
}
