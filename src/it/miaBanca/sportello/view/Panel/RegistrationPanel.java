package it.miaBanca.sportello.view.Panel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class RegistrationPanel {

    private JPanel registrationPanel;
    private JPanel cntr;
    private JTextField txtNome;
    private JTextField txtCognome;
    private JTextField txtIndirizzo;
    private JPasswordField txtPassword;
    private JButton backButton;
    private JButton invioButton;
    private JTextField txtEmail;
    private JTextField txtUsername;

    /* bla bla bla */

    public RegistrationPanel() {
        registrationPanel.getUI();
        registrationPanel.setVisible(false);
    }

    public JPanel getRegistrationPanel() {
        return registrationPanel;
    }

    public JPanel getCntr() {
        return cntr;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtCognome() {
        return txtCognome;
    }

    public JTextField getTxtIndirizzo() {
        return txtIndirizzo;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getInvioButton() {
        return invioButton;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

}
