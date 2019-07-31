package it.miaBanca.sportello.view.Panel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class LoginPanel {
    private JPanel loginPanel;
    private JTextField TxtUsername;
    private JButton ButtonSend;
    private JButton ButtonBack;
    private JPasswordField passwordField;

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

    public JPasswordField getPwdPassword() {
        return passwordField;
    }

    public JButton getButtonSend() {
        return ButtonSend;
    }

    public JButton getButtonBack() {
        return ButtonBack;
    }

}
