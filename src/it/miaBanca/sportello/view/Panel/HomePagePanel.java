package it.miaBanca.sportello.view.Panel;

import javax.swing.*;
import java.awt.*;

public class HomePagePanel {
    private JPanel homePanel;
    private  JButton signUpButton;
    private  JButton loginButton;
    private JTable ProvaUno;
    private JButton banca1Button;

    //Costruttore
    public HomePagePanel() {
        homePanel.getUI();
        homePanel.setVisible(true);
    }


    //GETTER
    public JPanel getHomePanel() {
        return homePanel;
    }

    public JButton getSignUpButton() { return signUpButton; }

    public  JButton getLoginButton() {
        return loginButton;
    }

    public JTable getProvaUno() {
        return ProvaUno;
    }


}

