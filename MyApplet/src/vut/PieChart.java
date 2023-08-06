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
 * @author 218101821_TA MOHLOKOANE  , 218124031_SS MNQONYWA C4, 218044682 KS MOLEFE C5
 */
public class PieChart extends Applet
{
    @Override
    
    public void init(){
         
        setForeground(Color.cyan);
      Font myfont = new Font("Arial",Font.BOLD ,20 );
       setFont(myfont);
        setSize(500,500);
    }
    @Override
    public void paint (Graphics g){
        // pie Chart
        final int blueSize = 90;
        final int yellowSize = 130;
        final int greenSize = 110;
        final int redSize = 30;
       
       g.setColor(Color.blue);
       g.fillArc(10, 80, 200, 200, 0, blueSize);
       g.setColor(Color.YELLOW);
       g.fillArc(10, 80, 200, 200, 90, yellowSize);
       g.setColor(Color.green);
       g.fillArc(10, 80, 200, 200, 220, greenSize);
       g.setColor(Color.red);
       g.fillArc(10, 80, 200, 200, 330, redSize);
       
       g.setColor(Color.CYAN);
       g.drawString("END OF PIE CHART CREATED BY SS MNQONYWA", 10, 300);
       g.setColor(Color.MAGENTA);
       g.drawLine(10, 305, 500, 305);
      
    }
   
}
