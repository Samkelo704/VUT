/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author 218101821_TA MOHLOKOANE  , 218124031_SS MNQONYWA C4, 218044682 KS MOLEFE C5
 */
public class PieChartGraphics2D extends Applet
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init()
    {
        setForeground(Color.cyan);
      Font myfont = new Font("Arial",Font.BOLD ,20 );
       setFont(myfont);
        
        setSize(500,500);
    }

    @Override
   public void paint ( Graphics g){
       // pie Chart in 2D
       final int blueSize = 90;
        final int yellowSize = 130;
        final int greenSize = 110;
        final int redSize = 30;
        
        
       Graphics2D g2d = (Graphics2D) g;
      
       g2d.setColor(Color.blue);
       Arc2D.Double myPieB = new Arc2D.Double(10, 80, 200, 200, 0, blueSize, Arc2D.PIE);
       g2d.fill(myPieB);
       g2d.setColor(Color.YELLOW);
       Arc2D.Double myPieY = new Arc2D.Double(10, 80, 200, 200, 90, yellowSize, Arc2D.PIE);
       g2d.fill(myPieY);
       g2d.setColor(Color.GREEN);
       Arc2D.Double myPieG = new Arc2D.Double(10, 80, 200, 200, 220, greenSize, Arc2D.PIE);
       g2d.fill(myPieG);
       g2d.setColor(Color.red);
       Arc2D.Double myPieR = new Arc2D.Double(10, 80, 200, 200, 330, redSize, Arc2D.PIE);
       g2d.fill(myPieR);
       
       g2d.setColor(Color.CYAN);
       g2d.drawString("END OF PIE CHART CREATED BY SS MNQONYWA", 10, 300);
       Line2D.Double myline = new Line2D.Double(10, 320, 500, 320);
       g2d.setColor(Color.MAGENTA);
       g2d.setStroke(new BasicStroke(15));
       g2d.draw(myline);
       
       
       
   }
}
