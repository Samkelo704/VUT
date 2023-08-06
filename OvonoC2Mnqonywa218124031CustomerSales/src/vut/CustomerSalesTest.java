/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author [SS, Mnqonywa] [218124031
 */
public class CustomerSalesTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CustomerSales objCrs;
        
        objCrs = new CustomerSales("Maria Ndono");
        objCrs.purchase(122.55);
        objCrs.purchase(87.44);
        System.out.println(objCrs.tostring());
        
        objCrs.purchase(55.33);
        objCrs.purchase(78.00);
        objCrs.purchase(27.44);
        System.out.println(objCrs.tostring());
        objCrs.reset();
        
        objCrs.purchase(152.53);
        objCrs.purchase(537.64);
        System.out.println(objCrs.tostring());
    }
    
}
