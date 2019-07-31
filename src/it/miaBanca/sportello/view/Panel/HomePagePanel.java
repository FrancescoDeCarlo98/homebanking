package it.miaBanca.sportello.view.Panel;

import it.miaBanca.sportello.dao.BancaDAO;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.view.ActionListener.Listener;
import it.miaBanca.sportello.view.ActionListener.ListenerTable;
import it.miaBanca.sportello.view.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class HomePagePanel {
    private ListenerTable listenerTable;
    private JPanel homePanel;
    private JPanel banchePanel = new JPanel();

    private JTable ProvaUno;
    private JButton InfoBancaButton;
    private JButton CreditsButton;
    private JButton signUpButton=new JButton("Sign up");
    private JButton loginButton=new JButton("Login");
    private Frame f;
    //Costruttore
    public HomePagePanel(Frame f) {
        this.f=f;
        //createUIComponents();
        homePanel.getUI();
        homePanel.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        banchePanel.setLayout(new BoxLayout(banchePanel, BoxLayout.PAGE_AXIS));

        ArrayList<BancaModel> banche = BancaDAO.getInstance().findAll();
//      Listener Listener = new Listener(this);
        for (int i=0; i<banche.size(); i++){
            BancaModel banca = banche.get(i);
            JButton bancaBtn = new JButton();
            bancaBtn.setText(banca.getNome());
            bancaBtn.setVisible(true);
            banchePanel.add(bancaBtn);
            listenerTable=new ListenerTable(this, i, banca);
            bancaBtn.addActionListener(listenerTable);
        }
        getCreditsButton().setVisible(true);
        homePanel.add(banchePanel,BorderLayout.LINE_END);
        homePanel.add(getCreditsButton(),BorderLayout.CENTER);

        JPanel sud=new JPanel(new FlowLayout(FlowLayout.LEFT));
        sud.add(loginButton);
        sud.add(signUpButton);
        homePanel.add(sud, BorderLayout.SOUTH);
    }

    public ListenerTable getListenerTable() {
        return listenerTable;
    }

    //GETTER
    public JPanel getHomePanel() {
        return homePanel;
    }

    public JButton getSignUpButton() {
        return signUpButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getCreditsButton() {
        return CreditsButton;
    }

    public JButton getInfoBancaButton() {
        return InfoBancaButton;
    }

    public Frame getFrame() {
        return f;
    }
    //    private void createUIComponents() {
//         TODO: place custom component creation code here
//        ArrayList<BancaModel> banche = BancaDAO.getInstance().findAll();
//
//        for (int i=0; i<banche.size(); i++){
//             JButton bancaBtn = new JButton(banche.get(i).getNome());
//            bancaBtn.setVisible(true);
//        }

//    }

//    private void $$$setupUI$$$() {
//        createUIComponents();
//
//    }
}

