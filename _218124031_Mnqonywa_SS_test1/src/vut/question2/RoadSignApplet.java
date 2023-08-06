/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;

/**
 *
 * @author 218124031 SS Mnqonywa
 */
public class RoadSignApplet extends Applet
{

Graphics myg;


    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
        setBackground(Color.green);
        setSize(500,500);
        Font myf = new Font ("Arial",Font.BOLD,35);
        setFont(myf);
        addMouseListener(new myevent());
    }
public void RoadSign(Graphics g){
    Graphics2D g2d = (Graphics2D)g;
            Line2D.Double myl = new Line2D.Double(250,182,250,470);
    int xcor [] = {200,300,360,360,300,200,140,140};
    int ycorr[] = {10,10,60,120,170,170,120,60};
    g.setColor(Color.white);
    g2d.setStroke(new BasicStroke(10));
    g.drawPolygon(xcor, ycorr, 8);
    g.setColor(Color.red);
    g.fillPolygon(xcor, ycorr, 8);
    g2d.setStroke(new BasicStroke(15));
    g.setColor(Color.LIGHT_GRAY);
    g2d.draw(myl);
    
    
    
}
    // TODO overwrite start(), stop() and destroy() methods
@Override
    public void paint (Graphics g){
        
       myg =g.create();
    }
    
    private class myevent implements MouseListener {
        
        @Override
        public void mouseClicked(MouseEvent me){
            if(me.getButton() == MouseEvent.BUTTON1){
                if(me.getClickCount()==1){
                    RoadSign(myg);
                }else{
                    if(me.getClickCount()==2){
                        myg.setColor(Color.white);
                        myg.drawString("STOP", 200, 100);
                    }
                }
            }
            if(me.getButton()== MouseEvent.BUTTON2){
                if(me.getClickCount()==1){
                    RoadSign(myg);
                    myg.setColor(Color.white);
                    myg.drawString("GO",220, 100);
                    
                }
            }
        }
        @Override
        public void mousePressed (MouseEvent me){
            
        }
        @Override
        public void mouseReleased(MouseEvent me){
            
        }
        @Override
        public void mouseEntered(MouseEvent me){
            
        }
        @Override
        public void mouseExited(MouseEvent me){
            
        }
        
        
    }
    
    
    
    
    
    
    
    
    
}
