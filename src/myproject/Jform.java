/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.PasswordField;

import javax.swing.*;

 
/**
 *
 * @author WAGDY 7
 */
public  class Jform  extends JFrame  implements ActionListener
{  


   
 
    Client[] clients = { new Client("ahmeed", "800", "1234",4,"ad","fadsf"), 
                          new Client ("ahmeed", "800", "123",4,"ad","fadsf")}; 
    
    
   Atm atm1=new Atm("0", "0", null);
   
    
   
 
  
  
    private  JLabel passLabel ; 
    private  JLabel messageLabel ;
    private final JPasswordField passwordTextField;
    
    private JButton OKButton;
    private final JButton  number1;
    private final JButton  number2;
    private final JButton number3;
    private final JButton number4;
    private final JButton number5;
    private final JButton number6;
    private final JButton number7;
    private final JButton number8;
    private final JButton number9; 
     private final JButton number0; 
      private final JLabel passwordLabel;
      private final JPanel panel;
         private final JPanel panel2;
      
    String pass ; 
    
                                   
                                    
    private String stareName ;

    public Jform()
    { 
        setLayout(null);
       setSize(500,500);
       passLabel=new JLabel();
          messageLabel=new JLabel();
        
       number1 = new JButton("1");
       number2 = new JButton("2");
       number3 = new JButton("3");
       number4 = new JButton("4");
       number5 = new JButton("5");
       number6 = new JButton("6");
       number7 = new JButton("7");
       number8 = new JButton("8");
       number9 = new JButton("9");
       number0 = new JButton("0");
       OKButton = new JButton("OK");
       panel = new JPanel();
       panel2=new JPanel(); 
       
       passwordLabel=new JLabel(" Enter Password:");
       
       passwordTextField  =new JPasswordField(); 
       passLabel = new JLabel(); 
       number1.setFont(new Font("1",Font.ROMAN_BASELINE,20));
        number2.setFont(new Font("2",Font.ROMAN_BASELINE,20));
         number3.setFont(new Font("3",Font.ROMAN_BASELINE,20));
          number4.setFont(new Font("4",Font.ROMAN_BASELINE,20));
           number5.setFont(new Font("5",Font.ROMAN_BASELINE,20));
            number6.setFont(new Font("6",Font.ROMAN_BASELINE,20));
             number7.setFont(new Font("7",Font.ROMAN_BASELINE,20));
              number8.setFont(new Font("8",Font.ROMAN_BASELINE,20));
               number9.setFont(new Font("9",Font.ROMAN_BASELINE,20));
                number0.setFont(new Font("0",Font.ROMAN_BASELINE,20));
              
       
       number1.setBounds(50,150,50,50);
       number2.setBounds(110,150,50,50);
       number3.setBounds(170,150,50,50);
       number4.setBounds(50,210,50,50);
       number5.setBounds(110,210,50,50);
       number6.setBounds(170,210,50,50);
       number7.setBounds(50,270,50,50);
       number8.setBounds(110,270,50,50);
       number9.setBounds(170,270,50,50); 
       number0.setBounds(110,330,50,50);
             passwordTextField.setBounds(50,100,130,30);
             passwordLabel.setBounds(50,60,130,30);
        passLabel.setBounds(400,400,50,30);
          OKButton.setBounds(50,400,100,50);
          messageLabel.setBounds(260,210,220,40);
          
        number9.setBounds(170,270,50,50);
        panel.setBounds(0,0,500,135);
        
        panel2.setBounds(0,135,500,365);
        
     
    
        number1.addActionListener(this);
        number2.addActionListener(this);
        number3.addActionListener(this);
        number4.addActionListener(this);
        number5.addActionListener(this);
        number6.addActionListener(this);
        number7.addActionListener(this);
        number8.addActionListener(this);
        number9.addActionListener(this);
        number0.addActionListener(this);
        OKButton.addActionListener(this);
                
       

  
      
       
       add(passwordTextField);
       add(passLabel );
    
        add(number1);
        add(number2);
        add(number3);
        add(number4);
        add(number5);
        add(number6);
        add(number7);
        add(number8);
    
        add(number9);
        
        add(number0);
                    add(panel2);
         add(OKButton);
         add(messageLabel);
         add(passwordLabel);
         passwordTextField.setEchoChar('*');
         add(panel);
         panel.setBackground(Color.ORANGE);
         panel2.setBackground(Color.LIGHT_GRAY);
           add(panel2);
         
       
                
        
    }   
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(number1==e.getSource())
        {  pass= passwordTextField.getText();
           passwordTextField.setText(pass+"1");}
        
         if(number2==e.getSource())
        {
        pass= passwordTextField.getText();
             passwordTextField.setText(pass+"2");
        
        
        }
        if(number3==e.getSource())
        {  pass= passwordTextField.getText();
             passwordTextField.setText(pass+"3");}
        if(number4==e.getSource())
        {  pass= passwordTextField.getText();
            passwordTextField.setText(pass+"4");}
        if(number5==e.getSource())
        {  pass= passwordTextField.getText();
             passwordTextField.setText(pass+"5");}
        if(number6==e.getSource())
        {  pass= passwordTextField.getText();
             passwordTextField.setText(pass+"6");}
        if(number7==e.getSource())
        {  pass= passwordTextField.getText();
            passwordTextField.setText(pass+"7");}
        if(number8==e.getSource())
        {  pass= passwordTextField.getText();
            passwordTextField.setText(pass+"8");}
        
            if(number9==e.getSource())
        {  pass= passwordTextField.getText();
                  
        
        
        
        passwordTextField.setText(pass+"9");} 
            
            if(number0==e.getSource())
        {  pass= passwordTextField.getText();
                  
        
        
        
        passwordTextField.setText(pass+"0");} 
                  if(OKButton==e.getSource())
        { 
            
            
            
            
            
            
           
            
            passLabel.setText( passwordTextField.getText()); 
        pass= passwordTextField.getText(); 
        int i=0;
        int flag=0;
        
        for(;i<clients.length;i++) 
        {
          if (pass.equals(clients[i].getPassword()))
          {  flag=1;
              break; 
             }
              
              } 
        if(flag==1)
        
          { messageLabel.setText("RightPass "+ " welcome :"+clients[i].getName());
          Jform2 form;  
          atm1.setC(clients[i]);
           
          
            form = new Jform2(atm1);
            
         form.setVisible(true);
         this.setVisible(false);}
          else 
        {  messageLabel.setText("Wrong pass"); 
            passwordTextField.setText("");
        }
            
        
        
        
        
            
    }
    } 
}
  
    
    
       
    

