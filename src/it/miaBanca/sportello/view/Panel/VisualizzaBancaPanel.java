package it.miaBanca.sportello.view.Panel;

import it.miaBanca.sportello.dao.FilialeDAO;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.model.FilialeModel;
import it.miaBanca.sportello.view.Banca;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class VisualizzaBancaPanel {
    private JTable table=new JTable();
    private JScrollPane visualizzaBancaPanel=new JScrollPane();
    private JLabel nomeBanca = new JLabel();

    public JScrollPane getVisualizzaBancaPanel() {
        return visualizzaBancaPanel;
    }

    public void setVisualizzaBancaPanel(JScrollPane visualizzaBancaPanel) {
        this.visualizzaBancaPanel = visualizzaBancaPanel;
    }

    public VisualizzaBancaPanel() {
        this.visualizzaBancaPanel.getUI();
        this.visualizzaBancaPanel.setVisible(false);
    }

//        this.visualizzaBancaPanel.setVisible(true);
//        this.nomeBanca.setText(banca.getNome());
//        this.nomeBanca.setVisible(true);
//        this.table.setVisible(true);
}