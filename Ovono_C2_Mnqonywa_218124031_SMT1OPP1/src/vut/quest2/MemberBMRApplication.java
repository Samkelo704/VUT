/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.quest2;

import java.util.Scanner;


/**
 *
 * @author [SS Mnqonywa  - 218124031]
 */

public class MemberBMRApplication
{
    private static void displayMemberBMR( MemberBMR objBMR)
    {
        System.out.print("\nMember Created");
        
        
    }
    public static void main(String[] args)
    {
        MemberBMR objBMR;
        
        
        
     final int Male =1;
     final int Female = 0;
     String name;
     boolean gender = false;
     double height, weight;
     int age ;
        
     
     
     Scanner input =new Scanner(System.in);
        System.out.print("Enter The name = ");
        name = input.nextLine();
        System.out.print("Enter the age = ");
        age = input.nextInt();
        System.out.print("Enter the Height = ");
        height = input.nextDouble();
        System.out.print("Enter The weight = " );
        weight = input.nextDouble();
        
        objBMR =  new MemberBMR( name, age , gender);
       displayMemberBMR(objBMR);
        
        System.out.println("\nThe name of The member = " + objBMR.getName() );
        System.out.println("The age = " + objBMR.getAge());
        System.out.println("The BMR of the member  = " + Math.round( objBMR.CalcBMR(weight, height)));
        
        
       for ( int i = 0 ; i < 5; i++){
            objBMR.YeraEnd();
        }
        System.out.print("After 5 years");
        System.out.println("\nThe name of The member = " + objBMR.getName() );
        System.out.println("The age  = " + objBMR.getAge());
        System.out.println("The BMR of the member  = " + Math.round( objBMR.CalcBMR(weight, height)));
        
        System.out.print("\nafter decreasing the wieght");
        System.out.println("\nThe name of The member = " + objBMR.getName() );
        System.out.println("The age  = " + objBMR.getAge());
        System.out.println("The BMR of the member  = " + Math.round( objBMR.CalcBMR(weight-=3.6, height)));
        
     
     
     
     
    }
    
}
