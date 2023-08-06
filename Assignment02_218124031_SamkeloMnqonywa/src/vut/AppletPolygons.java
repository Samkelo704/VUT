/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;
import java.awt.*;
import java.applet.Applet;

/**
 *
 * @author samkelo
 */
public class AppletPolygons extends Applet
{
int [] xCorP ={300,500,400,200,100};
int [] yCorP ={10,100,300,300,100};
int [] xCorS ={300,400,100,500,200,300};
int [] yCorS = {10,300,100,100,300,10}; 
int [] xCorPr = {400,600,200,400,100,200};
int []yCorPr = {10,200,200,10,100,200};
/**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
@Override
    public void init()
    {
        setForeground(Color.ORANGE);
       setSize(700,700);
        Font myfont = new Font("Arial",Font.BOLD,12);
        setFont(myfont);
        
    }
    @Override
   public void paint (Graphics g){
       Graphics2D g2d = (Graphics2D) g;
  //     g.setColor(Color.red);
    //   g.fillPolygon(xCorP, yCorP, 5);
    //   g.setColor(Color.GREEN);
    //   g2d.setStroke(new BasicStroke(8));
     //  g.drawPolygon(xCorP, yCorP, 5);
     //  g.drawPolyline(xCorS, yCorS, 6);
      // g.setColor(Color.white);
      // g.drawString("STOP", 270, 150);
       g.setColor(Color.red);
       g2d.setStroke(new BasicStroke(5));
       g.drawPolyline(xCorPr, yCorPr, 6);
       
   }
}
