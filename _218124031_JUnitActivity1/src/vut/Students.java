/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author samkelo
 */
public class Students
{
    public enum Gender{ MALE, FEMALE};
    
    private String StudentNumber;
    private String StudentFullName;
    private Gender gender;
    
    // default constructor
    public Students(){
        this.StudentNumber = "218000000";
        this.StudentFullName = "name, Surname";
       this.gender = Gender.FEMALE;
    }
    // parameterized Constructor
    public Students(String studNumber, String FName,String LName, Gender genders){
        setstudentNumber(studNumber);
        setstudentName(FName, LName);
        setgender ( genders);   
    }
    // Accessor and mutator methods
    public String getstudentNumber(){
        
        return StudentNumber;
        
    }
    public void setstudentNumber(String StudNumber){
        if ( StudentNumber.substring(0, 2).startsWith("218") || StudentNumber.substring(0, 2).startsWith("219")){
            this.StudentNumber = StudNumber;
      
        }else {
            throw new IllegalArgumentException ("Rejected");
        }
                       if (StudentNumber.matches("\\d{9}")){
        this.StudentNumber = StudNumber;
    }else{
        throw new IllegalArgumentException("The Student Number must be Numeric ");
    }
   
        if (StudentNumber.length()<9 || StudentNumber.length()>9){
            throw new IllegalArgumentException("The Student Number must be equal to 9 Characters");
        }
    
                
        
    }
    
    public String getstudentName(){
        
         return StudentFullName;
    }
    public void setstudentName(String Fname, String Lname){
        this.StudentFullName= Fname + "," + Lname;
        if (this.StudentFullName.contains(",")){
            this.StudentFullName = Fname + "," + Lname;
        
        }  
        else {
            throw new IllegalArgumentException("It must have Name and Surname separated by coma" + StudentFullName);
            
        }
                
        

        if (Fname.length()< 3 || Lname.length() < 3){
            throw new IllegalArgumentException("The Name and Surname must have 3 or more charecters  " + StudentFullName);
            
        }    
        else if (Fname.length()>=3 || Lname.length()>= 3){
                
            this.StudentFullName = Fname + "," + Lname;
            
        }

  
   
    }
    public Gender getgender(){
        return gender;
    }
    public void setgender( Gender gender){
        this.gender = gender;
        
    }
    
    @Override
    public String toString(){
        return getClass()+ "[Student Number" + StudentNumber + "Student Name" + StudentFullName + "Gender" + gender + "]";
    }
}
