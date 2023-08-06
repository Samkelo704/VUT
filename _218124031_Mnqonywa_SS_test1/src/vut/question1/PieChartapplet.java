/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 218124031 SS Mnqonywa
 */
public class PieChartapplet extends Applet
{
    private int xCor,yCor;
    Graphics myg;
    PieChartClass objpie ;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
       setSize(500,500);
       Font myf = new Font("Arial",Font.BOLD,20);
       setFont(myf);
        addMouseListener(new myEvent());
    }

    // TODO overwrite start(), stop() and destroy() methods
    
    public void Info(Graphics g){
        int Size = 200;
        try {
        xCor = Integer.parseInt(JOptionPane.showInputDialog("Enter x Cordinate"));
        yCor = Integer.parseInt(JOptionPane.showInputDialog("enter y Cordinate"));
        objpie = new PieChartClass(xCor,yCor,Size);
        objpie.drawPieChart(g);
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Invalid!,Cordinates are numbers only");
        }
       
    }
    @Override
    public void paint(Graphics g){
        
       Info(g);
      myg = g.create();
        
        
    }
    private class myEvent implements MouseListener{
    
    @Override
    public void mouseClicked(MouseEvent me){
        if (me.getButton()== MouseEvent.BUTTON1){
            if (me.getClickCount()== 1){
                objpie.displaytextandLine(myg);
        }
            }else{
            if (me.getButton()== MouseEvent.BUTTON2){
                if (me.getClickCount()== 1){
                    objpie.dPiePercentage(myg);
              }
                
                
            }
            }
        
    }
    @Override
    public void mousePressed(MouseEvent me){
        
    }
    @Override
    public void mouseReleased(MouseEvent me ){
        
    }
    @Override
    public void mouseEntered(MouseEvent me){
        
    }
    @Override
    public void mouseExited(MouseEvent me){
        
}
    }
}
