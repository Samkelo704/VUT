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
public class Pyramid extends Applet
{
int [] xCor = {300,500,100,300,0,100};
int [] yCor = {10,200,200,10,100,200};
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
        g.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(5));
        g.drawPolyline(xCor, yCor, 6);
        
    }
}
