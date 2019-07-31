package it.miaBanca.sportello.view.ActionListener;

import it.miaBanca.sportello.dao.BancaDAO;
import it.miaBanca.sportello.dao.DirettoreDAO;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.view.Banca;
import it.miaBanca.sportello.view.Panel.EliminaBancaFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EliminaBancaListener implements ActionListener {
    private int index;
    private JCheckBox cb;
    public EliminaBancaListener(int index, JCheckBox cb){
        this.index=index;
        this.cb=cb;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<BancaModel> banche= BancaDAO.getInstance().findAll();
        ArrayList<String[]> array=new ArrayList<String[]>();
        for(int j=0; j<banche.size(); j++)
            for(int i = 0; i< BancaDAO.getInstance().FindGeneralitàBanche(banche, j).size(); i++)
                array.add(BancaDAO.getInstance().FindGeneralitàBanche(banche, j).get(i));
        for(int i=0; i<array.size(); i++)
            if(i==index){
                DirettoreDAO.getInstance().EliminaDirettoreByUsername(array.get(index)[5]);
                BancaDAO.getInstance().EliminaBancaByName(array.get(index)[0]);
                JOptionPane.showMessageDialog(null, "Banca eliminata correttamente");
                cb.setEnabled(false);
            }
    }
}
