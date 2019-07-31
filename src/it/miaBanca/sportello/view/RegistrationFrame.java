package it.miaBanca.sportello.view;

import it.miaBanca.sportello.dao.PersonaDAO;
import it.miaBanca.sportello.model.PersonaModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationFrame extends JFrame {
    private JTextField nome = new JTextField();
    private JTextField cognome = new JTextField();
    private JTextField indirizzo = new JTextField();
    private JTextField email = new JTextField();
    private JTextField username = new JTextField();
    private JTextField password = new JTextField();

    public RegistrationFrame(){
        super("Registrati!");

        JLabel lblUsername = new JLabel("Username: ");
        JLabel lblPassword = new JLabel("Password: ");
        JLabel lblNome = new JLabel("Nome: ");
        JLabel lblCognome = new JLabel("Cognome: ");
        JLabel lblIndirizzo = new JLabel("Indirizzo: ");
        JLabel lblMail = new JLabel("Mail: ");
        JButton btnReg = new JButton("Registrati");

        this.getContentPane().setLayout(new GridLayout(7,2));

        this.getContentPane().add(lblNome);
        this.getContentPane().add(this.nome);
        this.getContentPane().add(lblCognome);
        this.getContentPane().add(this.cognome);
        this.getContentPane().add(lblIndirizzo);
        this.getContentPane().add(this.indirizzo);
        this.getContentPane().add(lblUsername);
        this.getContentPane().add(this.username);
        this.getContentPane().add(lblMail);
        this.getContentPane().add(this.email);
        this.getContentPane().add(lblPassword);
        this.getContentPane().add(this.password);
        this.getContentPane().add(btnReg);

        this.setSize(400,400);
        this.setVisible(true);

        RegistrationListener rl = new RegistrationListener();
        btnReg.addActionListener(rl);
    }
    class RegistrationListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {

            PersonaModel p= new PersonaModel(nome.getText(), cognome.getText(), indirizzo.getText(), email.getText(), username.getText(), password.getText());
            int prova= PersonaDAO.getInstance().InserisciPersona(p);
            if (prova ==1)
            {
                getContentPane().removeAll();

                getContentPane().add(new JLabel(" REGISTRAZIONE FALLITA: ESISTE GIA' UN UTENTE !") , BorderLayout.CENTER);
                JButton btnLog = new JButton("LOGIN");

                getContentPane().invalidate();
                getContentPane().validate();
                getContentPane().repaint();
            }
            else
            {
                getContentPane().removeAll();

                getContentPane().add(new JLabel("ADESSO PUOI EFFETTUARE IL LOGIN !") , BorderLayout.CENTER);
                JButton btnLog = new JButton("LOGIN");

                getContentPane().invalidate();
                getContentPane().validate();
                getContentPane().repaint();
            }
        }
    }
    public JTextField getNome() { return nome; }

    public JTextField getCognome() { return cognome; }

    public JTextField getIndirizzo() { return indirizzo;}

    public JTextField getEmail() { return email;}

    public JTextField getUsername() { return username;}

    public JTextField getPassword() { return password;}

    public void setNome(JTextField nome) { this.nome = nome; }

    public void setCognome(JTextField cognome) { this.cognome = cognome; }

    public void setIndirizzo(JTextField indirizzo) { this.indirizzo = indirizzo; }

    public void setEmail(JTextField email) { this.email = email; }

    public void setUsername(JTextField username) { this.username = username; }

    public void setPassword(JTextField password) { this.password = password; }



}
