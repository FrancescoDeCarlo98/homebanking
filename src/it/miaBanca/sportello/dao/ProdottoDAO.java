package it.miaBanca.sportello.dao;

import it.miaBanca.sportello.dbInterface.DbConnection;
import it.miaBanca.sportello.interfaces.IprodottoDAO;
import it.miaBanca.sportello.model.CartaPrepagataModel;
import it.miaBanca.sportello.model.ContoCorrenteModel;
import it.miaBanca.sportello.model.ProdottoModel;

import java.util.ArrayList;
import java.util.Iterator;

public class ProdottoDAO implements IprodottoDAO {

    @Override
    public ProdottoModel findById(int id) {
        return null;
    }

    @Override
    public ArrayList<ProdottoModel> findAll() {

        ArrayList<ProdottoModel> prodotti = new ArrayList<ProdottoModel>();
        String sql= "SELECT * FROM prodotto" +
                "JOIN prodotto_has_caratteristica as H"+
                "ON P.idprodotto = H.prodotto_idprodotto"+
                "JOIN caratteristica  as c"+
                "ON caratteristica_idcaratteristica = C.caratteristica;";
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery(sql);

        Iterator<String[]> iterator = result.iterator();

        while(iterator.hasNext()){
            String[] riga = iterator.next();

            //contocorrente id 1
            //cartaprepagata id 2;

            int idProdotto = Integer.parseInt(riga[0]);

            switch (idProdotto){
                case 1:
                    ContoCorrenteModel cc = new ContoCorrenteModel();
                    //cc.setMassimalePrelievo(Float.parseFloat(riga[8]));
                    prodotti.add(cc);
                    break;

                case 2:
                    CartaPrepagataModel cp = new CartaPrepagataModel();
                    //cp.setNumMaxOperazioni(Integer.parseInt(riga[7]));
                    prodotti.add(cp);
                    break;

                default: System.out.println();
            }
        }

        return null;
    }
}