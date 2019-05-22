package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class ClientePanel {
    private JPanel clientePanel;
    private JTextField clienteTextField;
    private JButton LogOutButtonCliente;

    public ClientePanel() {
        clientePanel.getUI();
        clientePanel.setVisible(false);
    }

    public JPanel getClientePanel() {
        return clientePanel;
    }

    public void setClientePanel(JPanel clientePanel) { this.clientePanel = clientePanel; }

    public JTextField getClienteTextField() {
        return clienteTextField;
    }

    public void setClienteTextField(JTextField clienteTextField) {
        this.clienteTextField = clienteTextField;
    }

    public JButton getLogOutButtonCliente() {
        return LogOutButtonCliente;
    }

    public void setLogOutButtonCliente(JButton logOutButton) {
        this.LogOutButtonCliente = logOutButton;
    }
}
