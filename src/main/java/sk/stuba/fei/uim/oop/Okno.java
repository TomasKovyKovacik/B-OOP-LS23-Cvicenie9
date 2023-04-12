package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {
    public Okno() throws HeadlessException {
        super("Okno");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.CYAN);
        Logic logic = new Logic();
        this.addKeyListener(logic);
        this.setLayout(new BorderLayout());

        JPanel menu = new JPanel();
        menu.setBackground(Color.GREEN);
        menu.setLayout(new GridLayout(2, 1));

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 10, 50, 20);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(5);
        slider.setSnapToTicks(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(logic);
//        slider.setFocusable(false);

        menu.add(logic.getLabel());
        menu.add(slider);

        this.add(menu, BorderLayout.PAGE_END);

        this.setVisible(true);
    }
}
