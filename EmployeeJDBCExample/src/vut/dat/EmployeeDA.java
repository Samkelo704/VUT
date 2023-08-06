/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.dat;

import java.sql.*;
import java.util.ArrayList;
import static vut.gui.EnterEmployeeData.EmployeeArray;

/**
 *
 * @author samkelo
 */
public class EmployeeDA
{
    private static EmployeePD objE;
    private static Connection conn;
    private static Statement st ;
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    public static void Connecting() throws DataStorageException{
        
        
      final  String USER = "root";
      final  String Password = "password";
      final  String URL = "jdbc:mysql://localhost/employeesdb";
      final  String Driver = "com.mysql.jdbc.Driver";
        
        try{
            Class.forName(Driver);
            
            conn = DriverManager.getConnection(URL, USER, Password);
           
            
        } catch (ClassNotFoundException ex){
            // for the driver
          throw new DataStorageException("Driver not found"+ ex.getMessage());
            
        } catch( SQLException ex){
            //connection 
            throw new DataStorageException("database Cant connect"+ ex.getMessage());
            
        }
        
        
    }
    
    public static void SaveEmployee(EmployeePD objEmplyPD) throws DuplicateException {
        
        String query = "INSERT INTO tblemployee(Employee_Number, Employee_Name, Salary) values(?,?,?)";
        
        try{
            ps = conn.prepareStatement(query);
            ps.setString(1,objEmplyPD.getEmployeeNumber());
            ps.setString(2, objEmplyPD.getName());
            ps.setDouble(3,objEmplyPD.getSalary());
            ps.executeUpdate();
            
            
        }catch (SQLException e){
            throw new DuplicateException(objEmplyPD.getName() + "not Added" + e.getMessage());
        }
        
    }
    public static ArrayList<EmployeePD>  viewAll(){
        
        String query = "SELECT * FROM tblemployee";
       
        try{
            ps =conn.prepareStatement(query);
            
            rs = ps.executeQuery();
           while (rs.next()){
           
                 
       objE = new EmployeePD(rs.getString("Employee_Number"),rs.getString("Employee_Name"),rs.getDouble("Salary"));
        EmployeeArray.add(objE);
               
               
           }
            
            
        }catch (SQLException e){
        
        }
        
        return EmployeeArray ;
    }
    
    public static void DeleteD(String ID)throws NotFoundException{
        
        
        String query = "DELETE FROM tblemployee WHERE Employee_Number = ?";
        try{
        ps = conn.prepareStatement(query);
        ps.setString(1, ID);
 
        ps.executeUpdate();
       
        
        }catch (SQLException e){
            throw new NotFoundException("not found" + e.getMessage());
        }
        
        
        
    }
    public static void increase(double perc, String ID)throws NotFoundException{
        
    String query ="UPDATE tblemployee SET Salary = Salary + ( Salary * (" + perc / 100 +")) WHERE Employee_Number =" + ID;   
         
         
         
        try{
               ps = conn.prepareStatement(query);
               ps.executeUpdate();
               
            } catch (SQLException e) {
                throw new NotFoundException( "not Added" + e.getMessage());
            }
            
        
    }
    
    public static ArrayList<String> EmployeeNumber()throws NotFoundException{
        String query = "SELECT Employee_Number FROM tblemployee";
       String EmpNumber;
       ArrayList<String> EmployeeN = new ArrayList<>();
        
        try{
            ps = conn.prepareStatement(query);
            
            rs = ps.executeQuery();
            while (rs.next()){
                
      
                
        EmpNumber = rs.getString("Employee_Number");
        
         EmployeeN.add(EmpNumber);
        
          
             
                
            }
        }catch(SQLException e){
             throw new NotFoundException( "not found" + e.getMessage());
        }
        
        return EmployeeN;
    }
    
    public static EmployeePD getEmployeeObj(String employeeN)throws NotFoundException{
        
        String query = "SELECT * FROM tblemployee WHERE Employee_Number =" + employeeN;
        
        
        try{
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
             objE = new EmployeePD(rs.getString("Employee_Number"),rs.getString("Employee_Name"),rs.getDouble("Salary"));
                
                
            }
            
        }catch(SQLException e){
            throw new NotFoundException( "not found" + e.getMessage());
        }
        
        return objE;
    }
    public static double Average()throws DuplicateException{
        
        String query = "Select AVG(Salary) as Salary From tblemployee";
        double salary =0;
        try{
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                
                 salary = rs.getDouble("Salary");
                
            }
        }catch(SQLException e){
            throw new DuplicateException (""+ e.getMessage());
        }
        return salary;
    } 
    
}
