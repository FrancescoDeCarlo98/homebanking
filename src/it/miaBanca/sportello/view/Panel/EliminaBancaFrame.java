package it.miaBanca.sportello.view.Panel;

import it.miaBanca.sportello.TableModel.TableModelBanche;
import it.miaBanca.sportello.TableModel.TableModelFiliale;
import it.miaBanca.sportello.dao.BancaDAO;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.view.ActionListener.EliminaBancaListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EliminaBancaFrame extends JFrame {
    private ArrayList<JCheckBox> elimina;
    public EliminaBancaFrame(){
        super("Elimina Banche");
        this.getContentPane().setLayout(new FlowLayout());

        JScrollPane scroll;
        JTable table=new JTable(new TableModelBanche());
        String[] columns = {"banca principale", "nome filiale", "indirizzo", "orari", "descrizione", "username dir"};
        for(int i=0; i<6; i++){
            table.getColumnModel().getColumn(i).setHeaderValue(columns[i]);
        }
        scroll=new JScrollPane(table);
        this.getContentPane().add(scroll);

        JPanel pnlCombo=new JPanel();
        pnlCombo.setLayout(new BoxLayout(pnlCombo, BoxLayout.PAGE_AXIS));
        elimina=new ArrayList<JCheckBox>();
        for(int i=1; i<=table.getRowCount(); i++){
            elimina.add(new JCheckBox("Elimina riga: "+i));
            elimina.get(i-1).addActionListener(new EliminaBancaListener(i-1, elimina.get(i-1)));
            pnlCombo.add(elimina.get(i-1));
        }
        this.getContentPane().add(pnlCombo);

        this.setSize(700,550);
        this.setVisible(true);
    }

    public ArrayList<JCheckBox> getElimina() {
        return elimina;
    }

}
