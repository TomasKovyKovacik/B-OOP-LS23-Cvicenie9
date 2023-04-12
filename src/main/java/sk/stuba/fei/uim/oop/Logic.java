package sk.stuba.fei.uim.oop;

import lombok.Getter;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Logic implements KeyListener, ChangeListener {
    @Getter
    private JLabel label;
    public Logic() {
        this.label = new JLabel();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        this.label.setText("NUMBER IN SLIDER: " + ((JSlider) e.getSource()).getValue());
    }
}
