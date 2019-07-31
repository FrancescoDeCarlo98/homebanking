package it.miaBanca.sportello.TableModel;

import it.miaBanca.sportello.dao.BancaDAO;
import it.miaBanca.sportello.dao.FilialeDAO;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.model.FilialeModel;
import it.miaBanca.sportello.view.Banca;
import it.miaBanca.sportello.view.Panel.EliminaBancaFrame;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TableModelBanche extends AbstractTableModel {
    private ArrayList<BancaModel> banche;
    private int rowCount=0;

    public TableModelBanche(){
        banche=BancaDAO.getInstance().findAll();
        for (int i=0; i<banche.size(); i++){
            rowCount+=FilialeDAO.getInstance().FindNumberFililiByIdBanca(banche.get(i).getId());
        }
    }
    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<String[]> array=new ArrayList<String[]>();
        for(int j=0; j<banche.size(); j++)
            for(int i=0; i<BancaDAO.getInstance().FindGeneralitàBanche(banche, j).size(); i++){
                array.add(BancaDAO.getInstance().FindGeneralitàBanche(banche, j).get(i));
            }
        switch (columnIndex) {
            case 0:
                return array.get(rowIndex)[0];
            case 1:
                return array.get(rowIndex)[1];
            case 2:
                return array.get(rowIndex)[2];
            case 3:
                return array.get(rowIndex)[3];
            case 4:
                return array.get(rowIndex)[4];
            case 5:
                return array.get(rowIndex)[5];
            default:
                return null;
            }
        }
    }
