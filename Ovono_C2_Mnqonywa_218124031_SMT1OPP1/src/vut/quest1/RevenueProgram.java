/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.quest1;

import java.util.Scanner;

/**
 *
 * @author [SS Mnqonywa  - 218124031]
 */
public class RevenueProgram
{
    //all code may be coded in the main method
    public static void main(String[] args)
    {
        //declaration of the variable
        double UnitPrice;
        int Quantity;
        double SalesPrice;
        double Revenue;
        
        // Accept input
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Unit Price");
        UnitPrice= input.nextDouble();
        System.out.print("Enter the Quantity");
        Quantity = input.nextInt();
        
        // Calculating the Sales Price and Revenue
        SalesPrice = UnitPrice * Quantity;
        Revenue = SalesPrice * (5.5 / 100);
        
        // output
        System.out.printf("The Sale Price = %3.2f", SalesPrice );
        System.out.printf("\nThe Revenue = %3.2f", Revenue );
        System.out.println("");
        
        
    }
    
}
