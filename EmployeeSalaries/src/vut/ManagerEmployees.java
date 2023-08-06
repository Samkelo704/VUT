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
public class ManagerEmployees extends SalariedEmployees
{
    NumberFormat cur = NumberFormat.getCurrencyInstance();
    
private double WeeklyBonus;
    public ManagerEmployees(String Name, String IDnumber, EmployT typesE, double annualSalary,double WeeklyBonus)
    {
        super(Name, IDnumber, typesE, annualSalary);
        setWeeklyBonus(WeeklyBonus);
    }

    public double getWeeklyBonus()
    {
        return WeeklyBonus;
    }

    public void setWeeklyBonus(double WeeklyBonus)
    {
        this.WeeklyBonus = WeeklyBonus;
    }
@Override
public double WeeklyPay(int workedHours){
    double pay;
    double normalP;
    normalP = super.WeeklyPay(workedHours);
    pay = normalP + WeeklyBonus;
    
    return pay;
}
 
    @Override
    public String toString()
    {
        return "ManagerEmployees{"+super.toString() + "WeeklyBonus=" +  cur.format(WeeklyBonus) + '}';
    }
    
}
