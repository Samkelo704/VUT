/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author samkelo
 */
public class StopSign extends Applet
{

    int [] xCor = {200,300,400,400,300,200,100,100};
    int [] yCor = {10,10,60,170,220,220,170,60};
   
    
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init()
    {
        setBackground(Color.GREEN);
       setSize(500,500);
         Font myfont = new Font("Arial",Font.BOLD,100);
               setFont(myfont);
    }

    @Override
    public void paint (Graphics g){
    Graphics2D g2d = (Graphics2D)g;
    g.setColor(Color.red);
    g.fillPolygon(xCor, yCor, 8);
    g.setColor(Color.white);
    g2d.setStroke(new BasicStroke(5));
    g.drawPolygon(xCor, yCor, 8);
   
    g.drawString("STOP", 120, 150);
    g.setColor(Color.LIGHT_GRAY);
  g2d.setStroke(new BasicStroke(18));
    g.drawLine(250, 260, 250, 500);
    g.setColor(Color.red);
    g.fillRoundRect(200, 223, 100, 40, 100, 20);
    g.setColor(Color.WHITE);
    g2d.setStroke(new BasicStroke(5));
    g.drawRoundRect(200, 223, 100, 40, 100, 20);
    g.setColor(Color.white);
  Font myfont1 = new Font("Arial",Font.BOLD,20);
  g.setFont(myfont1);
    g.drawString("4-WAY", 220, 250);
    
}
}
 