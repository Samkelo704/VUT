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
public class ProductSales
{
    NumberFormat curr;
    private String CustomerName;
    private String ProductName;
    private double Price;
    private int Quantity;
    private boolean MemberShip  ;
    
    //default constructor 
    public ProductSales(){
        this.CustomerName = "Customer Name";
        this.ProductName = "Product Name";
        this.MemberShip = false;
        this.Price = 1000.0;
        this.Quantity = 1;
    }
    
    public ProductSales( String Customernames, String Productnames, double price, int Quantities,boolean memberShips){
     setcustomername(Customernames);
     setProductname_(Productnames);
     setPrice_( price);
     setQuantity_(Quantities);
     setMember_(memberShips);
        
    }
    public String getcustomeName(){
        return CustomerName;
    }
    public String getProduct_Name(){
        return ProductName;
    }
    public double getPrice_(){
        return Price;
    }
    public double getQuantity_(){
        return Quantity;
    }
    public boolean getMember_ship(){
        return MemberShip;
    }
    // name must have 3 up 15 character
    public void setcustomername(String name){
        if (name.length()>= 3 && name.length()<= 15){
        this.CustomerName = name;
        }else {
            throw new IllegalArgumentException("Name too short or too long "+ name + ", name must have 3 up 15 character");
        }
    }
    public void setProductname_(String Pname){
        if (Pname.length()>= 3){
        this.ProductName = Pname;
        }else {
            throw new IllegalArgumentException("The product name is too short ("+Pname +"), it must have more than 3 charater");
        } 
    }
    public void setPrice_(double price){
        if (price > 0.0){
        this.Price = price;
        }else {
            throw new IllegalArgumentException("Invalid price"+ price + ", price must be greater than 0");
        }
    }
    public void setQuantity_(int qty){
        if (qty >= 1){
        this.Quantity = qty;
        } else {
            throw new IllegalArgumentException("Invalid Quantity" + qty + ", the quantity cannot be 0 or negative");
        }
    }
    public void setMember_(boolean membership){
        
        this.MemberShip = membership;
    }
    public double CalcTotalPrice( double Price, int Quantity){
        double TotalPrice;
        
        TotalPrice = Price * Quantity;
        
        return TotalPrice;
        
    }
    
    public double CalcsaveAmt(double TotalPrice, final double Discount){
        
        double SaveAmt;
        SaveAmt = TotalPrice * Discount ;
        
        return SaveAmt;
    }
    
    public double CalcMemberSaveAmt(double TotalPrice, double MemberDiscount, boolean isMember){
        
        double MemberSave ;
        if (isMember == true ){
            MemberSave = TotalPrice * MemberDiscount ;
      
    } else { 
            MemberSave = 0.0;
            
        }
    
    
    return MemberSave;
    }
    
    
    public double CalcTotalPayment( double TotalPrice, double MemberSave, double SaveAmt){
        
        double TotalPay;
        
        TotalPay = TotalPrice - MemberSave - SaveAmt;
        
        return TotalPay;
        
    }
    
    @Override
    public String toString(){
        curr = NumberFormat.getCurrencyInstance();
        return getClass() + "[Customer Name ="+ CustomerName +"\nProduct Name=" + ProductName + "\nPrice = " + curr.format(Price) + "\nQuantity = " + Quantity + "\nMemberShip =" + MemberShip +"]" ;
    }
}
