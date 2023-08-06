/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.text.NumberFormat;

/**
 *
 * @author samkelo
 */
public class HourlyEmployees extends Employees
{
private double HourlyWage;
    public HourlyEmployees(String Name, String IDnumber, EmployT typesE,double HourlyWage)
    {
        super(Name, IDnumber, typesE);
         setHourlyWage( HourlyWage);
    }

   

    public double getHourlyWage()
    {
        return HourlyWage;
    }

    public void setHourlyWage(double HourlyWage)
    {
        this.HourlyWage = HourlyWage;
    }
    
@Override
    public double WeeklyPay(int workedHours){
        double pay = 0;
        int workingtym = 40;
        if (workedHours <= workingtym){
            
            pay = workedHours * HourlyWage;
        }else{
            if (workedHours > workingtym){
                int extraT;
                double normalP,extraP,extraW;
                extraT = workedHours - workingtym;
                extraW = HourlyWage * 1.5;
                extraP = extraT * extraW;
                normalP = workingtym * HourlyWage;
                pay = normalP + extraP;
            }
        }
          
        
        return pay;
    }
 NumberFormat cur = NumberFormat.getCurrencyInstance();
     @Override
    public String toString()
    {
        return "HourlyEmployees{"+ super.toString()+ "HourlyWage = " + cur.format(HourlyWage) + '}';
    }
    
    
    
    
    
    
}
