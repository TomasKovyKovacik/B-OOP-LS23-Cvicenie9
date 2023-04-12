package sk.stuba.fei.uim.oop;

import lombok.Setter;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MojPanel extends JPanel {
    private  BufferedImage pic;
    public MojPanel() {

        try {
            pic = ImageIO.read(MojPanel.class.getResourceAsStream("/FEI.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel picLabel = new JLabel(new ImageIcon(pic));
        this.add(picLabel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawImage(pic, 0 ,0 , this);
    }
}
