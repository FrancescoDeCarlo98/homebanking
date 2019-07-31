package it.miaBanca.sportello.view.ActionListener;

import it.miaBanca.sportello.dao.BancaDAO;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.view.Frame;
import it.miaBanca.sportello.view.Panel.BancaFrame;
import it.miaBanca.sportello.view.Panel.HomePagePanel;
import it.miaBanca.sportello.view.Panel.VisualizzaBancaPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListenerTable implements ActionListener {
    public final static String VISUALIZZA_BANCA_BTN= "Visualizza_Banca_Btn";
    private int id;
    private BancaModel banca;
    private HomePagePanel hpp;
    public ListenerTable(HomePagePanel hpp, int id , BancaModel banca) {
        this.hpp=hpp;
        this.id=id;
        this.banca=banca;
    }
    public void actionPerformed (ActionEvent e){
        ArrayList<BancaModel> banche = BancaDAO.getInstance().findAll();
        for(int i=0; i<banche.size(); i++){
            if(id==i){
                new BancaFrame(banca);
            }
        }
    }
}

