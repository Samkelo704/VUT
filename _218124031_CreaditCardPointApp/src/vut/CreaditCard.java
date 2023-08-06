/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author 218124031 SS Mnqonywa
 */
public class CreaditCard
{
    private String fullName;
    private String idNumber;
    private String cellNumber;
    public enum Gender { FEMALE,MALE};
    private Gender gender;
    private int numberOfP;
    private int accPoint;
    
    // default constructor
    public CreaditCard(){
        this.fullName = "Name Surname";
        this.idNumber = "0000000000000";
        this.cellNumber ="0000000000";
        this.gender = Gender.FEMALE;
        this.numberOfP = 0;
        this.accPoint = 0;
    }
    // parametizes constructor
    public CreaditCard(String _fullName, String _idNumber , String _cellNumber , Gender _gender,
            int _accPoint ,int _numberOfP ){
        setFullName(_fullName);
        setIdNumber(_idNumber);
        setCellNumber(_cellNumber);
       setGender(_gender);
      setAccPoint(_accPoint);
        setNumberOfP( _numberOfP);
        
    }
    public String getFullName(){
       return fullName;
    }
    public void setFullName( String _fullName){
        
        if (_fullName.contains(" ")){
            int space = _fullName.indexOf(" ");
        if ((_fullName.substring(0, space).length()>= 3)) {
            this.fullName = _fullName;
        }else {
            throw new IllegalArgumentException ("Invalid!, Name Must Be 3 Charactors Long ");   
        }
        if(_fullName.substring(space + 1).length()>= 3 ){
               this.fullName = _fullName; 
        }else{
            throw new IllegalArgumentException ("Invalid!, Surname Must Be 3 Charactor Long");
        }
        } else {
            throw new IllegalArgumentException("Invalid!, Name and Surname Must By Saparated  Space In Between");
        }
    }
    public String getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(String _idNumber){
       if (_idNumber.matches("\\d+{13}")){
         if (_idNumber.length() == 13) {
           idNumber = _idNumber;
       }else {
           throw new IllegalArgumentException("Invalid!, South African ID Have 13 Numbers Not Too Long Or Short");
       }
       }else {
           throw new IllegalArgumentException ("Invalid!, South African ID Is Numeric Only");
       }
    }
    public String getCellNumber(){
        return cellNumber;
    }
    public void setCellNumber(String _cellNumber){
        if (_cellNumber.matches("\\d+{10}")){
        if (_cellNumber.startsWith("0")){
          if (_cellNumber.length() == 10){
              this.cellNumber = _cellNumber;
          }else{
              throw new IllegalArgumentException ("Invalid!, South African Cell Number Must Be 10 Numbers Long");
          }
         
    }else   {
            throw new IllegalArgumentException ("Invalid!, South African Cell Number Start With 0");
        }
        if (_cellNumber.startsWith("00")){
            throw new IllegalArgumentException("Invalid!, South African Cell Number Cannot Start With Double 00");
        } else {
            this.cellNumber = _cellNumber;
        }
        } else {
            throw new IllegalArgumentException ("Invalid! ,South African Cell Number Must Have Number Only ");
        }
        
}
    
    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender _gender){
        this.gender = _gender;
    }
    
    public int getNumberOfP(){
        return numberOfP;
    }
    private void setNumberOfP(int _numberOfP){
        
            this.numberOfP = _numberOfP;
        
    }
    public int getAccPoint(){
        return accPoint;
    }
    private void setAccPoint(int _accPoint){
        this.accPoint = _accPoint;
    }
    // method for Point accumulated by Customers
    public void  cardPurchase(double amountSpent){
        int accP = 0;
        if (amountSpent < 0){
            throw new IllegalArgumentException("Invalid!, Purchase Amount cannot be negative");
        }else{
            if (amountSpent<= 100){
                accP = 5;
                numberOfP++;
                
            } else{ 
                if ((amountSpent> 100) && (amountSpent<500)){
                    accP = 10;
                    numberOfP++;
                } else{
                    if ((amountSpent > 500) && (amountSpent<1800)){
                        accP = 18;
                        numberOfP++;
                    } else{
                        if (amountSpent > 1800){
                            accP = 25;
                            numberOfP++;
                        }
                    }
                }
                
            }
            
            }
        accPoint += accP;
    }
    
    @Override
    public String toString(){
        return getClass() + "[ Full Name = " + fullName + "ID Number = " + idNumber + "Cell Number = " + cellNumber +
                " Gender = " + gender + "Number of Purchase = " + numberOfP + "Accumulated Points = " + accPoint + "]";
    }
}
