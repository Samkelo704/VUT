/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import org.junit.Test;
import static org.junit.Assert.*;
import vut.CustomerSales;

/**
 * Test the CustomerSales class
 * 
 * @author Mrs Ribeiro
 */
public class CustomerSalesTest 
{
    @Test
    public void testConstructor1() 
    {
        CustomerSales obj = new CustomerSales();        
        
        assertEquals("none", obj.getName());    //parameter: expected value, actual value
    }
    
    @Test
    public void testConstructor2() 
    {
        CustomerSales obj = new CustomerSales();        
        
        assertEquals(0, obj.getNumberPurchases());    //parameter: expected value, actual value
    }
    
    @Test
    public void testConstructor3() 
    {
        CustomerSales obj = new CustomerSales();        
        
        assertEquals(0.0, obj.getAccumulatedSales(), 0.001);    //parameter: expected value, actual value
    }
    
    
    @Test
    public void testConstructor4() 
    {
        CustomerSales obj = new CustomerSales("Sue");        
        
        assertEquals("none", obj.getName());    //parameter: expected value, actual value
    }
    
    @Test
    public void testConstructor5() 
    {
        CustomerSales obj = new CustomerSales("Ben");
        
        
        assertEquals(0, obj.getNumberPurchases());    //parameter: expected value, actual value
    }
    
    @Test
    public void testConstructor6() 
    {
        CustomerSales obj = new CustomerSales("Carol");        
       
        assertEquals(0.0, obj.getAccumulatedSales(), 0.001);    //parameter: expected value, actual value
    }
    
    @Test
    public void testPurchase1() 
    {
        CustomerSales obj = new CustomerSales("Dan");        
        
        obj.purchase(100);
        assertEquals(100.0, obj.getAccumulatedSales(), 0.001);    //parameter: expected value, actual value
    }
    
    @Test
    public void testPurchase2() 
    {
        CustomerSales obj = new CustomerSales("Nko");        
        
        obj.purchase(100);
        assertEquals(1, obj.getNumberPurchases());    //parameter: expected value, actual value
    }
    
    @Test
    public void testPurchase3() 
    {
        CustomerSales obj = new CustomerSales("Dan");        
        
        obj.purchase(100);
        obj.purchase(50);
        assertEquals(150.0, obj.getAccumulatedSales(), 0.001);    //parameter: expected value, actual value
    }
    
    @Test
    public void testPurchase4() 
    {
        CustomerSales obj = new CustomerSales("Nko");        
        
        obj.purchase(100);
        obj.purchase(50);
        assertEquals(2, obj.getNumberPurchases());    //parameter: expected value, actual value
    }
    
    @Test
    public void testPurchase5() 
    {
        CustomerSales obj = new CustomerSales("Nkuna");        
        
        obj.purchase(100);
        obj.purchase(50);
        obj.purchase(55.50);
        assertEquals(255.5, obj.getAccumulatedSales(), 0.001);    //parameter: expected value, actual value
    }
    
    @Test
    public void testPurchase6() 
    {
        CustomerSales obj = new CustomerSales("Suzan");        
        
        obj.purchase(100);
        obj.purchase(50);
        obj.purchase(55.50);
        assertEquals(3, obj.getNumberPurchases());    //parameter: expected value, actual value
    }
    
    
    @Test
    public void testReset1() 
    {
        CustomerSales obj = new CustomerSales("Gift");        
        
        obj.purchase(100);
        obj.purchase(50);
        obj.purchase(55.50);
        
        obj.reset();
        
        assertEquals(0, obj.getAccumulatedSales(), 0.001);    //parameter: expected value, actual value
    }
    
    @Test
    public void testReset2() 
    {
        CustomerSales obj = new CustomerSales("Lebo");        
        
        obj.purchase(100);
        obj.purchase(50);
        obj.purchase(55.50);
        
        obj.reset();
        
        assertEquals(0, obj.getNumberPurchases());    //parameter: expected value, actual value
    }
    
}
