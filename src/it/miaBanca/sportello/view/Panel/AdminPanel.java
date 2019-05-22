package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class AdminPanel {
    private JPanel AdminPanel;
    private JButton creaNuovaBancaButton;
    private JButton accettaRichiestaButton;
    private JButton rifiutaRichiestaButton;
    private JButton LogOutButtonAdmin;
    private JButton registraBancaButton;
    private JButton eliminaDatiBancaButton;
    private JButton eliminaBancaButton;

    public AdminPanel() {
        AdminPanel.getUI();
        AdminPanel.setVisible(false);
    }

    public JPanel getAdminPanel() { return AdminPanel; }

    public JButton getRegistraBancaButton() {
        return registraBancaButton;
    }

    public void setRegistraBancaButton(JButton registraBancaButton) {
        this.registraBancaButton = registraBancaButton;
    }

    public JButton getEliminaDatiBancaButton() {
        return eliminaDatiBancaButton;
    }

    public void setEliminaDatiBancaButton(JButton eliminaDatiBancaButton) { this.eliminaDatiBancaButton = eliminaDatiBancaButton; }

    public void setAdminPanel(JPanel AdminPanel) { this.AdminPanel = AdminPanel; }

    public JButton getCreaNuovaBancaButton() { return creaNuovaBancaButton; }

    public void setCreaNuovaBancaButton(JButton creaNuovaBancaButton) { this.creaNuovaBancaButton = creaNuovaBancaButton; }

    public JButton getAccettaRichiestaButton() { return accettaRichiestaButton; }

    public void setAccettaRichiestaButton(JButton accettaRichiestaButton) { this.accettaRichiestaButton = accettaRichiestaButton; }

    public JButton getRifiutaRichiestaButton() { return rifiutaRichiestaButton; }

    public void setRifiutaRichiestaButton(JButton rifiutaRichiestaButton) { this.rifiutaRichiestaButton = rifiutaRichiestaButton; }

    public JButton getLogOutButtonAdmin() { return LogOutButtonAdmin; }

    public void setLogOutButtonAdmin(JButton logOutButton) { LogOutButtonAdmin = logOutButton; }

    public void setEliminaBancaButton(JButton eliminaBancaButton) { this.eliminaBancaButton = eliminaBancaButton; }


}