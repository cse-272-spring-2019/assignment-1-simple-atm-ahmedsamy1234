/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

/**
 *
 * @author WAGDY 7
 */
public class Jform2 extends JFrame implements ActionListener {

    String[] beforeTransaction = {null, null, null, null, null};
    String[] afterTransaction = {null, null, null, null, null};
    String[] typeTransaction = {null, null, null, null, null}; 
    String[] numbers =  {null,null,null,null,null}; 
    java.util.Date[] h= {null , null ,null ,null ,null};
    Date current= new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
    
    
    
    

    int count = 0;

    private final JLabel balanceLabel;

    private JLabel FirstTransactionBalanceLabel;
    private JLabel SecondTransactionBalanceLabel;
    private JLabel ThirdTransactionBalanceLabel;
    private JLabel FourthransactionBalanceLabel;
    private JLabel FifththransactionBalanceLabel;
    private JLabel FirstAfterTransactionBalanceLabel;
    private JLabel SecondAfterTransactionBalanceLabel;
    private JLabel ThirdAfterTransactionBalanceLabel;
    private JLabel FourthAfterTransactionBalanceLabel;
    private JLabel FifthAfterTransactionBalanceLabel;
    private JLabel FirstTypeTransactionBalanceLabel;
    private JLabel SecondTypeTransactionBalanceLabel;
    private JLabel ThirdTypeTransactionBalanceLabel;
    private JLabel FourthTypeTransactionBalanceLabel;
    private JLabel FifthTypeTransactionBalanceLabel;
    private JLabel his1;
     private JLabel his2;
     
      private JLabel his3;
       private JLabel his4;
        private JLabel his5;
        
    

    private final JButton withdrawButton;
    private final JButton lastTransactionButton;
    private final JButton depositButton;
    private final JTextField BalanceText;

    private final JLabel clientName;
    private final JButton withdraw100;
    private final JButton clientButton;
    private final JButton withdraw500;
    private final JButton withdraw1000;
    private final JButton withdraw2000;
    private final JButton withdraw3000;
    private final JButton withdraw4000;
    private final JButton withdraw5000;
    private final JButton withdraw10000;
    private Client c;
    private Atm atm;

