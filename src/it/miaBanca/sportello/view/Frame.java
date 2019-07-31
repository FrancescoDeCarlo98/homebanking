package it.miaBanca.sportello.view;

import it.miaBanca.sportello.view.ActionListener.AdminComboListener;
import it.miaBanca.sportello.view.ActionListener.Listener;
import it.miaBanca.sportello.view.Panel.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private RegistrationPanel registrationPanel = new RegistrationPanel();
    private HomePagePanel homePagePanel = new HomePagePanel(this);
    private NuovaBancaPanel nuovaBancaPanel = new NuovaBancaPanel();
    private LoginPanel loginPanel = new LoginPanel();
    private AdminPanel adminPanel = new AdminPanel();
    private DirettorePanel direttorePanel= new DirettorePanel();
    private ClientePanel clientePanel = new ClientePanel();
    private CassierePanel cassierePanel = new CassierePanel();
    private VisualizzaBancaPanel visualizzaBancaPanel=new VisualizzaBancaPanel();
    private NewCassierePanel newCassierePanel= new NewCassierePanel();
    private RegistrazioneFilialePanel registrazioneFilialePanel= new RegistrazioneFilialePanel();

    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel centralPanel = new JPanel();

    public Frame() {
        super("frame");
        /* SETTAGGIO DEL FRAME */
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
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
        centralPanel.add(cassierePanel.getCassierePanel());
        centralPanel.add(visualizzaBancaPanel.getVisualizzaBancaPanel());
        centralPanel.add(direttorePanel.getDirettorePanel());
        centralPanel.add(newCassierePanel.getNewCassierePanel());
        centralPanel.add(registrazioneFilialePanel.getRegistrazioneFiliale());

        //this.pack();
        //TODO: Step 5: istanziare una classe del listener
        Listener Listener = new Listener(this);
        AdminComboListener COMBO = new AdminComboListener(this);


        loginPanel.getButtonSend().addActionListener(Listener);
        loginPanel.getButtonSend().setActionCommand(Listener.LOGIN_SEND_BTN);

        homePagePanel.getSignUpButton().addActionListener(Listener);
        homePagePanel.getSignUpButton().setActionCommand(Listener.REGISTRATION_BTN);

        homePagePanel.getCreditsButton().addActionListener(Listener);
        homePagePanel.getCreditsButton().setActionCommand(Listener.CREDITS_BTN);

        homePagePanel.getLoginButton().addActionListener(Listener);
        homePagePanel.getLoginButton().setActionCommand(Listener.LOGIN_BTN);

        homePagePanel.getInfoBancaButton().addActionListener(Listener);
        homePagePanel.getInfoBancaButton().setActionCommand(Listener.VISUALIZZA_BANCA_BTN);

        registrationPanel.getBackButton().addActionListener(Listener);
        registrationPanel.getBackButton().setActionCommand(Listener.BACK_HOME_BTN);

        loginPanel.getButtonBack().addActionListener(Listener);
        loginPanel.getButtonBack().setActionCommand(Listener.BACK_HOME_BTN);

        nuovaBancaPanel.getBackAdminButton().addActionListener(Listener);
        nuovaBancaPanel.getBackAdminButton().setActionCommand(Listener.NUOVA_BANCA_BACK_BTN);

        nuovaBancaPanel.getRegistraBancaButton().addActionListener(Listener);
        nuovaBancaPanel.getRegistraBancaButton().setActionCommand(Listener.REGISTRA_BANCA_BTN);

        registrationPanel.getInvioButton().addActionListener(Listener);
        registrationPanel.getInvioButton().setActionCommand(Listener.REGISTRATION_SEND_BTN);

        adminPanel.getAccettaRichiestaButton().addActionListener(Listener);
        adminPanel.getAccettaRichiestaButton().setActionCommand(Listener.ACCETTA_REGISTRAZIONE_BTN);

        adminPanel.getCreaNuovaBancaButton().addActionListener(Listener);
        adminPanel.getCreaNuovaBancaButton().setActionCommand(Listener.CREA_NUOVA_BANCA_BTN);

        adminPanel.getRifiutaRichiestaButton().addActionListener(Listener);
        adminPanel.getRifiutaRichiestaButton().setActionCommand(Listener.RIFIUTA_REGISTRAZIONE_BTN);

        adminPanel.getLogOutButtonAdmin().addActionListener(Listener);
        adminPanel.getLogOutButtonAdmin().setActionCommand(Listener.LOGOUT_BTN);

        adminPanel.getEliminaBancaButton().addActionListener(Listener);
        adminPanel.getEliminaBancaButton().setActionCommand(Listener.ELIMINA_BANCA_BTN);

        clientePanel.getLogOutButtonCliente().addActionListener(Listener);
        clientePanel.getLogOutButtonCliente().setActionCommand(Listener.LOGOUT_BTN);

        cassierePanel.getLogOutCassiereButton().addActionListener(Listener);
        cassierePanel.getLogOutCassiereButton().setActionCommand(Listener.LOGOUT_BTN);

        cassierePanel.getVisualizzaRichiesteButton().addActionListener(Listener);
        cassierePanel.getVisualizzaRichiesteButton().setActionCommand(Listener.VISUALIZZA_RICHIESTE_BTN);

//       adminPanel.getRegistraBancaButton().addActionListener(Listener);
  //     adminPanel.getRegistraBancaButton().setActionCommand(Listener.REGISTRA_BANCA_BTN);

        clientePanel.getCreaContoCorrenteButton().addActionListener(Listener);
        clientePanel.getCreaContoCorrenteButton().setActionCommand(Listener.CREA_CONTO_CORRENTE_BTN);
        adminPanel.getUtentiAccettare().addActionListener(COMBO);

        nuovaBancaPanel.getInserisciFotoButton().addActionListener(Listener);
        nuovaBancaPanel.getInserisciFotoButton().setActionCommand(Listener.INSERISCI_FOTO);

        direttorePanel.getLOGOUTDIRETTORE_btn().addActionListener(Listener);
        direttorePanel.getLOGOUTDIRETTORE_btn().setActionCommand(Listener.LOGOUT_BTN);

        direttorePanel.getCreaNuovaFiliareButton().addActionListener(Listener);
        direttorePanel.getCreaNuovaFiliareButton().setActionCommand(Listener.APRI_REGISTRAZIONE_FILIALE_PANEL_BTN);

        direttorePanel.getCreaNuovoCassiereButton().addActionListener(Listener);
        direttorePanel.getCreaNuovoCassiereButton().setActionCommand(Listener.APRI_NEW_CASSIERE_PANEL_BTN);

        newCassierePanel.getIndietroNewCassiere_Btn().addActionListener(Listener);
        newCassierePanel.getIndietroNewCassiere_Btn().setActionCommand(Listener.BACK_HOME_DIRETTORE_BTN);

        registrazioneFilialePanel.getBackNuovaFiliale_Btn().addActionListener(Listener);
        registrazioneFilialePanel.getBackNuovaFiliale_Btn().setActionCommand(Listener.BACK_HOME_DIRETTORE_BTN);

        registrazioneFilialePanel.getSalvaNuovaFiliareButton().addActionListener(Listener);
        registrazioneFilialePanel.getSalvaNuovaFiliareButton().setActionCommand(Listener.REGISTRA_NUOVA_FILIALE_BTN);

        newCassierePanel.getAGGIUNGICASSIEREButton().addActionListener(Listener);
        newCassierePanel.getAGGIUNGICASSIEREButton().setActionCommand(Listener.REGISTRA_NUOVO_CASSIERE_BTN);


//
//        direttorePanel.getCreaNuovaFiliareButton().addActionListener(Listener);
//        direttorePanel.getCreaNuovaFiliareButton().setActionCommand(Listener.CREATE_NEW_FILIALE);
//
//        direttorePanel.getCreaNuovoCassiereButton().addActionListener(Listener);
//        direttorePanel.getCreaNuovoCassiereButton().setActionCommand(Listener.CREATE_NEW_CASSIERE);




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
    public NuovaBancaPanel getNuovaBancaPanel() { return nuovaBancaPanel; }
    public DirettorePanel getDirettorePanel() {return  direttorePanel;}
    public ClientePanel getClientePanel() { return clientePanel; }
    public CassierePanel getCassierePanel() {return cassierePanel;}
    public VisualizzaBancaPanel getVisualizzaBancaPanel() {return visualizzaBancaPanel;}
    public NewCassierePanel getNewCassierePanel () {return newCassierePanel;}
    public RegistrazioneFilialePanel getRegistrazioneFilialePanel() {return  registrazioneFilialePanel;}

}
