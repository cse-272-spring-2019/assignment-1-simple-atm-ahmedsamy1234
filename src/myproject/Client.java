/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author WAGDY 7
 */ 

public class Client {  
    
    
     private    String name ;
    private    String balance ="0" ;
    protected   String password ;
  private  int noOfStreet ; 
  private   String nameOFAdress;
  private  String Phone ; 


    public Client(String name, String balance, String password, int noOfStreet, String nameOFAdress, String Phone) {
       this.name = name;
       this.balance = balance;
        this.password = password;
        this.noOfStreet = noOfStreet;
        this.nameOFAdress = nameOFAdress;
        this.Phone = Phone;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public    String getBalance() {
        return balance;
    }
  

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public   String getPassword() {
        return password;
    }

  

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNoOfStreet() {
        return noOfStreet;
    }

    public void setNoOfStreet(int noOfStreet) {
        this.noOfStreet = noOfStreet;
    }

    public String getNameOFAdress() {
        return nameOFAdress;
    }

    public void setNameOFAdress(String nameOFAdress) {
        this.nameOFAdress = nameOFAdress;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Client() {
        
    }

   
    
}
