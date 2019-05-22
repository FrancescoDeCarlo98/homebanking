package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class NuovaBancaPanel {

    private JPanel NuovaBancaPanel;
    private JButton registraBancaButton;
    private JButton eliminaDatiBancaButton;
    private JTextField nomeNuovaBanca;
    private JTextField indirizzoNuovaBanca;
    private JTextField nomeDirettoreNuovaBanca;
    private JTextField cognomeDirettoreNuovaBanca;
    private JTextField indirizzoNuovoDirettoreNuovaBanca;
    private JTextField usernameNuovoDirettoreNuovaBanca;
    private JTextField passwordNuovoDirettoreNuovaBanca;
    private JButton backAdminButton;


    public NuovaBancaPanel() {
        NuovaBancaPanel.getUI();
        NuovaBancaPanel.setVisible(false);
    }

    public JPanel getNuovaBancaPanel() { return NuovaBancaPanel; }

    public JButton getRegistraBancaButton() { return registraBancaButton;}

    public JButton getEliminaDatiBancaButton() { return eliminaDatiBancaButton; }

    public JTextField getNomeNuovaBanca() { return nomeNuovaBanca;}

    public JTextField getIndirizzoNuovaBanca() { return indirizzoNuovaBanca; }

    public JTextField getNomeDirettoreNuovaBanca() { return nomeDirettoreNuovaBanca; }

    public JTextField getCognomeDirettoreNuovaBanca() { return cognomeDirettoreNuovaBanca; }

    public JTextField getIndirizzoNuovoDirettoreNuovaBanca() { return indirizzoNuovoDirettoreNuovaBanca; }

    public JTextField getUsernameNuovoDirettoreNuovaBanca() { return usernameNuovoDirettoreNuovaBanca; }

    public JTextField getPasswordNuovoDirettoreNuovaBanca() { return passwordNuovoDirettoreNuovaBanca; }

    public JButton getBackAdminButton() { return backAdminButton;}
}
