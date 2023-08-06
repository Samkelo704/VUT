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
public class BlueTriangle extends Applet
{
int[] xCor = {200,300,100};
int [] yCor = {10,150,150};
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init()
    {
        setSize(500,500);
        
    }

    @Override
    public void paint (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
      
        g.fillPolygon(xCor, yCor, 3);
        g.setColor(Color.red);
        g.drawPolygon(xCor, yCor, 3);
       setSize(600,600);
       
        
        
    }
    
}
