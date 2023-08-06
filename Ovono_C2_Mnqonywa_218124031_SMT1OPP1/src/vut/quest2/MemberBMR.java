/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.quest2;

/**
 *
 * @author [student initials surname  - number]
 */

public class MemberBMR
{
    private String name;
    private int age;
    private boolean gender;
            
    // Default Constructor
    public MemberBMR()
    {
        this( "None", 0, false );
        
        
    }
    
    // Create an object with a given data
    public MemberBMR ( String name, int age, boolean gender)
    {
        setName(name);
        setAge(age);
        setGender(gender);
        
    }
    // Parameterized Constructor (Accessor Methods)
    
    private void setName(String name)
    {
        this.name= name;
    }
    
    private void setAge( int age)
    {
        this.age = age;
    }
    
    private void setGender( boolean gender)
    {
        this.gender = gender;
    }
    
    // Parameterrized Constructor ( Mutator Methods)
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public boolean getGender()
    {
        return gender;
    }
    
    /* Calculate the BMR
    * @param Weight The weight of the member
    * @param Height The Height of the member
   */
    public double CalcBMR( double Weight , double Height)
    {
        double BMR;
        BMR = 6.75903 + (11.784 * Weight) +(3.7544 * Height) - (5.47544 * age);
        return BMR;
    }
    // Increament age at the end of year
    public void YeraEnd()
    {
        age++;
        
    }
    
    public String tostring()
    {
        return getClass() + "[Name = " + name + "Age = " + age + "Gender = " + gender + "]";
        
    }
}


