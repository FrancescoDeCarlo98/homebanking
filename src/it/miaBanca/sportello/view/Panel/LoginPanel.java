package it.miaBanca.sportello.view.Panel;

import javax.swing.*;

public class LoginPanel {
    private JPanel loginPanel;
    private JTextField TxtUsername;
    private JTextField PwdPassword;
    private JButton ButtonSend;
    private JButton ButtonBack;

    public LoginPanel() {
        loginPanel.getUI();
        loginPanel.setVisible(false);
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public JTextField getTxtUsername() {
        return TxtUsername;
    }

    public JTextField getPwdPassword() { return PwdPassword; }

    public JButton getButtonSend() {
        return ButtonSend;
    }

    public JButton getButtonBack() {
        return ButtonBack;
    }

}