    public Jform2(Atm atm1) {

        setLayout(null);
        setSize(1300, 331);
        FirstTransactionBalanceLabel = new JLabel();
        SecondTransactionBalanceLabel = new JLabel();
        ThirdTransactionBalanceLabel = new JLabel();
        FourthransactionBalanceLabel = new JLabel();
        FifththransactionBalanceLabel = new JLabel();
        FirstAfterTransactionBalanceLabel = new JLabel();
        SecondAfterTransactionBalanceLabel = new JLabel();
        ThirdAfterTransactionBalanceLabel = new JLabel();
        FourthAfterTransactionBalanceLabel = new JLabel();
        FifthAfterTransactionBalanceLabel = new JLabel();
        FirstTypeTransactionBalanceLabel = new JLabel();
        SecondTypeTransactionBalanceLabel = new JLabel();
        ThirdTypeTransactionBalanceLabel = new JLabel();
        FourthTypeTransactionBalanceLabel = new JLabel();
        FifthTypeTransactionBalanceLabel = new JLabel();
        his1= new JLabel();
        his2= new JLabel();
        his3= new JLabel();
        his4= new JLabel();
        his5= new JLabel();
        
        lastTransactionButton = new JButton("See Transaction");

        clientName = new JLabel(atm1.c.getName());
        balanceLabel = new JLabel();

        BalanceText = new JTextField();

        depositButton = new JButton("Do deposit");
        withdrawButton = new JButton("Do withdraw");

        clientButton = new JButton("GetBalance");
        withdraw100 = new JButton("100");
        withdraw500 = new JButton("500");
        withdraw1000 = new JButton("1000");
        withdraw2000 = new JButton("2000");
        withdraw3000 = new JButton("3000");
        withdraw4000 = new JButton("4000");
        withdraw5000 = new JButton("5000");
        withdraw10000 = new JButton("10000");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd ");
        
         setTitle("ATM "); 
        add(withdraw100);
        add(withdraw1000);
        add(withdraw500);
        add(withdraw10000);
        add(withdraw3000);
        add(withdraw4000);
        add(withdraw2000);
        add(withdraw100);
        add(withdraw5000);
        add(clientName);
        add(clientButton);
        add(withdrawButton);
        add(depositButton);
        add(balanceLabel);
        add(BalanceText);

        add(FirstTransactionBalanceLabel);
        add(SecondTransactionBalanceLabel);
        add(ThirdTransactionBalanceLabel);
        add(FourthransactionBalanceLabel);
        add(FifththransactionBalanceLabel);
        add(lastTransactionButton);
        add(FirstAfterTransactionBalanceLabel);
        add(SecondAfterTransactionBalanceLabel);
        add(ThirdAfterTransactionBalanceLabel);
        add(FourthAfterTransactionBalanceLabel);
        add(FifthAfterTransactionBalanceLabel);
        add(FirstTypeTransactionBalanceLabel);
        add(SecondTypeTransactionBalanceLabel);
        add(ThirdTypeTransactionBalanceLabel);
        add(FourthTypeTransactionBalanceLabel);
        add(FifthTypeTransactionBalanceLabel);
        add(his1);
         add(his2);
          add(his3);
           add(his4);
            add(his5);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
         
        this.atm = atm1;

        withdraw100.setBounds(50, 20, 85, 30);
        withdraw500.setBounds(50, 70, 85, 30);
        withdraw1000.setBounds(50, 120, 85, 30);
        withdraw2000.setBounds(50, 170, 85, 30);
        withdraw3000.setBounds(400, 20, 85, 30);
        withdraw4000.setBounds(400, 70, 85, 30);
        withdraw5000.setBounds(400, 120, 85, 30);
        withdraw10000.setBounds(400, 170, 85, 30);
        clientButton.setBounds(200, 230, 130, 30);
        depositButton.setBounds(20, 230, 120, 30);
        withdrawButton.setBounds(390, 230, 120, 30);
        clientName.setBounds(200, 40, 85, 30);
        balanceLabel.setBounds(200, 160, 85, 30);
        BalanceText.setBounds(200, 120, 85, 30);
        FirstTransactionBalanceLabel.setBounds(560, 20, 85, 30);
        SecondTransactionBalanceLabel.setBounds(560, 70, 85, 30);
        ThirdTransactionBalanceLabel.setBounds(560, 120, 85, 30);
        FourthransactionBalanceLabel.setBounds(560, 170, 85, 30);
        FifththransactionBalanceLabel.setBounds(560, 220, 85, 30);

        lastTransactionButton.setBounds(200, 270, 130, 30);
        FirstAfterTransactionBalanceLabel.setBounds(660, 20, 85, 30);
        SecondAfterTransactionBalanceLabel.setBounds(660, 70, 85, 30);
        ThirdAfterTransactionBalanceLabel.setBounds(660, 120, 85, 30);
        FourthAfterTransactionBalanceLabel.setBounds(660, 170, 85, 30);
        FifthAfterTransactionBalanceLabel.setBounds(660, 220, 85, 30);
        FirstTypeTransactionBalanceLabel.setBounds(760, 20, 85, 30);
        SecondTypeTransactionBalanceLabel.setBounds(760, 70, 85, 30);
        ThirdTypeTransactionBalanceLabel.setBounds(760, 120, 85, 30);
        FourthTypeTransactionBalanceLabel.setBounds(760, 170, 85, 30);
        FifthTypeTransactionBalanceLabel.setBounds(760, 220, 85, 30); 
        his1.setBounds(900,20,300,30);
         his2.setBounds(900,70,300,30);
          his3.setBounds(900,120,300,30);
           his4.setBounds(900,170,300,30);
            his5.setBounds(900,220,300,30);
            

        clientButton.addActionListener(this);
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        withdraw100.addActionListener(this);
        withdraw500.addActionListener(this);
        withdraw1000.addActionListener(this);
        withdraw2000.addActionListener(this);
        withdraw3000.addActionListener(this);
        withdraw4000.addActionListener(this);
        withdraw5000.addActionListener(this);
        withdraw10000.addActionListener(this);
        lastTransactionButton.addActionListener(this);

    }

