/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author [SS, Mnqonywa] [218124031]
 */
public class SalesApplication
{
private static void displayCustomerSales( CustomerSales objCrs )
{
    System.out.print("Sales Created");
    System.out.print("\nName = " + objCrs.getName());
   
    
}
    public static void main(String[] args)
    {
        
        
       
       CustomerSales objCrs = new CustomerSales();
       String name;
       int NumberPurchase = objCrs.getNumberPurchases();
       double accumulatedSale = objCrs.getAccumulatedSales();
       double PurchaseAmount;
    
       
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your name");
       name =input.nextLine();
       objCrs = new CustomerSales(name , NumberPurchase, accumulatedSale);
        displayCustomerSales(objCrs);
      
        for (int i = 0; i < 3; i++) {
         System.out.print("\nEnter Purchase amount = ");
         PurchaseAmount = input.nextDouble();
         objCrs.purchase(PurchaseAmount);
         
    }
         
         System.out.printf("Accumulated Sales = %3.2f",objCrs.getAccumulatedSales());
         System.out.println("\nNumber Of Purchase = " + objCrs.getNumberPurchases());
         
        
         objCrs.reset();
    }
    
}
