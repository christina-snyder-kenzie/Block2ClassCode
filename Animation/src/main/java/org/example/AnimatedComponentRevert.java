package org.example;

import javax.swing.*;
import java.awt.*;

public class AnimatedComponentRevert extends JComponent {

    private Rectangle bouncer;
    private int dx, dy;
    private Color myColor;
    private int leftOffDx, leftOffDy;

    public AnimatedComponentRevert(){
        bouncer = new Rectangle(100, 200, 40, 80);
        dx = (int) (Math.random() * 20 - 10);
        dy = (int) (Math.random() * 20 - 10);
        myColor = new Color(121, 21, 121);
        leftOffDy = 0;
        leftOffDx = 0;
    }
        //move
    public void move(){
        bouncer.translate(dx, dy);
        if (bouncer.getX() <= 0){
            dx = -dx;
            changeColor();
        }
        if (bouncer.getY() <= 0){
            dy = -dy;
            changeColor();
        }

        double bottom = bouncer.getY() + bouncer.getHeight();
        if (bottom >= AnimatedFrame.HEIGHT - 27){
            dy = -dy;
            changeColor();
        }

        double rightSide = bouncer.getX() + bouncer.getWidth();
        if (rightSide >= AnimatedFrame.WIDTH){
            dx = -dx;
            changeColor();
        }
    }

    public void stop(){
        leftOffDy=dy;
        leftOffDx=dx;
        dx = 0;
        dy = 0;
    }

    public void resume(){
        dx = leftOffDx;
        dy = leftOffDy;
    }

    public void changeColor(){
        //change myColor
        //to a random color
        //Colors are made up of Red, Green, Blue (RGB)
        //are on the range of 0-255
        //0, 0, 0 (knobs are off) (black)
        //255, 0, 0 (red light is on) (red)
        //100, 0, 0 (light red) (maybe pink...?)
        //0, 0, 255 ->  (blue!)

        //we need random rgb values between 0 255
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        myColor = new Color(red, green, blue, 100);
    }


    //draw the bouncer
    //paintComponent method
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        //setTheColor
        g2.setColor(myColor);
        g2.fill(bouncer);
    }
}
