/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.test;

import org.junit.Test;
import static org.junit.Assert.*;
import vut.CreaditCard;

/**
 *
 * @author 218124031 SS Mnqonywa
 */
public class CreaditTest
{
      CreaditCard objCreaditCard = new CreaditCard();
   
    
      
        
        @Test 
        public void testFullName(){
            objCreaditCard.setFullName("Dawn Khanyisa");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testFullName1(){
          objCreaditCard.setFullName("DawnKhanyisa");
        } 
        @Test (expected = IllegalArgumentException.class)
        public void testFullName2(){
            objCreaditCard.setFullName("Dawn KH");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testFullName3(){
            objCreaditCard.setFullName("DA Khanyisa");
        }
        @Test 
        public void testCellNumber(){
            objCreaditCard.setCellNumber("0666600004");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testCellNumber1(){
            objCreaditCard.setCellNumber("0066660000");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testCellNumber2(){
            objCreaditCard.setCellNumber("06660000");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testCellNumber3(){
            objCreaditCard.setCellNumber("1766600004");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testCellNumber4(){
            objCreaditCard.setCellNumber("07666000045");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testCellNumber5(){
            objCreaditCard.setCellNumber("076k000045");
        }
        @Test
        public void testIdNumber(){
            objCreaditCard.setIdNumber("3930228383284");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testIdNumber1(){
            objCreaditCard.setIdNumber("48739845");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testIdNumber2(){
            objCreaditCard.setIdNumber("839573927493869");
        }
        @Test (expected = IllegalArgumentException.class)
        public void testIdNumber3(){
            objCreaditCard.setIdNumber("8374gjs72923");
        }
        @Test 
        public void testCardPurchase1(){
            objCreaditCard.cardPurchase(150.00);
           assertEquals(10, objCreaditCard.getAccPoint());
           assertEquals(1, objCreaditCard.getNumberOfP());
        }
        @Test
        public void testCardPurchase2(){
            objCreaditCard.cardPurchase(5050.44);
            assertEquals(25,objCreaditCard.getAccPoint());
            assertEquals(1, objCreaditCard.getNumberOfP());
            
        }
        @Test
        public void testCardPurchase3(){
            objCreaditCard.cardPurchase(680.50);
            assertEquals(18,objCreaditCard.getAccPoint());
            assertEquals(1, objCreaditCard.getNumberOfP());
            
        }
        @Test (expected = IllegalArgumentException.class)
        public void testCardPurchase4(){
            
            objCreaditCard.cardPurchase(-2000.44);
            assertEquals(25,objCreaditCard.getAccPoint());
            assertEquals(1, objCreaditCard.getNumberOfP());
            
        
        }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