    public int editcount(int c) {
        count = c;
        if (count > 4) {
            count = 0;

        }
        return count;

    }

    @Override
    public void actionPerformed(ActionEvent m) {
        String temp;

        if (clientButton == m.getSource()) {
            temp = atm.c.getBalance();
            balanceLabel.setText(temp);

        }

        if (withdrawButton == m.getSource()) {

            if (!"".equals(BalanceText.getText())) {
                atm.setWithdraw(BalanceText.getText());
                try {

                    if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt(atm.getWithdraw())) {
                        beforeTransaction[editcount(count)] = atm.c.getBalance();
                        temp = atm.Dowithdraw();

                        balanceLabel.setText(temp);
                        atm.c.setBalance(temp); 
                        
                        
                        
                        typeTransaction[editcount(count)] = "Withdraw";
                        afterTransaction[editcount(count)] = atm.c.getBalance();
                        h[editcount(count)]= current;
                        
                        
                        

                        count++; 
                        BalanceText.setText("");
                    }
                 

                
             else 
                    {  JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
                    BalanceText.setText("");
                    
                    }
            
        } catch  (NumberFormatException gg)
        {  JOptionPane.showMessageDialog(null, " sorry ... you must input number in text ");  
         BalanceText.setText("");
        }} else 
                 JOptionPane.showMessageDialog(null, " sorry ... you must input  somethig !  ");
         BalanceText.setText("");}

        if (depositButton == m.getSource()) {

            if (!"".equals(BalanceText.getText())) {
                beforeTransaction[editcount(count)] = atm.c.getBalance();
                atm.setDeposit(BalanceText.getText()); 
                try {
                temp = atm.DoDeposit();
                balanceLabel.setText(temp);
                typeTransaction[editcount(count)] = "Deposit";
                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;

                count++; 
                 BalanceText.setText("");} 
                catch  (NumberFormatException gg)
        {  JOptionPane.showMessageDialog(null, " sorry ... you must input number in text "); 
         BalanceText.setText("");
        }
                

            }else  {
                JOptionPane.showMessageDialog(null, " sorry ... you must input some thing  ");
                 BalanceText.setText("");
            }
        }

