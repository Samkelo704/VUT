/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import vut.*;
import vut.Employees.EmployT;

/**
 *
 * @author samkelo
 */
public class DataEntry extends javax.swing.JFrame
{

    
    public static ArrayList<HourlyEmployees> objHourlyE = new ArrayList<>(); 
    public static ArrayList<ManagerEmployees> objManagerE = new ArrayList<>();
   public static ArrayList<SalariedEmployees> objSalariedE = new ArrayList<>();
    /**
     * Creates new form DataEntry
     */
    public DataEntry()
    {
        initComponents();
        buttonGroup();
        Hidding();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbnSalaried = new javax.swing.JRadioButton();
        rbnHourly = new javax.swing.JRadioButton();
        rbnManager = new javax.swing.JRadioButton();
        plSalaried = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAnnualSalary = new javax.swing.JTextField();
        plHourly = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtHourlyW = new javax.swing.JTextField();
        plManager = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtWeeklyBonus = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        plViewE = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDisplayE = new javax.swing.JTextArea();
        btnViewSalaried = new javax.swing.JButton();
        btnViewHourly = new javax.swing.JButton();
        btnViewManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Emplyee ID :");

        jLabel2.setText("Employee Name :");

        txtEmployeeID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEmployeeIDActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Type"));

        rbnSalaried.setText("Salaried Employee");
        rbnSalaried.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbnSalariedActionPerformed(evt);
            }
        });

        rbnHourly.setText("Hourly Employee");
        rbnHourly.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbnHourlyActionPerformed(evt);
            }
        });

        rbnManager.setText("Manager");
        rbnManager.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbnManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbnSalaried)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(rbnHourly)
                .addGap(47, 47, 47)
                .addComponent(rbnManager)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnSalaried)
                    .addComponent(rbnHourly)
                    .addComponent(rbnManager))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        plSalaried.setBorder(javax.swing.BorderFactory.createTitledBorder("Salaried Employee"));

        jLabel3.setText("Annual Salary :");

        javax.swing.GroupLayout plSalariedLayout = new javax.swing.GroupLayout(plSalaried);
        plSalaried.setLayout(plSalariedLayout);
        plSalariedLayout.setHorizontalGroup(
            plSalariedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSalariedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnnualSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        plSalariedLayout.setVerticalGroup(
            plSalariedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSalariedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plSalariedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAnnualSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plHourly.setBorder(javax.swing.BorderFactory.createTitledBorder("Hourly Employee"));

        jLabel4.setText("Hourly Wage :");

        txtHourlyW.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtHourlyWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plHourlyLayout = new javax.swing.GroupLayout(plHourly);
        plHourly.setLayout(plHourlyLayout);
        plHourlyLayout.setHorizontalGroup(
            plHourlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plHourlyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHourlyW, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
        );
        plHourlyLayout.setVerticalGroup(
            plHourlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plHourlyLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(plHourlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHourlyW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        plManager.setBorder(javax.swing.BorderFactory.createTitledBorder("Manager"));

        jLabel5.setText("Weekly Bonus :");

        javax.swing.GroupLayout plManagerLayout = new javax.swing.GroupLayout(plManager);
        plManager.setLayout(plManagerLayout);
        plManagerLayout.setHorizontalGroup(
            plManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plManagerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWeeklyBonus)
                .addContainerGap())
        );
        plManagerLayout.setVerticalGroup(
            plManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plManagerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(plManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtWeeklyBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCreate.setText("Create Employee");
        btnCreate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCreateActionPerformed(evt);
            }
        });

        btnview.setText("View Employees");
        btnview.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnviewActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calculate Salaries");
        btnCalculate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalculateActionPerformed(evt);
            }
        });

        plViewE.setBorder(javax.swing.BorderFactory.createTitledBorder("View Employees"));

        taDisplayE.setColumns(20);
        taDisplayE.setRows(5);
        jScrollPane1.setViewportView(taDisplayE);

        btnViewSalaried.setText("View Salaried Employee");
        btnViewSalaried.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnViewSalariedActionPerformed(evt);
            }
        });

        btnViewHourly.setText("View Hourly Emplyee");
        btnViewHourly.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnViewHourlyActionPerformed(evt);
            }
        });

        btnViewManager.setText("View Manager");
        btnViewManager.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnViewManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plViewELayout = new javax.swing.GroupLayout(plViewE);
        plViewE.setLayout(plViewELayout);
        plViewELayout.setHorizontalGroup(
            plViewELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plViewELayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(plViewELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnViewSalaried, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewHourly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        plViewELayout.setVerticalGroup(
            plViewELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plViewELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(plViewELayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnViewSalaried, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewHourly, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewManager, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plSalaried, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plHourly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                    .addComponent(plViewE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plHourly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plSalaried, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plViewE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtEmployeeIDActionPerformed
    {//GEN-HEADEREND:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void rbnHourlyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbnHourlyActionPerformed
    {//GEN-HEADEREND:event_rbnHourlyActionPerformed
        if (rbnHourly.isSelected()){
            plHourly.setVisible(true);
          plManager.setVisible(false);
          plSalaried.setVisible(false);
        }
    }//GEN-LAST:event_rbnHourlyActionPerformed

    private void txtHourlyWActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtHourlyWActionPerformed
    {//GEN-HEADEREND:event_txtHourlyWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHourlyWActionPerformed

    private void rbnSalariedActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbnSalariedActionPerformed
    {//GEN-HEADEREND:event_rbnSalariedActionPerformed

        if (rbnSalaried.isSelected()){
             plSalaried.setVisible(true);
            plHourly.setVisible(false);
             plManager.setVisible(false);
   
        }
        
    }//GEN-LAST:event_rbnSalariedActionPerformed

    private void rbnManagerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbnManagerActionPerformed
    {//GEN-HEADEREND:event_rbnManagerActionPerformed

        if ( rbnManager.isSelected()){
            plSalaried.setVisible(true);
             plManager.setVisible(true);
            plHourly.setVisible(false);
            
        }
        
    }//GEN-LAST:event_rbnManagerActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCreateActionPerformed
    {//GEN-HEADEREND:event_btnCreateActionPerformed
        HourlyEmployees objhourly;
        ManagerEmployees objmanager;
        SalariedEmployees objsalaried;
        if (!txtEmployeeID.getText().isEmpty()|| !txtEmployeeName.getText().isEmpty()){
      try{
       
            if (rbnHourly.isSelected()){
               objhourly = new HourlyEmployees(txtEmployeeName.getText(),txtEmployeeID.getText(),EmployT.HOURLY,Double.parseDouble(txtHourlyW.getText()));
               objHourlyE.add(objhourly);
               clear();
              }else if (rbnSalaried.isSelected()){
                 objsalaried = new SalariedEmployees(txtEmployeeName.getText(),txtEmployeeID.getText(),EmployT.SALARIED,Double.parseDouble(txtAnnualSalary.getText()));
                 objSalariedE.add(objsalaried);
                  clear();
                    
             }else if (rbnManager.isSelected()){
                 objmanager = new ManagerEmployees(txtEmployeeName.getText(),txtEmployeeID.getText(),EmployT.MANAGER,Double.parseDouble(txtAnnualSalary.getText()),Double.parseDouble(txtWeeklyBonus.getText()));
                   objManagerE.add(objmanager);
                   clear();
                }
                
                
                
                
            
            JOptionPane.showMessageDialog(this, "Saved");
            
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage());
        } catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        
        
        }
        
        
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnviewActionPerformed
    {//GEN-HEADEREND:event_btnviewActionPerformed
plViewE.setVisible(true);
        
        

    }//GEN-LAST:event_btnviewActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCalculateActionPerformed
    {//GEN-HEADEREND:event_btnCalculateActionPerformed

        DataManipulation DataP = new DataManipulation();
        DataP.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnViewSalariedActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnViewSalariedActionPerformed
    {//GEN-HEADEREND:event_btnViewSalariedActionPerformed

        for(int i = 0; i < objSalariedE.size(); i++){
           // taDisplayE.setText(objSalariedE.get(i).toString());
           taDisplayE.setText("Name = "+objSalariedE.get(i).getName()+ "\n");
           taDisplayE.append("Employee ID = " + objSalariedE.get(i).getIDnumber()+"\n");
            taDisplayE.append("Employee Type = " + objSalariedE.get(i).getTypesE()+"\n");
             taDisplayE.append("Annual Salary = " + objSalariedE.get(i).getAnnualSalary()+"\n");
             taDisplayE.append("**********************************************************");
             
        }
        
        
    }//GEN-LAST:event_btnViewSalariedActionPerformed

    private void btnViewHourlyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnViewHourlyActionPerformed
    {//GEN-HEADEREND:event_btnViewHourlyActionPerformed

        for (int i = 0; i< objHourlyE.size();i++){
            taDisplayE.setText("Name = "+objHourlyE.get(i).getName()+ "\n");
           taDisplayE.append("Employee ID = " + objHourlyE.get(i).getIDnumber()+"\n");
            taDisplayE.append("Employee Type = " + objHourlyE.get(i).getTypesE()+"\n");
             taDisplayE.append("Hourly Wage = " + objHourlyE.get(i).getHourlyWage()+"\n");
             taDisplayE.append("**********************************************************");
        }
        
        
    }//GEN-LAST:event_btnViewHourlyActionPerformed

    private void btnViewManagerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnViewManagerActionPerformed
    {//GEN-HEADEREND:event_btnViewManagerActionPerformed
         for (int i = 0; i< objManagerE.size();i++){
               taDisplayE.setText("Name = "+objManagerE.get(i).getName()+ "\n");
           taDisplayE.append("Employee ID = " + objManagerE.get(i).getIDnumber()+"\n");
            taDisplayE.append("Employee Type = " + objManagerE.get(i).getTypesE()+"\n");
             taDisplayE.append("Annual Salary = " + objManagerE.get(i).getAnnualSalary()+"\n");
             taDisplayE.append("Weekly Bonus = " + objManagerE.get(i).getWeeklyBonus()+"\n");
             taDisplayE.append("**********************************************************");
    
         }
        
    }//GEN-LAST:event_btnViewManagerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new DataEntry().setVisible(true);
            }
        });
    }
private void buttonGroup(){
    ButtonGroup BG = new ButtonGroup();
    BG.add(rbnHourly);
    BG.add(rbnManager);
    BG.add(rbnSalaried);   
}
private void Hidding(){
    plHourly.setVisible(false);
    plManager.setVisible(false);
    plSalaried.setVisible(false);
    plViewE.setVisible(false);
}
private void clear(){
  txtAnnualSalary.setText(" ");
  txtEmployeeID.setText(" ");
  txtEmployeeName.setText("");
  txtHourlyW.setText("");
  txtWeeklyBonus.setText("");
    
    
    Hidding();
  
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnViewHourly;
    private javax.swing.JButton btnViewManager;
    private javax.swing.JButton btnViewSalaried;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel plHourly;
    private javax.swing.JPanel plManager;
    private javax.swing.JPanel plSalaried;
    private javax.swing.JPanel plViewE;
    private javax.swing.JRadioButton rbnHourly;
    private javax.swing.JRadioButton rbnManager;
    private javax.swing.JRadioButton rbnSalaried;
    private javax.swing.JTextArea taDisplayE;
    private javax.swing.JTextField txtAnnualSalary;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtHourlyW;
    private javax.swing.JTextField txtWeeklyBonus;
    // End of variables declaration//GEN-END:variables
}
