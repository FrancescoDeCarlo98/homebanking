package it.miaBanca.sportello.view.Panel;

import it.miaBanca.sportello.TableModel.TableModelFiliale;
import it.miaBanca.sportello.model.BancaModel;

import javax.swing.*;
import java.awt.*;

public class BancaFrame extends JFrame {
    private BancaModel banca;
    private JScrollPane scroll;
    private JTable table;
    public BancaFrame(BancaModel banca) {
        super("Informazioni Banca");
        this.banca=banca;
        this.setLayout(new FlowLayout());
        table=new JTable();
        table.setModel(new TableModelFiliale(banca));
        String[] columns = {
                "banca principale", "nome", "indirizzo", "orari", "descrizione"
        };
        for(int i=0; i<5; i++){
            table.getColumnModel().getColumn(i).setHeaderValue(columns[i]);
        }
        scroll=new JScrollPane(table);
        this.getContentPane().add(scroll);
        this.setVisible(true);
        this.setSize(500, 500);
        }
    }
