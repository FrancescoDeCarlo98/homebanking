package it.miaBanca.sportello.view.Panel;

import it.miaBanca.sportello.dao.FotoDAO;
import it.miaBanca.sportello.dbInterface.DbConnection;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FotoFrameAmministratore extends JFrame implements ActionListener {
    public FotoFrameAmministratore(){
        super("Scegli foto");
        this.setVisible(true);
        this.setSize(500, 500);
        JFileChooser jfc=new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("JPG, PNG, GIF, JPEG", "jpg", "png","gif","jpeg"));
        this.getContentPane().add(jfc);
        jfc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        File file;
        JFileChooser jf=(JFileChooser)e.getSource();
        if(jf.isAcceptAllFileFilterUsed()){
            file=jf.getSelectedFile();
            this.setVisible(false);
            DbConnection.getInstance().addFoto(file);
            JOptionPane.showMessageDialog(null, "Foto inserita correttamente");
        }
    }
}
