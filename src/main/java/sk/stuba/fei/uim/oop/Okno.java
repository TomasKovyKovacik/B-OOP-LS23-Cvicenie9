package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Okno extends JFrame {
    private JPanel panel;
    public Okno() throws HeadlessException {
        super("Okno");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new MojPanel();
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
