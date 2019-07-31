package it.miaBanca.sportello.view.ActionListener;

import it.miaBanca.sportello.business.LoginBusiness;
import it.miaBanca.sportello.business.RegistrationBusiness;
import it.miaBanca.sportello.dao.*;
import it.miaBanca.sportello.helpers.MailHelper;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.model.FilialeModel;
import it.miaBanca.sportello.model.PersonaModel;
import it.miaBanca.sportello.view.Banca;
import it.miaBanca.sportello.view.Frame;
import it.miaBanca.sportello.view.Panel.EliminaBancaFrame;
import it.miaBanca.sportello.view.Panel.FotoFrameAmministratore;
import it.miaBanca.sportello.view.Panel.NuovaBancaPanel;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener{

    public Listener(Frame frame) { this.frame = frame;}
    private Frame frame; // Copia del Frame che contiene tutti gli indirizzi dei vari panel
    private JTextField txtUsername;
    private JPasswordField pwdPassword;




    //Classi della Business
    private LoginBusiness loginBusiness = new LoginBusiness();
    private RegistrationBusiness registrationBusiness = new RegistrationBusiness();


    public final static String LOGIN_BTN = "Login_Btn";
    public final static String LOGIN_SEND_BTN = "Login_Send_Btn";
    public final static String REGISTRATION_BTN = "Registration_Btn";
    public final static String BACK_HOME_BTN = "Back_Home_Btn";
    public final static String NUOVA_BANCA_BACK_BTN = "Back_Nuova_Banca_Btn";
    public final static String REGISTRATION_SEND_BTN = "Tentativo_registrazione";
    public final static String ACCETTA_REGISTRAZIONE_BTN ="Accetta_Registrazione_Btn";
    public final static String RIFIUTA_REGISTRAZIONE_BTN = "Rifiuta_Registrazione_Btn" ;
    public final static String LOGOUT_BTN= "Logout_Btn";
    public final static String CREA_NUOVA_BANCA_BTN= "Crea_Nuova_Banca_Btn";
    public final static String REGISTRA_BANCA_BTN= "Registra_Nuova_Banca_Btn";
    public final static String VISUALIZZA_RICHIESTE_BTN = "Visualizza_Richieste_Btn";
    public final static  String CREA_CONTO_CORRENTE_BTN= "Crea_CC_Btn";
    public final static String CREDITS_BTN = "Credits_Btn";
    public final static String VISUALIZZA_BANCA_BTN= "Visualizza_Banca_Btn";
    public final static String ELIMINA_BANCA_BTN="Elimina_Banca_Btn";
    public final static String INSERISCI_FOTO="Inserisci_foto";
    public final static String ELIMINA_FILIALE_BTN = "Elimina_Filiale_btn";
    public final static String APRI_NEW_CASSIERE_PANEL_BTN = "Apri_new_cassiere_panel_btn";
    public final static String APRI_REGISTRAZIONE_FILIALE_PANEL_BTN ="Apri_Registrazione_filiale_panel_btn";
    public final static String BACK_HOME_DIRETTORE_BTN ="Back_home_direttore_btn";
    public final static String REGISTRA_NUOVA_FILIALE_BTN ="Registra_nuova_filiale_btn";
    public final static String REGISTRA_NUOVO_CASSIERE_BTN = "Registra_nuovo_cassiere_btn";

    public void actionPerformed(ActionEvent e) {


        String EventSource = e.getActionCommand();

       switch (EventSource) {
           case LOGIN_SEND_BTN:

               switch (this.loginBusiness.login(this.frame.getLoginPanel().getTxtUsername().getText(),this.frame.getLoginPanel().getPwdPassword().getText())) {

                   case 1:
                       JOptionPane.showMessageDialog(null, "Login effettuato \nBentornato " );

                       frame.getClientePanel().getClientePanel().setVisible(true);
                       frame.getAdminPanel().getAdminPanel().setVisible(false);
                       frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                       frame.getHomePagePanel().getHomePanel().setVisible(false);
                       frame.getLoginPanel().getLoginPanel().setVisible(false);
                       frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                       frame.getDirettorePanel().getDirettorePanel().setVisible(false);
                       frame.getCassierePanel().getCassierePanel().setVisible(false);
                       frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
                       frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
                       frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

                       break;

                   case 2:
                       frame.getCassierePanel().getCassierePanel().setVisible(true);
                       frame.getDirettorePanel().getDirettorePanel().setVisible(false);
                       frame.getAdminPanel().getAdminPanel().setVisible(false);
                       frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                       frame.getHomePagePanel().getHomePanel().setVisible(false);
                       frame.getLoginPanel().getLoginPanel().setVisible(false);
                       frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                       frame.getClientePanel().getClientePanel().setVisible(false);
                       frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
                       frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
                       frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);
                       break;
                   case 3:
                       frame.getDirettorePanel().getDirettorePanel().setVisible(true);
                       frame.getAdminPanel().getAdminPanel().setVisible(false);
                       frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                       frame.getHomePagePanel().getHomePanel().setVisible(false);
                       frame.getLoginPanel().getLoginPanel().setVisible(false);
                       frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                       frame.getClientePanel().getClientePanel().setVisible(false);
                       frame.getCassierePanel().getCassierePanel().setVisible(false);
                       frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
                       frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
                       frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

                       break;
                   case 4:
                       frame.getAdminPanel().getAdminPanel().setVisible(true);
                       frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                       frame.getHomePagePanel().getHomePanel().setVisible(false);
                       frame.getLoginPanel().getLoginPanel().setVisible(false);
                       frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                       frame.getClientePanel().getClientePanel().setVisible(false);
                       frame.getDirettorePanel().getDirettorePanel().setVisible(false);
                       frame.getCassierePanel().getCassierePanel().setVisible(false);
                       frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
                       frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
                       frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

                       break;

                   default:
                       JOptionPane.showMessageDialog(null, "Login fallito \nRiprova", "Login", JOptionPane.ERROR_MESSAGE);
                       System.out.println("Login errato");
                       break;
               }
            break;

            case REGISTRATION_SEND_BTN:
            int  ris = this.registrationBusiness.Registration(this.frame.getRegistrationPanel().getTxtNome().getText(), this.frame.getRegistrationPanel().getTxtCognome().getText(),  this.frame.getRegistrationPanel().getTxtIndirizzo().getText(), this.frame.getRegistrationPanel().getTxtUsername().getText(),this.frame.getRegistrationPanel().getTxtPassword().getText(), this.frame.getRegistrationPanel().getTxtEmail().getText());
            System.out.println("ris = "+ris);
            if(ris == 0){
                MailHelper.getInstance().send("guedeca98@gmail.com", "Registrazione", "la tua richiesta di registrazione è in attesa di accettazione da parte dell'admin, ti verrà mandata una nuova mail con l'esito");
                System.out.println("PROVA MAIL: mail inviata");

                JOptionPane.showMessageDialog(null, "La tua richiesta è stata inoltrata all'amministratore. La preghiamo di attendere" );
            }
            else
                System.out.println("utente già esistente!");

                frame.getHomePagePanel().getHomePanel().setVisible(true);       //HomePage
                frame.getLoginPanel().getLoginPanel().setVisible(false);        //Login
                frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);      //Registrazione
                frame.getAdminPanel().getAdminPanel().setVisible(false);        //Admin
                frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);      //nuova banca
                frame.getClientePanel().getClientePanel().setVisible(false);        //Cliente
                frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
                frame.getCassierePanel().getCassierePanel().setVisible(false);
                frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
                frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
                frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

                frame.getRegistrationPanel().getTxtNome().setText("");
                frame.getRegistrationPanel().getTxtCognome().setText("");
                frame.getRegistrationPanel().getTxtIndirizzo().setText("");
                frame.getRegistrationPanel().getTxtEmail().setText("");
                frame.getRegistrationPanel().getTxtUsername().setText("");
                frame.getRegistrationPanel().getTxtPassword().setText("");

             break;

           case CREDITS_BTN:
               JOptionPane.showMessageDialog(null, "Il progetto è stato ideato e creato da Francesco De Carlo e Francesco Renna" );
               break;


             case NUOVA_BANCA_BACK_BTN:
               frame.getAdminPanel().getAdminPanel().setVisible(true);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

               frame.getNuovaBancaPanel().getNomeNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getNomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getCognomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getIndirizzoNuovoDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getUsernameNuovoDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getPasswordDirettoreField().setText("");
                break;

           case REGISTRATION_BTN:
                frame.getLoginPanel().getLoginPanel().setVisible(false);
                frame.getRegistrationPanel().getRegistrationPanel().setVisible(true);
                frame.getHomePagePanel().getHomePanel().setVisible(false);
                frame.getAdminPanel().getAdminPanel().setVisible(false);
                frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                frame.getClientePanel().getClientePanel().setVisible(false);
                frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
                frame.getCassierePanel().getCassierePanel().setVisible(false);
                frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
                frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
                frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);
            break;

           case LOGIN_BTN:
                frame.getLoginPanel().getLoginPanel().setVisible(true);
                frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                frame.getHomePagePanel().getHomePanel().setVisible(false);
                frame.getAdminPanel().getAdminPanel().setVisible(false);
                frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                frame.getClientePanel().getClientePanel().setVisible(false);
                frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
                frame.getCassierePanel().getCassierePanel().setVisible(false);
                frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
                frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
                frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);
            break;

           case BACK_HOME_BTN:
               frame.getHomePagePanel().getHomePanel().setVisible(true);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

               frame.getRegistrationPanel().getTxtNome().setText("");
               frame.getRegistrationPanel().getTxtCognome().setText("");
               frame.getRegistrationPanel().getTxtIndirizzo().setText("");
               frame.getRegistrationPanel().getTxtEmail().setText("");
               frame.getRegistrationPanel().getTxtUsername().setText("");
               frame.getRegistrationPanel().getTxtPassword().setText("");

               break;

           case LOGOUT_BTN:
               frame.getHomePagePanel().getHomePanel().setVisible(true);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

               frame.getLoginPanel().getTxtUsername().setText("");
               frame.getLoginPanel().getPwdPassword().setText("");
           break;

           case CREA_NUOVA_BANCA_BTN:
               frame.setSize(500, 300);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(true);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);
               break;

           case CREA_CONTO_CORRENTE_BTN:
               frame.getClientePanel().getClientePanel().setVisible(true);
               frame.getClientePanel().getCreaContoCorrenteButton().setVisible(true);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);

               break;

           case REGISTRA_BANCA_BTN:
               BancaModel bancaModel=new BancaModel();
               bancaModel.setNome(frame.getNuovaBancaPanel().getNomeNuovaBanca().getText());
               if(BancaDAO.getInstance().FindNomeBanca(bancaModel.getNome())==true || bancaModel.getNome().equals("")) {
                   JOptionPane.showMessageDialog(null, "Nome banca non valido");
                   break;
               }else{
                   PersonaModel personaModel=new PersonaModel();
                   personaModel.setNome(frame.getNuovaBancaPanel().getNomeDirettoreNuovaBanca().getText());
                   personaModel.setCognome(frame.getNuovaBancaPanel().getCognomeDirettoreNuovaBanca().getText());
                   personaModel.setIndirizzo(frame.getNuovaBancaPanel().getIndirizzoNuovoDirettoreNuovaBanca().getText());
                   personaModel.setUsername(frame.getNuovaBancaPanel().getUsernameNuovoDirettoreNuovaBanca().getText());
                   personaModel.setPassword(String.valueOf(frame.getNuovaBancaPanel().getPasswordDirettoreField().getPassword()));
                   if(PersonaDAO.getInstance().FindUsername(personaModel.getUsername())==true) {
                       JOptionPane.showMessageDialog(null, "Username del direttore già presente nel database");
                       break;
                   }else{
                       if(personaModel.getUsername().equals("") || personaModel.getPassword().equals("") ||
                               personaModel.getIndirizzo().equals("") || personaModel.getNome().equals("") ||
                               personaModel.getCognome().equals("")){
                           JOptionPane.showMessageDialog(null, "Inserisci tutti i campi");
                           break;
                       } else {
                           DirettoreDAO.getInstance().InsertDirettoreNuovaBanca(personaModel, bancaModel.getNome());
                           BancaDAO.getInstance().aggiungiBanca(bancaModel);
                           JOptionPane.showMessageDialog(null, "Direttore e banca inseriti correttamente");
                       }
                   }
               }
               frame.getNuovaBancaPanel().getNomeNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getCognomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getIndirizzoNuovoDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getNomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getPasswordDirettoreField().setText("");
               break;
           case ELIMINA_BANCA_BTN:
               new EliminaBancaFrame();
               break;
           case INSERISCI_FOTO:
               new FotoFrameAmministratore();
               break;

           case REGISTRA_NUOVA_FILIALE_BTN:
               FilialeModel filialeModel=new FilialeModel();
               filialeModel.setNome(frame.getRegistrazioneFilialePanel().getNomeFilialeField().getText());
               filialeModel.setIndirizzo(frame.getRegistrazioneFilialePanel().getIndirizzoFilialeField().getText());
               filialeModel.setOrari(frame.getRegistrazioneFilialePanel().getOrariFilialeField().getText());

               if(FilialeDAO.getInstance().FindNomeFiliale(filialeModel.getNome())==true || filialeModel.getNome().equals("")) {
                   JOptionPane.showMessageDialog(null, "Nome filiale non valido");
                   break;
               }else{
                   PersonaModel personaModel=new PersonaModel();
                   personaModel.setNome(frame.getRegistrazioneFilialePanel().getNomeCassiereField().getText());
                   personaModel.setCognome(frame.getRegistrazioneFilialePanel().getCognomeCassiereField().getText());
                   personaModel.setIndirizzo(frame.getRegistrazioneFilialePanel().getIndirizzoCassiereField().getText());
                   personaModel.setUsername(frame.getRegistrazioneFilialePanel().getUsernameCassiereField().getText());
                   personaModel.setPassword(String.valueOf(frame.getRegistrazioneFilialePanel().getPassCassiereField().getPassword()));
                   if(PersonaDAO.getInstance().FindUsername(personaModel.getUsername())==true) {
                       JOptionPane.showMessageDialog(null, "Username del Cassiere già presente nel database");
                       break;
                   }else{
                       if(personaModel.getUsername().equals("") || personaModel.getPassword().equals("") ||
                               personaModel.getIndirizzo().equals("") || personaModel.getNome().equals("") ||
                               personaModel.getCognome().equals("")){
                           JOptionPane.showMessageDialog(null, "Inserisci tutti i campi");
                           break;
                       } else {
                           CassiereDAO.getInstance().InsertCassiere(personaModel, filialeModel.getNome());
                           FilialeDAO.getInstance().aggiungiFiliale(filialeModel);
                           JOptionPane.showMessageDialog(null, "Direttore e banca inseriti correttamente");
                       }
                   }
               }
               frame.getNuovaBancaPanel().getNomeNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getCognomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getIndirizzoNuovoDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getNomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getPasswordDirettoreField().setText("");
               break;

           case APRI_NEW_CASSIERE_PANEL_BTN:
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(true);
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
               break;

           case APRI_REGISTRAZIONE_FILIALE_PANEL_BTN:
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(true);
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);
               break;

           case BACK_HOME_DIRETTORE_BTN:
               frame.getDirettorePanel().getDirettorePanel().setVisible(true);
               frame.getRegistrazioneFilialePanel().getRegistrazioneFiliale().setVisible(false);
               frame.getNewCassierePanel().getNewCassierePanel().setVisible(false);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getCassierePanel().getCassierePanel().setVisible(false);
               frame.getVisualizzaBancaPanel().getVisualizzaBancaPanel().setVisible(false);

           case  REGISTRA_NUOVO_CASSIERE_BTN:
               PersonaModel personaModel=new PersonaModel();
               personaModel.setNome(frame.getNewCassierePanel().getNewNomeCassiereField().getText());
               personaModel.setCognome(frame.getNewCassierePanel().getNewCognomeCassiereField().getText());
               personaModel.setIndirizzo(frame.getNewCassierePanel().getIndirizzo1Field().getText());
               personaModel.setUsername(frame.getNewCassierePanel().getUsername1Field().getText());
               personaModel.setPassword(String.valueOf(frame.getNewCassierePanel().getPasswordField1().getPassword()));
               if(PersonaDAO.getInstance().FindUsername(personaModel.getUsername())==true) {
                   JOptionPane.showMessageDialog(null, "Username del Cassiere già presente nel database");
                   break;
               }else{
                   if(personaModel.getUsername().equals("") || personaModel.getPassword().equals("") ||
                           personaModel.getIndirizzo().equals("") || personaModel.getNome().equals("") ||
                           personaModel.getCognome().equals("")){
                       JOptionPane.showMessageDialog(null, "Inserisci tutti i campi");
                           break;
               } else {
                       CassiereDAO.getInstance().InsertCassiere(personaModel, filialeModel.getNome());
                       JOptionPane.showMessageDialog(null, "Cassiere inserito correttamente");
                   }
               }
       }
        frame.getNuovaBancaPanel().getNomeNuovaBanca().setText("");
        frame.getNuovaBancaPanel().getCognomeDirettoreNuovaBanca().setText("");
        frame.getNuovaBancaPanel().getIndirizzoNuovoDirettoreNuovaBanca().setText("");
        frame.getNuovaBancaPanel().getNomeDirettoreNuovaBanca().setText("");
        frame.getNuovaBancaPanel().getPasswordDirettoreField().setText("");
        break;

               break;


           default:

       }
        }
    }
