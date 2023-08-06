/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import javax.swing.JOptionPane;

/**
 *
 * @author samkelo
 */
public class YellowDiamond extends Applet
{

    
    int [] xCor = {200,330,200,70};
    int [] yCor = {0,100,200,100};
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init()
    {
        setSize(500,500);
        setForeground(Color.BLACK);
        Font myfont = new Font("Arial",Font.BOLD,12);
               setFont(myfont); 
    }
    @Override
    public void paint ( Graphics g){
    Graphics2D g2d = (Graphics2D)g;
    g.setColor(Color.YELLOW);
    g.fillPolygon(xCor, yCor, 4);
    g.setColor(Color.red);
    g.drawPolygon(xCor, yCor, 4);
    String name = JOptionPane.showInputDialog("What is your name?");
    g.setColor(Color.BLACK);
    g.drawString("Welcome "+ name, 150, 100);
    
}
    
}
