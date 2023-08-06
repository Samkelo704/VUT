/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * Activity 5B
 * Complete Program 4 - Sales Exercise
 * 
 * @author [SS, Mnqonywa] [218124031]
 */
public class CustomerSales 
{
    private String name;
    private int numberPurchases;
    private double accumulatedSales;
    
    public CustomerSales()
            
    {
        this( "None" , 0 , 0.0 );
        
    }
    public CustomerSales( String name, int numberPurchases, double accumulatedSales )
    {
        setName(name);
        setNumberPurchases(numberPurchases);
        setAccumulatedSales(accumulatedSales);
    }

    /**
     *
     * @param name
     */
    public CustomerSales(String name)
    {
      this .name= name;
      this.numberPurchases= 0;
      
 
    }
    
    public  String getName()
    {
        return name;   
    }
    public int getNumberPurchases()
    {
        return numberPurchases;
    }
    public double getAccumulatedSales()
    {
        return accumulatedSales;
    }
    
    private void setName( String name)
    {
        this.name = name;
    }
    private void setNumberPurchases( int numberPurchases)
    {
        this.numberPurchases = numberPurchases;
    }
    private void setAccumulatedSales ( double accumulatedSales)
    {
        this.accumulatedSales = accumulatedSales;
        
    }
    
    public void  purchase( double CurrentSales)
    {
        accumulatedSales += CurrentSales;
        numberPurchases ++;
        
    }
    public void reset()
    {
        accumulatedSales = 0.0;
        numberPurchases = 0;
        
                
    }
    
      public String tostring ()
    {
        return getClass()+"[Name = " + name + ", Number Of Purchase =" + numberPurchases + ",accumulated Sales =" + accumulatedSales + "]";
        
    }

   
    
}
