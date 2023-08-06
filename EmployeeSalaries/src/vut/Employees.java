/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author samkelo
 */
public class Employees
{
    public enum EmployT{SALARIED,HOURLY,MANAGER};
    protected String Name;
    protected String IDnumber;
    private EmployT typesE;

    public Employees(String Name, String IDnumber, EmployT typesE)
    {
        setName(Name);
        setIDnumber(IDnumber);
         setTypesE(typesE);
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        if (!Name.isEmpty()){
            this.Name = Name;
        }else{
            throw new IllegalArgumentException ("invalid!,The Employee Must Have a Name");
        }
        
    }

    public String getIDnumber()
    {
       
        return IDnumber;
    }

    public void setIDnumber(String IDnumber)
    {
        if (!IDnumber.isEmpty()){
            if (IDnumber.matches("\\d+{13}")){
                if (IDnumber.length() == 13){
                    this.IDnumber = IDnumber;
                }else{
                    throw new IllegalArgumentException ("invalid!,The ID Number Must Be 13 Numbers Long And Not Less");
                }
            }else {
                throw new IllegalArgumentException ("invalid!,The are no Charecters in the ID Number but Numbers Onlys");
            }
        }else{
            throw new IllegalArgumentException ("invalid!,The Employee must Have A Employee ID Number");
        }
        
    }

    public EmployT getTypesE()
    {
        return typesE;
    }

    public void setTypesE(EmployT typesE)
    {
        this.typesE = typesE;
    }

    public double  WeeklyPay(int workedHours){
        
        double pay = 0;
        
        return pay;
    }
    @Override
    public String toString()
    {
        return "Employees{" + "Name=" + Name + ", IDnumber=" + IDnumber + ", typesE=" + typesE + '}';
    }
    
}
