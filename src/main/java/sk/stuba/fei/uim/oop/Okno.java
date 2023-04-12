package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Okno extends JFrame implements MouseMotionListener {
    private JPanel panel;
    public Okno() throws HeadlessException {
        super("Okno");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));

        panel.add(new MojPanel());
        panel.add(new MojPanel());
        panel.add(new MojPanel());
        panel.add(new MojPanel());

        this.add(panel);
        this.addMouseMotionListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Component current = this.panel.getComponentAt(e.getPoint());
        if (!(current instanceof MojPanel)) {
            return;
        }
        ((MojPanel) current).setHighlight(true);
        this.repaint();
    }
}
