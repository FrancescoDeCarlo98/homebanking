package it.miaBanca.sportello.TableModel;

import it.miaBanca.sportello.dao.FilialeDAO;
import it.miaBanca.sportello.model.BancaModel;
import it.miaBanca.sportello.model.FilialeModel;
import it.miaBanca.sportello.view.Banca;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TableModelFiliale extends AbstractTableModel {
    private BancaModel banca;
    private ArrayList<FilialeModel> filiali;
    public TableModelFiliale(BancaModel banca){
        this.banca=banca;
        filiali = FilialeDAO.getInstance().findFiliale(banca.getId());
    }
    @Override
    public int getRowCount() {
        return FilialeDAO.getInstance().FindNumberFililiByIdBanca(banca.getId());
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return banca.getNome();
            case 1:
                return filiali.get(rowIndex).getNome();
            case 2:
                return filiali.get(rowIndex).getIndirizzo();
            case 3:
                return filiali.get(rowIndex).getOrari();
            case 4:
                return filiali.get(rowIndex).getDescrizione();
            default: return null;
        }
    }
}
