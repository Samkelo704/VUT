/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.test;


import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import vut.Students;

/**
 *
 * @author samkelo
 */
public class StudentsTesting
{
    Students objStudent = new Students();
   
    @Test //(expected = IllegalArgumentException.class)
    public void testStudentName(){
        objStudent.setstudentName("Botman","Bulelani");
        assertEquals("Botman,Bulelani",objStudent.getstudentName());
        
        
        
    }
    @Test (expected = IllegalArgumentException.class)
    public void testStudentComa(){
        objStudent.setstudentName("Dakwa","Rutendo");
        assertEquals("DakwaRutendo",objStudent.getstudentName());
    }
    @Test (expected = IllegalArgumentException.class)
    public void testStudentLength(){
        objStudent.setstudentName("Dlamini","NG");
        assertEquals("Dlamini,NG",objStudent.getstudentName());
        
        
    }
    @Test (expected = IllegalArgumentException.class)
    public void testStudentL(){
        objStudent.setstudentName("MA", "Vusumuzi");
        assertEquals(" MA, Vusumuzi",objStudent.getstudentName());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber(){
        objStudent.setstudentNumber("218253737");
        assertEquals("218253737",objStudent.getstudentNumber());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber2(){
        objStudent.setstudentNumber("219132755");
        assertEquals("219132755",objStudent.getstudentNumber());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber3(){
        objStudent.setstudentNumber("217104533");
        assertEquals("217104533",objStudent.getstudentNumber());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber4(){
        objStudent.setstudentNumber("215335279");
        assertEquals("215335279",objStudent.getstudentNumber());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber5(){
        objStudent.setstudentNumber("218w85888");
        assertEquals("218w85888",objStudent.getstudentNumber());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber6(){
        objStudent.setstudentNumber("220285533");
        assertEquals("220285533",objStudent.getstudentNumber());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber7(){
        objStudent.setstudentNumber("2181044533");
        assertEquals("2181044533",objStudent.getstudentNumber());
    }
    @Test (expected = IllegalArgumentException.class)
    public void teststudentNumber8(){
        objStudent.setstudentNumber("21913256");
        assertEquals("21913256",objStudent.getstudentNumber());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    
}