        if (withdraw100 == m.getSource()) {
            atm.setWithdraw("100");

            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("100")) {

                beforeTransaction[editcount(count)] = atm.c.getBalance();
                temp = atm.Dowithdraw();
                balanceLabel.setText(temp);
                typeTransaction[editcount(count)] = "Withdraw";

                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;

                count++;

            } else {
                JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
            }

        }

        if (withdraw500 == m.getSource()) {
            atm.setWithdraw("500");
            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("500")) {
                temp = atm.Dowithdraw();
                beforeTransaction[editcount(count)] = atm.c.getBalance();
                typeTransaction[editcount(count)] = "Withdraw";
                balanceLabel.setText(temp);
                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;

                count++;

            } else {
                JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
            }
        }

        if (withdraw1000 == m.getSource()) {
            atm.setWithdraw("1000");
            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("1000")) {

                beforeTransaction[editcount(count)] = atm.c.getBalance();
                temp = atm.Dowithdraw();
                balanceLabel.setText(temp);
                typeTransaction[editcount(count)] = "Withdraw";
                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;

                count++;

            } else {
                JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
            }
        }

        if (withdraw2000 == m.getSource()) {
            atm.setWithdraw("2000");
            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("2000")) {

                beforeTransaction[editcount(count)] = atm.c.getBalance();
                typeTransaction[editcount(count)] = "Withdraw";
                temp = atm.Dowithdraw();
                balanceLabel.setText(temp);

                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;

                count++;
            } else {
                JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
            }
        }

        if (withdraw5000 == m.getSource()) {
            atm.setWithdraw("5000");
            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("5000")) {
                beforeTransaction[editcount(count)] = atm.c.getBalance();
                typeTransaction[editcount(count)] = "Withdraw";
                temp = atm.Dowithdraw();
                balanceLabel.setText(temp);

                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;

                count++;

            }
            JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
        }

        if (withdraw3000 == m.getSource()) {
            atm.setWithdraw("3000");
            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("3000")) {
                beforeTransaction[editcount(count)] = atm.c.getBalance();

                temp = atm.Dowithdraw();
                typeTransaction[editcount(count)] = "Withdraw";
                balanceLabel.setText(temp);

                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;

                count++;

            }
            JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
        }

        if (withdraw4000 == m.getSource()) {
            atm.setWithdraw("4000");
            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("4000")) {
                beforeTransaction[editcount(count)] = atm.c.getBalance();
                temp = atm.Dowithdraw();
                balanceLabel.setText(temp);
                typeTransaction[editcount(count)] = "Withdraw";

                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;
                count++;
                

            } else {
                JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");
            }

        }
        if (withdraw10000 == m.getSource()) {
            atm.setWithdraw("10000");
            if (Integer.parseInt(atm.c.getBalance()) > Integer.parseInt("Withdraw")) {
                beforeTransaction[editcount(count)] = atm.c.getBalance();
                temp = atm.Dowithdraw();
                typeTransaction[editcount(count)] = "Withdraw";
                balanceLabel.setText(temp);

                atm.c.setBalance(temp);
                afterTransaction[editcount(count)] = atm.c.getBalance();
                h[editcount(count)]= current;
                count++;

            }
            JOptionPane.showMessageDialog(null, "sorry..Your balance is not enough");

        }

        if (lastTransactionButton == m.getSource()) {
            FirstTransactionBalanceLabel.setText(beforeTransaction[0]);
            SecondTransactionBalanceLabel.setText(beforeTransaction[1]);
            ThirdTransactionBalanceLabel.setText(beforeTransaction[2]);
            FourthransactionBalanceLabel.setText(beforeTransaction[3]);
            FifththransactionBalanceLabel.setText(beforeTransaction[4]);
            FirstAfterTransactionBalanceLabel.setText(afterTransaction[0]);
            SecondAfterTransactionBalanceLabel.setText(afterTransaction[1]);
            ThirdAfterTransactionBalanceLabel.setText(afterTransaction[2]);
            FourthAfterTransactionBalanceLabel.setText(afterTransaction[3]);
            FifthAfterTransactionBalanceLabel.setText(afterTransaction[4]);
            FirstTypeTransactionBalanceLabel.setText(typeTransaction[0]);
            SecondTypeTransactionBalanceLabel.setText(typeTransaction[1]);
            ThirdTypeTransactionBalanceLabel.setText(typeTransaction[2]);
            FourthTypeTransactionBalanceLabel.setText(typeTransaction[3] );
            FifthTypeTransactionBalanceLabel.setText(typeTransaction[4]);
            if(h[0] != null)
                
            his1.setText(dateFormat.format(h[0]));
            if(h[1] != null)
            
            his2.setText(dateFormat.format(h[1]));
            if(h[2] != null)
            his3.setText(dateFormat.format(h[2]));
            if(h[3] != null)
            his4.setText(dateFormat.format(h[3]));
            if(h[4] != null)
            his5.setText(dateFormat.format(h[4]));
            
            
            

    }

}
}