package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class ClientePanel {
    private JPanel clientePanel;
    private JTextField clienteTextField;
    private JButton LogOutButtonCliente;
    private JButton CreaContoCorrenteButton;
    private JComboBox comboBox1;
    private JButton inviaRichiestaContoCorrenteButton;


    public JButton getCreaContoCorrenteButton() {
        return CreaContoCorrenteButton;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public ClientePanel() {
        clientePanel.getUI();
        clientePanel.setVisible(false);
        CreaContoCorrenteButton.setVisible(true);
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
