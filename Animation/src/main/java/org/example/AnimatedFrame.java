package org.example;

import javax.swing.*;
import java.awt.event.*;

public class AnimatedFrame extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;

    private JComponent paper;
    private Timer timer;

    public AnimatedFrame(){
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("DVD Screen Saver");

        //TODO: Intitialize the properties
        paper = new AnimatedComponent();
        this.add(paper);
        timer = new Timer(60, new MovementListener());

        this.addKeyListener(new KeyBoardListener());
        this.setFocusable(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void go(){
        timer.start();
    }

    public class MovementListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            ( (AnimatedComponent) paper).move();
            paper.repaint();
        }
    }

    public class KeyBoardListener implements KeyListener{
        public void keyPressed(KeyEvent e){
            System.out.println("Key was pressed!");
            System.out.println(e.getKeyChar());
            if (e.getKeyChar() == 's'){
                System.out.println("STOP!!");
                ((AnimatedComponent) paper).stop();
            }
            if (e.getKeyChar() == 'r'){
                ((AnimatedComponent) paper).resume();
            }
        }
        public void keyReleased(KeyEvent e){}
        public void keyTyped(KeyEvent e) {}
    }

    public static void main(String[] args) {
        AnimatedFrame frame = new AnimatedFrame();
        frame.go();
    }

}
