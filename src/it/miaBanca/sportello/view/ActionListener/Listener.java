package it.miaBanca.sportello.view.ActionListener;

import it.miaBanca.sportello.business.LoginBusiness;
import it.miaBanca.sportello.business.RegistrationBusiness;
import it.miaBanca.sportello.helpers.MailHelper;
import it.miaBanca.sportello.view.Frame;


import javax.swing.*;
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

    // TODO STEP 4: Creare una variabile stringa da associare al bottone
    public final static String LOGIN_BTN = "Login_Btn";
    public final static String LOGIN_SEND_BTN = "Login_Send_Btn";
    public final static String REGISTRATION_BTN = "Registration_Btn";
    public final static String BACK_BTN = "Back_Btn";
    public final static String REGISTRATION_BACK_BTN = "Back_Registration_Btn";
    public final static String NUOVA_BANCA_BACK_BTN = "Back_Nuova_Banca_Btn";
    public final static String REGISTRATION_SEND_BTN = "Tentativo_registrazione";
    public final static String ACCETTA_REGISTRAZIONE_BTN ="Accetta_Registrazione_Btn";
    public final static String RIFIUTA_REGISTRAZIONE_BTN = "Rifiuta_Registrazione_Btn" ;
    public final static String LOGOUT_BTN= "Logout_Btn";
    public final static String CREA_NUOVA_BANCA_BTN= "Crea_Nuova_Banca_Btn";
    public final static String REGISTRA_BANCA_BTN= "Registra_Nuova_Banca_Btn";
    public final static String ELIMINA_DATI__FORM_BTN= "Elimina_Dati_Form_Btn";



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

                       break;

                   case 2:
                       //cassiere
                       //TODO DECA: CREARE I PANNELLI PER I VARI TIPI DI UTENTI
                       break;
                   case 3:
                       frame.getDirettorePanel().getDirettorePanel().setVisible(true);
                       frame.getAdminPanel().getAdminPanel().setVisible(false);
                       frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                       frame.getHomePagePanel().getHomePanel().setVisible(false);
                       frame.getLoginPanel().getLoginPanel().setVisible(false);
                       frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                       frame.getClientePanel().getClientePanel().setVisible(false);

                       break;
                   case 4:
                       frame.getAdminPanel().getAdminPanel().setVisible(true);
                       frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                       frame.getHomePagePanel().getHomePanel().setVisible(false);
                       frame.getLoginPanel().getLoginPanel().setVisible(false);
                       frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                       frame.getClientePanel().getClientePanel().setVisible(false);
                       frame.getDirettorePanel().getDirettorePanel().setVisible(false);

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

                frame.getRegistrationPanel().getTxtNome().setText("");
                frame.getRegistrationPanel().getTxtCognome().setText("");
                frame.getRegistrationPanel().getTxtIndirizzo().setText("");
                frame.getRegistrationPanel().getTxtEmail().setText("");
                frame.getRegistrationPanel().getTxtUsername().setText("");
                frame.getRegistrationPanel().getTxtPassword().setText("");

             break;

           case REGISTRATION_BACK_BTN :
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getHomePagePanel().getHomePanel().setVisible(true);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
               break;

           case NUOVA_BANCA_BACK_BTN:
               frame.getAdminPanel().getAdminPanel().setVisible(true);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);

               frame.getNuovaBancaPanel().getNomeNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getIndirizzoNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getNomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getCognomeDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getIndirizzoNuovoDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getUsernameNuovoDirettoreNuovaBanca().setText("");
               frame.getNuovaBancaPanel().getPasswordNuovoDirettoreNuovaBanca().setText("");

           case REGISTRATION_BTN:
                frame.getLoginPanel().getLoginPanel().setVisible(false);
                frame.getRegistrationPanel().getRegistrationPanel().setVisible(true);
                frame.getHomePagePanel().getHomePanel().setVisible(false);
                frame.getAdminPanel().getAdminPanel().setVisible(false);
                frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                frame.getClientePanel().getClientePanel().setVisible(false);
                frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
            break;

           case LOGIN_BTN:
                frame.getLoginPanel().getLoginPanel().setVisible(true);
                frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
                frame.getHomePagePanel().getHomePanel().setVisible(false);
                frame.getAdminPanel().getAdminPanel().setVisible(false);
                frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
                frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
            break;

           case BACK_BTN:
               frame.getHomePagePanel().getHomePanel().setVisible(true);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore

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

               frame.getLoginPanel().getTxtUsername().setText("");
               frame.getLoginPanel().getPwdPassword().setText("");
           break;

           case CREA_NUOVA_BANCA_BTN:
               frame.getAdminPanel().getAdminPanel().setVisible(false);
               frame.getNuovaBancaPanel().getNuovaBancaPanel().setVisible(true);
               frame.getHomePagePanel().getHomePanel().setVisible(false);
               frame.getLoginPanel().getLoginPanel().setVisible(false);
               frame.getRegistrationPanel().getRegistrationPanel().setVisible(false);
               frame.getClientePanel().getClientePanel().setVisible(false);
               frame.getDirettorePanel().getDirettorePanel().setVisible(false);    //direttore
               break;

           case REGISTRA_BANCA_BTN:
               //questo mi apre il pane dal quale poi elimino le banche selezionate
               //TODO: fare metodo della registrazione della banca al database
               break;

           case ELIMINA_DATI__FORM_BTN:
               //TODO: voglio eliminare i dati inseriti nel form. Non so se ha senso farlo
               break;


            // TODO: STEP 4.1: Aggiungere il case con il nuovo bottone
           default:

       }
        }
    }
