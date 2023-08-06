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
public class SalariedEmployees extends Employees
{
protected double annualSalary;
    public SalariedEmployees(String Name, String IDnumber, EmployT typesE,double annualSalary)
    {
        super(Name, IDnumber, typesE);
        setAnnualSalary( annualSalary);
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }
@Override
public double WeeklyPay(int workedHours){
    double pay ;
    
    pay = annualSalary /52;
    
    
    
    return  pay;
}
 NumberFormat cur = NumberFormat.getCurrencyInstance();
    @Override
    public String toString()
    {
        return "SalariedEmployees{"+super.toString() + "annualSalary=" + cur.format(annualSalary) + '}';
    }
    
}
