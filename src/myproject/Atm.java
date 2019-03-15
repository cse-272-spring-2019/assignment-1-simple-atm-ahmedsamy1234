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
public class Atm     {  
      String   withdraw ;
    String    deposit ;
       Client c;

    public Atm(String withdraw, String deposit, Client c) {
        this.withdraw = withdraw;
        this.deposit = deposit;
        
        this.c = c; 
        
    }

    public String getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public Client getC() {
        return c;
    }

    public void setC(Client c) {
        this.c = c;
    }

   
    public String DoDeposit()

    {
    
        int foo=Integer.parseInt(c.getBalance())+Integer.parseInt(getDeposit());
        return String.valueOf(foo);
        
    
    }
  
        public String Dowithdraw()

    {
    
        int foo=Integer.parseInt(c.getBalance())-Integer.parseInt(getWithdraw());
        return String.valueOf(foo);
        
    
    }


    

    
    
    
    
    
}
