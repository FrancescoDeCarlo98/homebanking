package it.miaBanca.sportello.view;

import it.miaBanca.sportello.view.ActionListener.AdminComboListener;
import it.miaBanca.sportello.view.ActionListener.Listener;
import it.miaBanca.sportello.view.Panel.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    // TODO: Step 0: sistema il model della classe pannello con costruttore e getter
    // TODO: STEP 1: Definisco un oggetto Pannello ( il nuovo pannello creato)
    RegistrationPanel registrationPanel = new RegistrationPanel();
    HomePagePanel homePagePanel = new HomePagePanel();
    LoginPanel loginPanel = new LoginPanel(); //fatto da mimmo con la gui
    AdminPanel adminPanel = new AdminPanel();
    NuovaBancaPanel nuovaBancaPanel = new NuovaBancaPanel();
    DirettorePanel direttorePanel= new DirettorePanel();
    ClientePanel clientePanel = new ClientePanel();
    /* PANNELLI PRINCIPALI*/
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel centralPanel = new JPanel();

    public Frame() {
        super("frame");
        /* SETTAGGIO DEL FRAME */

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1300,800);
        //this.setPreferredSize(new Dimension(1300, 800));
        this.setVisible(true);



        /*INSERIMENTO PANNELLI NEL CONTENTPANE */
        this.getContentPane().add(northPanel, BorderLayout.NORTH);
        this.getContentPane().add(southPanel, BorderLayout.SOUTH);
        this.getContentPane().add(centralPanel, BorderLayout.CENTER);

        // TODO: STEP 2: Aggiungo Pannello al central/north/south Panel
        //  centralPanel.add(loginPanel.getLoginPanel());
        centralPanel.add(registrationPanel.getRegistrationPanel());
        centralPanel.add(homePagePanel.getHomePanel());
        centralPanel.add(loginPanel.getLoginPanel());
        centralPanel.add(adminPanel.getAdminPanel());
        centralPanel.add(nuovaBancaPanel.getNuovaBancaPanel());
        centralPanel.add(clientePanel.getClientePanel());


        //this.pack();

        //TODO: Step 5: istanziare una classe del listener
        Listener Listener = new Listener(this);
        AdminComboListener combo = new AdminComboListener(this);


        //TODO: Step 6: aggiungere listener al bottone e dire quale comando eseguire
        loginPanel.getButtonSend().addActionListener(Listener);
        loginPanel.getButtonSend().setActionCommand(Listener.LOGIN_SEND_BTN);

        homePagePanel.getSignUpButton().addActionListener(Listener);
        homePagePanel.getSignUpButton().setActionCommand(Listener.REGISTRATION_BTN);

        homePagePanel.getLoginButton().addActionListener(Listener);
        homePagePanel.getLoginButton().setActionCommand(Listener.LOGIN_BTN);

        registrationPanel.getBackButton().addActionListener(Listener);
        registrationPanel.getBackButton().setActionCommand(Listener.BACK_BTN);

        loginPanel.getButtonBack().addActionListener(Listener);
        loginPanel.getButtonBack().setActionCommand(Listener.BACK_BTN);

        nuovaBancaPanel.getBackAdminButton().addActionListener(Listener);
        nuovaBancaPanel.getBackAdminButton().setActionCommand(Listener.NUOVA_BANCA_BACK_BTN);

        registrationPanel.getInvioButton().addActionListener(Listener);
        registrationPanel.getInvioButton().setActionCommand(Listener.REGISTRATION_SEND_BTN);

        adminPanel.getAccettaRichiestaButton().addActionListener(Listener);
        adminPanel.getAccettaRichiestaButton().setActionCommand(Listener.ACCETTA_REGISTRAZIONE_BTN);

        adminPanel.getRifiutaRichiestaButton().addActionListener(Listener);
        adminPanel.getRifiutaRichiestaButton().setActionCommand(Listener.RIFIUTA_REGISTRAZIONE_BTN);

        adminPanel.getLogOutButtonAdmin().addActionListener(Listener);
        adminPanel.getLogOutButtonAdmin().setActionCommand(Listener.LOGOUT_BTN);

        clientePanel.getLogOutButtonCliente().addActionListener(Listener);
        clientePanel.getLogOutButtonCliente().setActionCommand(Listener.LOGOUT_BTN);

        adminPanel.getCreaNuovaBancaButton().addActionListener(Listener);
        adminPanel.getCreaNuovaBancaButton().setActionCommand(Listener.CREA_NUOVA_BANCA_BTN);

        adminPanel.getRegistraBancaButton().addActionListener(Listener);
        adminPanel.getRegistraBancaButton().setActionCommand(Listener.REGISTRA_BANCA_BTN);

        adminPanel.getEliminaDatiBancaButton().addActionListener(Listener);
        adminPanel.getEliminaDatiBancaButton().setActionCommand(Listener.ELIMINA_DATI__FORM_BTN);

        adminPanel.getAccettaRichiestaButton().addActionListener(Listener);
        adminPanel.getAccettaRichiestaButton().setActionCommand(Listener.ACCETTA_RICHIESTA_ADMIN);

        adminPanel.getRifiutaRichiestaButton().addActionListener(Listener);
        adminPanel.getRifiutaRichiestaButton().setActionCommand(Listener.RIFIUTA_RICHIESTA_ADMIN);

        nuovaBancaPanel.getEliminaDatiBancaButton().addActionListener(Listener);
        nuovaBancaPanel.getEliminaDatiBancaButton().setActionCommand(Listener.ELIMINA_DATI__FORM_BTN);

        adminPanel.getUtentiAccettare().addActionListener(combo);

    }

    // TODO: STEP 3: Creare Getter del nuovo Pannello
    // GETTER DEI PANEL
    public JPanel getNorthPanel() { return northPanel; }
    public JPanel getSouthPanel() {
        return southPanel;
    }
    public JPanel getCentralPanel() {
        return centralPanel;
    }

   // public LoginPanel getLoginPanel () {
    //    return loginPanel;
 //   }
    public RegistrationPanel getRegistrationPanel () { return registrationPanel;}
    public HomePagePanel getHomePagePanel () {return homePagePanel;}
    public LoginPanel getLoginPanel() {return loginPanel;}
    public AdminPanel getAdminPanel() {return adminPanel ; }
    public NuovaBancaPanel getNuovaBancaPanel(){return nuovaBancaPanel;}
    public DirettorePanel getDirettorePanel() {return  direttorePanel;}
    public ClientePanel getClientePanel() { return clientePanel; }
}
