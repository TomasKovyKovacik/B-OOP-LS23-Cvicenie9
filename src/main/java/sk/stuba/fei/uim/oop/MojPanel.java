package sk.stuba.fei.uim.oop;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class MojPanel extends JPanel {
    @Setter
    private boolean highlight;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(3,3 , this.getWidth() - 6, this.getHeight() - 6);
        if (highlight) {
            g.setColor(Color.RED);
            ((Graphics2D) g).setStroke(new BasicStroke(10));
            g.drawRect(10,10 , this.getWidth() - 20, this.getHeight() - 20);
            highlight = false;
        }
    }
}
