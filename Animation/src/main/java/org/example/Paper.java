package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Paper extends JComponent {
    //overRiding -> I MUST MATCH the parent
    //overLoading -> I get to mess with parameters
    protected void paintComponent(Graphics g){
        g.drawLine(10, 10, 100, 100);
        g.drawLine(100, 100, 190, 10);

        Rectangle rect = new Rectangle(50, 100, 100, 50);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(5));
        g2.draw(rect);

        g2.setColor(Color.GREEN);
        g2.fill(rect);

        Ellipse2D.Double oval = new Ellipse2D.Double(50, 100, 100, 50);
        g2.setColor(Color.BLUE);
        g2.draw(oval);

    }
}
