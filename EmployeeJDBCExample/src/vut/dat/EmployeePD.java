/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.dat;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author samkelo
 */
public class EmployeePD
{
 
 private String EmployeeNumber;
 private String Name;
 private double Salary;
 
 public EmployeePD(){
     
     this.Name = "name";
     this.EmployeeNumber = "000000";
     this.Salary = 1000;
     
     
 }

    public EmployeePD( String EmployeeNumber,String Name, double Salary)
    {
        setName( Name);
        setEmployeeNumber(EmployeeNumber);
        setSalary(Salary);
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        if (!Name.isEmpty()){
        if (Name.length() >= 5){
        this.Name = Name;
        }else{
            throw new IllegalArgumentException("Name Must be 5 or more characters");
        }
        }else{
            throw new IllegalArgumentException("Employee must have a Name");
        }
    }

    public String getEmployeeNumber()
    {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(String EmployeeNumber)
    {
        if (EmployeeNumber.matches("\\d+{6}")){
            if(EmployeeNumber.length() == 6){
        this.EmployeeNumber = EmployeeNumber;
            }else{
                throw new IllegalArgumentException("Employee Number must 6 numbers long");
            }
        
        }else{
            throw new IllegalArgumentException("Employee Number have numbers only");
        }
    }

    public double getSalary()
    {
        return Salary;
    }

    public void setSalary(double Salary)
    {
        if (Salary >= 1000){
        this.Salary = Salary;
        }else {
            throw new IllegalArgumentException("Salary must be 1000 going up");
        }
    }
    public double IncreaseSalary(double Perc){
        double pay ;
        double Increase;
        
        
        Increase = Salary * (Perc / 100);
        pay = Salary + Increase;
        
        
        
        
        return pay ;
    }
      public void Connectingdb() throws DataStorageException {
       
            EmployeeDA.Connecting();
            
    }
      public void SaveE(EmployeePD objEmp)throws DuplicateException {
          
          EmployeeDA.SaveEmployee(objEmp);
      }
    
    
    
    public ArrayList<EmployeePD> viewAll(){
        
        
        return EmployeeDA.viewAll();
    }
    public void deleteD(String ID) throws NotFoundException{
        EmployeeDA.DeleteD(ID);
        
    }
    public void Incre(double perc, String ID)throws NotFoundException {
        
        EmployeeDA.increase(perc,ID);
    }
    public ArrayList<String> EmployeeNum() throws NotFoundException{
        
        
        return EmployeeDA.EmployeeNumber();
    }
    public EmployeePD getEmployeeInfo(String ID)throws NotFoundException{
        return EmployeeDA.getEmployeeObj(ID);
    }
    public double AvSalary()throws DuplicateException{
        return EmployeeDA.Average();
        
    }
      NumberFormat cr = NumberFormat.getCurrencyInstance();
    @Override
    
    public String toString()
    {
        return String.format(EmployeeNumber  +"                      "+ Name +"                "+cr.format(Salary) + "\n");
    }
  
}
