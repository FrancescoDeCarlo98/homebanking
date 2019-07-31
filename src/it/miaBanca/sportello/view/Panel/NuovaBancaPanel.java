package it.miaBanca.sportello.view.Panel;

import javax.swing.*;
import java.awt.*;

public class NuovaBancaPanel {

    private JPanel NuovaBancaPanel;
    private JButton registraBancaButton;
    private JTextField nomeNuovaBanca;
    private JTextField nomeDirettoreNuovaBanca;
    private JTextField cognomeDirettoreNuovaBanca;
    private JTextField indirizzoNuovoDirettoreNuovaBanca;
    private JTextField usernameNuovoDirettoreNuovaBanca;
    private JButton backAdminButton;
    private JPasswordField passwordDirettoreField;
    private JButton inserisciFotoButton;


    public NuovaBancaPanel() {
        NuovaBancaPanel.getUI();
        NuovaBancaPanel.setVisible(false);
    }

    public JPanel getNuovaBancaPanel() {
        return NuovaBancaPanel;
    }

    public JButton getRegistraBancaButton() {
        return registraBancaButton;
    }

    public JTextField getNomeNuovaBanca() {
        return nomeNuovaBanca;
    }

    public JButton getInserisciFotoButton() {
        return inserisciFotoButton;
    }

    public JTextField getNomeDirettoreNuovaBanca() {
        return nomeDirettoreNuovaBanca;
    }

    public JTextField getCognomeDirettoreNuovaBanca() {
        return cognomeDirettoreNuovaBanca;
    }

    public JTextField getIndirizzoNuovoDirettoreNuovaBanca() {
        return indirizzoNuovoDirettoreNuovaBanca;
    }

    public JTextField getUsernameNuovoDirettoreNuovaBanca() {
        return usernameNuovoDirettoreNuovaBanca;
    }

    public JPasswordField getPasswordDirettoreField() {
        return passwordDirettoreField;
    }

    public JButton getBackAdminButton() {
        return backAdminButton;
    }

}
