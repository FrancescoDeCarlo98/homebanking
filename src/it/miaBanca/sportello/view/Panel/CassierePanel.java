package it.miaBanca.sportello.view.Panel;

import javax.swing.*;
import java.awt.*;

public class CassierePanel {
    private JPanel cassierePanel;
    private JButton visualizzaRichiesteButton;
    private JButton logOutCassiereButton;

    public CassierePanel() {
        cassierePanel.getUI();
        cassierePanel.setVisible(false);
    }

    public JPanel getCassierePanel() {
        return cassierePanel;
    }

    public JButton getVisualizzaRichiesteButton() {
        return visualizzaRichiesteButton;
    }

    public JButton getLogOutCassiereButton() {
        return logOutCassiereButton;
    }

}
