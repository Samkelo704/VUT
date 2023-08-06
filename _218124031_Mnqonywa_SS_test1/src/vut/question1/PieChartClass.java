/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question1;

import java.awt.*;
import java.text.NumberFormat;

/**
 *
 * @author 218124031 SS Mnqonywa
 */
public class PieChartClass
{
    NumberFormat curr = NumberFormat.getPercentInstance();
     
    private int xCor;
    private int yCor;
    private final int size = 200;

    public PieChartClass(int xCor, int yCor,int Size)
    {
        this.xCor = xCor;
        this.yCor = yCor;
        Size = 200;
    }

    public int getxCor()
    {
        return xCor;
    }

    public void setxCor(int xCor)
    {
        this.xCor = xCor;
    }

    public int getyCor()
    {
        return yCor;
    }

    public void setyCor(int yCor)
    {
        this.yCor = yCor;
    }

    public void drawPieChart(Graphics g){
        
       final int BLUESIZE = 90;
       final int ORANGESIZE = 130;
       final int GREENSIZE = 110;
       final int REDSIZE = 30;
       
       
       g.setColor(Color.blue);
       g.fillArc(xCor, yCor, size, size, 0, BLUESIZE);
        g.setColor(Color.orange);
       g.fillArc(xCor, yCor, size, size, 90, ORANGESIZE);
        g.setColor(Color.green);
       g.fillArc(xCor, yCor, size, size, 220, GREENSIZE);
        g.setColor(Color.red);
       g.fillArc(xCor, yCor, size, size, 330, REDSIZE);
      
    }
    public void displaytextandLine(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.CYAN);
        g.drawString("END OF PIE CHART CREATED BY Mr SS Mnqonywa", xCor, yCor + 250);
        g2d.setStroke(new BasicStroke(8));
        g.setColor(Color.MAGENTA);
        g.drawLine(xCor, yCor + 260 , xCor + 500, yCor + 260);
       
    }
    public void dPiePercentage(Graphics g ){
       
         double BLUESIZE = 90;
        double ORANGESIZE = 130;
        double GREENSIZE = 110;
       double REDSIZE = 30;
       double AllPieSize;
       double B,O,G,R;
       String BP,OP,GP,RP;
       
       
      AllPieSize = BLUESIZE + ORANGESIZE + GREENSIZE + REDSIZE;
       B = BLUESIZE / AllPieSize ;
       O = ORANGESIZE / AllPieSize;
       G = GREENSIZE / AllPieSize;
       R = REDSIZE  / AllPieSize;
       GP = curr.format(G);
       RP = curr.format(R);
    OP = curr.format(O);
      BP = curr.format(B);
      g.setColor(Color.white);
      g.drawString(BP, xCor + 110, yCor + 70);
      g.drawString(OP, xCor + 40, yCor + 70);
       g.drawString(GP, xCor + 90, yCor + 160);
        g.drawString(RP, xCor + 150, yCor + 120);
      
       
     
       
        
    }
    @Override
    public String toString()
    {
        return "PieChartClass{" + "xCor=" + xCor + ", yCor=" + yCor + ", size=" + size + '}';
    }
    
    
}
